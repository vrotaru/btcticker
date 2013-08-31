package com.appspot.btcticker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.btcticker.enums.Currency;
import com.appspot.btcticker.fsm.GoogleCurrencyCalculator;
import com.appspot.btcticker.fsm.MtgoxTickerV2;
import com.appspot.btcticker.fsm.PathQuery;
import com.appspot.btcticker.model.Valuation;
import com.google.appengine.api.images.Image;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;

@SuppressWarnings("serial")
public class MtGoxServlet extends HttpServlet {

	private static final long BTC_INTERVAL = 15 * 60 * 1000;
	private static final long CURRENCY_INTERVAL = 30 * 60 * 1000;

	private ImageData imageData = ImageData.INSTANCE;
	private MemcacheService imageCache;

	//
	// Rates and their timestamps
	//
	private double btcRate;
	private double buyRate;
	private double sellRate;
	
	private long btcTimestamp;

	private double euroRate;
	private long euroTimestamp;

	private double poundRate;
	private long poundTimestamp;
	
	private double kroneRate;
	private long kroneTimestamp;

	@Override
	public void init() throws ServletException {
		super.init();
		
		initCache();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String pathInfo = req.getPathInfo();
		
		if (pathInfo == null) {
			resp.sendRedirect("../images/invalid-url.png");
		}

		PathQuery query = new PathQuery();
		boolean ok = query.parse(pathInfo);
		if (!ok) {
			resp.sendRedirect("../images/invalid-url.png");
			return;
		}

		double amount;
		try {
			amount = computeAmount(query);
			
			if (amount < 0 || amount > 1000 * 1000) {
				resp.sendRedirect("../images/overflow.png");
				return;
			}
			Image canvas = getTickerImage(query.to, amount);
			
			resp.setContentType("image/png");
			resp.getOutputStream().write(canvas.getImageData());
			
		} catch (Exception e) {
			resp.sendRedirect("../images/no-data.png");			
		}
	}

	private void initCache() {
		imageCache = MemcacheServiceFactory.getMemcacheService();
	}

	private void updateBitcoinValue() throws IOException {
		if (upToDate(Currency.BITCOIN)) {
			return;
		}
		// Reset imageCache
		imageCache.clearAll();

		URL url = new URL(MtgoxTickerV2.URL_V2);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String response = reader.readLine();

		reader.close();

		// update timestamp
		btcTimestamp = System.currentTimeMillis();
		Valuation valuation = MtgoxTickerV2.parse(response);
		if (valuation == null) {
			throw new RuntimeException("failed to parse: " + response);
		}
		btcRate = valuation.weightedValue();
		buyRate = valuation.buy;
		sellRate = valuation.sell;
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
		case DKK:
			return (System.currentTimeMillis() - kroneTimestamp) < CURRENCY_INTERVAL;
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
		case DKK:
			if (upToDate(Currency.DKK)) {
				return kroneRate;
			}
			gcUrl = GoogleCurrencyCalculator.DKK_URL;
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
		case DKK:
			kroneRate = rate;
			kroneTimestamp = System.currentTimeMillis();
			break;
		default:
				throw new IllegalStateException("Internal error");
		}
		return rate;
	}

	private double computeAmount(PathQuery query) throws IOException {

		updateBitcoinValue();
		final double neededRate = getBtcRate(query);

		double multiplier;
		if (query.to == Currency.BITCOIN) {
			multiplier = 1.0 / neededRate;

			double rate = getCurrencyValue(query.from);
			multiplier = multiplier / rate;
		}
		else {
			multiplier = neededRate;

			double rate = getCurrencyValue(query.to);
			multiplier = multiplier * rate;
		}

		return query.amount * multiplier;
	}
	
	private double getBtcRate(PathQuery query) {
		switch (query.rate) {
		case TICKER:
			return btcRate;
		case BUY:
			return buyRate;
		case SELL:
			return sellRate;
		default:
			throw new IllegalStateException("Unknow BTC rate type");
		}
	}

	private Image getTickerImage(Currency currency, double value) {
		String ticker = formatValue(value);
		String key = currency + ":" + ticker;

		Image image = (Image) imageCache.get(key);
		if (image != null) {
			return image;
		}

		image = imageData.makeTickerImage(currency, ticker);

		imageCache.put(key, image);
		return image;
	}

	private String formatValue(double value) {
		String formatted = String.format("%.3f", value);
		if (formatted.length() > 6) {
			formatted = formatted.substring(0, 6);
		}
		return formatted;
	}

}
