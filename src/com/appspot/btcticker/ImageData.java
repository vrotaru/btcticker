package com.appspot.btcticker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.appspot.btcticker.enums.Currency;
import com.google.appengine.api.images.Composite;
import com.google.appengine.api.images.Composite.Anchor;
import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.Transform;

public class ImageData {
    private static final long BG_COLOR = 0x80E5E5E5L;
    private static final int MAX_W = 200;
    private static final int H = 20;

    private Image[] digits;
    private Image dot;
    private Image[] currencies;
    private ImagesService imagesService;

    public static ImageData INSTANCE = new ImageData();

    public ImageData() {
        this.digits = new Image[10];
        this.currencies = new Image[Currency.values().length];

        loadImages();
    }

    void loadImages() {
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
            currencies[Currency.DOLLAR.ordinal()] = cut(symbols, offset,
                    offset + 11);
            offset = offset + 11;

            currencies[Currency.POUND.ordinal()] = cut(symbols, offset,
                    offset + 11);
            offset = offset + 11;

            currencies[Currency.EURO.ordinal()] = cut(symbols, offset,
                    offset + 11);
            offset = offset + 11;

            // Quick hack
            currencies[Currency.DKK.ordinal()] = cut(symbols, offset - 1,
                    offset + 1);

            dot = cut(symbols, offset + 4, symbols.getWidth());

            // the bitcoin image is an separate file
            Image bitcoin = getImage("btc.png");
            currencies[Currency.BITCOIN.ordinal()] = bitcoin;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Image makeTickerImage(Currency currency, String ticker) {
        Image symbol = currencies[currency.ordinal()];

        List<Composite> composites = new ArrayList<Composite>();

        int offset = symbol.getWidth() + 3;
        for (char ch : ticker.toCharArray()) {
            Image dd = null;
            if ('.' == ch) {
                dd = dot;
            } else {
                dd = digits[ch - '0'];
            }
            composites.add(ImagesServiceFactory.makeComposite(dd, offset, 1,
                    0.75f, Anchor.TOP_LEFT));
            offset = offset + dd.getWidth();
        }

        Image bitcoin = currencies[Currency.BITCOIN.ordinal()];
        if (symbol == bitcoin) {
            composites.add(ImagesServiceFactory.makeComposite(symbol, 0, 0,
                    0.75f, Anchor.TOP_LEFT));
        } else {
            composites.add(ImagesServiceFactory.makeComposite(symbol, 1, 1,
                    0.75f, Anchor.TOP_LEFT));
        }

        Image composite = imagesService.composite(composites, MAX_W, H,
                BG_COLOR);
        Image image = cut(composite, 0, offset + 2);

        return image;
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

        Transform crop = ImagesServiceFactory.makeCrop(leftX, topY, rightX,
                bottomY);
        imagesService.applyTransform(crop, copy);

        return copy;
    }

    private Image cut(Image image, int L, int R) {
        return crop(image, L, 0, R, image.getHeight());
    }

    private static Image getImage(String filename)
            throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream("images/" + filename);

        byte[] data = new byte[inputStream.available()];
        inputStream.read(data);
        inputStream.close();

        return ImagesServiceFactory.makeImage(data);
    }
}