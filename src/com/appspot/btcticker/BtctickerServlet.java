package com.appspot.btcticker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.btcticker.enums.Currency;
import com.appspot.btcticker.fsm.GoogleCurrencyCalculator;
import com.appspot.btcticker.fsm.MtgoxTickerV0;
import com.appspot.btcticker.fsm.PathQuery;
import com.google.appengine.api.images.Composite;
import com.google.appengine.api.images.Composite.Anchor;
import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.Transform;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;

@SuppressWarnings("serial")
public class BtctickerServlet extends HttpServlet {

	private static final long BG_COLOR = 0xFFE5E5E5L;
	private static final int MAX_W = 200;
	private static final int H = 20;

	private static final long BTC_INTERVAL = 15 * 60 * 1000;
	private static final long CURRENCY_INTERVAL = 30 * 60 * 1000;

	private ImagesService imagesService;

	//
	// Images used to compose the ticker
	//
	private Image[] digits = new Image[10];
	private Image dot;
	private Image[] currencies = new Image[Currency.values().length];

	private MemcacheService imageCache;

	//
	// Rates and their timestamps
	//
	private double btcRate;
	private long btcTimestamp;

	private double euroRate;
	private long euroTimestamp;

	private double poundRate;
	private long poundTimestamp;

	@Override
	public void init() throws ServletException {
		super.init();

		loadImages();
		initCache();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String pathInfo = req.getPathInfo();

		PathQuery query = new PathQuery();
		boolean ok = query.parse(pathInfo);
		if (!ok) {
			resp.sendRedirect("../images/invalid-url.png");
			return;
		}

		double amount = computeAmount(query);

		if (amount < 0 || amount > 1000 * 1000) {
			resp.sendRedirect("../images/overflow.png");
			return;
		}

		Image canvas = getTickerImage(query.to, amount);

		resp.setContentType("image/png");
		resp.getOutputStream().write(canvas.getImageData());
	}

	private void loadImages() throws ServletException {
		try {
			imagesService = ImagesServiceFactory.getImagesService();

			// Load/create digit images
			Image symbols = getImage("symbols.png");
			int offset = 0;
			for (int i = 0; i < 10; ++i) {
				digits[i] = cut(symbols, offset, offset + 11);
				offset = offset + 11;
			}

			// Load/create currency images
			currencies[Currency.DOLLAR.ordinal()] = cut(symbols, offset, offset + 11);
			offset = offset + 11;

			currencies[Currency.POUND.ordinal()] = cut(symbols, offset, offset + 11);
			offset = offset + 11;

			currencies[Currency.EURO.ordinal()] = cut(symbols, offset, offset + 11);
			offset = offset + 11;

			dot = cut(symbols, offset + 4, symbols.getWidth());

			// the bitcoin image is an separate file
			Image bitcoin = getImage("btc.png");
			currencies[Currency.BITCOIN.ordinal()] = bitcoin;

		} catch (IOException e) {
			throw new ServletException(e);
		}
	}

	private void initCache() {
		imageCache = MemcacheServiceFactory.getMemcacheService();
	}

	private void updateBitcoinValue() throws IOException {
		if (upToDate(Currency.BITCOIN)) {
			return;
		}

		MtgoxTickerV0 tickerV0 = new MtgoxTickerV0();
//		URL url = new URL(TickerV0.URL_V0);
//
//		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
//		String response = reader.readLine();

//		reader.close();
		String response = "{\"ticker\":{\"high\":6.49998,\"low\":6.03,\"avg\":6.271624341,\"vwap\":6.27183551,\"vol\":60333,\"last_all\":6.271,\"last_local\":6.271,\"last\":6.271,\"buy\":6.275,\"sell\":6.30538}}";

		// update timestamp
		btcTimestamp = System.currentTimeMillis();
		btcRate = tickerV0.weightedValue(response);
	}

	private boolean upToDate(Currency currency) {
		switch (currency) {
		case DOLLAR:
			return true;
		case BITCOIN:
			return (System.currentTimeMillis() - btcTimestamp) < BTC_INTERVAL;
		case EURO:
			return (System.currentTimeMillis() - euroTimestamp) < CURRENCY_INTERVAL;
		case POUND:
			return (System.currentTimeMillis() - poundTimestamp) < CURRENCY_INTERVAL;
		default:
			throw new IllegalStateException();
		}
	}

	private double getCurrencyValue(Currency currency) throws IOException {
		String gcUrl = null;
		switch (currency) {
		case DOLLAR:
			return 1.0;
		case BITCOIN:
			return btcRate;
		case EURO:
			if (upToDate(Currency.EURO)) {
				return euroRate;
			}
			gcUrl = GoogleCurrencyCalculator.EURO_URL;
			break;
		case POUND:
			if (upToDate(Currency.POUND)) {
				return poundRate;
			}
			gcUrl = GoogleCurrencyCalculator.POUND_URL;
			break;
		}

		URL url = new URL(gcUrl);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String response = reader.readLine();

		GoogleCurrencyCalculator currencyCalculator = new GoogleCurrencyCalculator();

		double rate = currencyCalculator.extract(response);
		// update rate & timestamp
		switch (currency) {
		case EURO:
			euroRate = rate;
			euroTimestamp = System.currentTimeMillis();
			break;
		case POUND:
			poundRate = rate;
			poundTimestamp = System.currentTimeMillis();
			break;
		}
		return rate;
	}

	private double computeAmount(PathQuery query) throws IOException {

		updateBitcoinValue();

		double multiplier;
		if (query.to == Currency.BITCOIN) {
			multiplier = 1.0 / btcRate;

			double rate = getCurrencyValue(query.from);
			multiplier = multiplier / rate;
		}
		else {
			multiplier = btcRate;

			double rate = getCurrencyValue(query.to);
			multiplier = multiplier * rate;
		}

		return query.amount * multiplier;
	}

	private Image getTickerImage(Currency currency, double value) {
		String ticker = formatValue(value);
		String key = currency + ":" + ticker;

		Image image = (Image) imageCache.get(key);
		if (image != null) {
			return image;
		}

		image = makeTickerImage(currencies[currency.ordinal()], ticker);

		imageCache.put(key, image);
		return image;
	}

	private Image makeTickerImage(Image symbol, String ticker) {
		List<Composite> composites = new ArrayList<Composite>();

		int offset = symbol.getWidth() + 3;
		for (char ch : ticker.toCharArray()) {
			Image dd = null;
			if ('.' == ch) {
				dd = dot;
			}
			else {
				dd = digits[ch - '0'];
			}
			composites.add(ImagesServiceFactory.makeComposite(dd, offset, 1, 0.8f, Anchor.TOP_LEFT));
			offset = offset + dd.getWidth();
		}

		Image bitcoin = currencies[Currency.BITCOIN.ordinal()];
		if (symbol == bitcoin) {
			composites.add(ImagesServiceFactory.makeComposite(symbol, 0, 0, 0.8f, Anchor.TOP_LEFT));
		}
		else {
			composites.add(ImagesServiceFactory.makeComposite(symbol, 1, 1, 0.8f, Anchor.TOP_LEFT));
		}

		Image composite = imagesService.composite(composites, MAX_W, H, BG_COLOR);
		Image image = cut(composite, 0, offset + 2);

		return image;
	}

	private String formatValue(double value) {
		String formatted = String.format("%.3f", value);
		if (formatted.length() > 6) {
			formatted = formatted.substring(0, 6);
		}
		return formatted;
	}

	private static Image copy(Image original) {
		return ImagesServiceFactory.makeImage(original.getImageData());
	}

	private Image crop(Image original, int LX, int TY, int RX, int BY) {
		Image copy = copy(original);

		float leftX = (float) LX / original.getWidth();
		float topY = (float) TY / original.getHeight();
		float rightX = (float) RX / original.getWidth();
		float bottomY = (float) BY / original.getHeight();

		Transform crop = ImagesServiceFactory.makeCrop(leftX, topY, rightX, bottomY);
		imagesService.applyTransform(crop, copy);

		return copy;
	}

	private Image cut(Image image, int L, int R) {
		return crop(image, L, 0, R, image.getHeight());
	}

	private static Image getImage(String filename) throws FileNotFoundException, IOException {
		InputStream inputStream = new FileInputStream("images/" + filename);

		byte[] data = new byte[inputStream.available()];
		inputStream.read(data);

		return ImagesServiceFactory.makeImage(data);
	}

}
