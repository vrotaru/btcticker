package com.appspot.btcticker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.appspot.btcticker.enums.Currency;
import com.appspot.btcticker.fsm.BtcETickerV2;
import com.appspot.btcticker.model.Valuation;

@SuppressWarnings("serial")
public class BtcEServlet extends TickerServlet {

    protected void updateBitcoinValue() throws IOException {
        if (upToDate(Currency.BITCOIN)) {
            return;
        }
        // Reset imageCache
        imageCache.clearAll();

        URL url = new URL(BtcETickerV2.URL_V2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                url.openStream()));
        String response = reader.readLine();

        reader.close();

        // update timestamp
        btcTimestamp = System.currentTimeMillis();
        Valuation valuation = BtcETickerV2.parse(response);
        if (valuation == null) {
            throw new RuntimeException("failed to parse: " + response);
        }
        btcRate = valuation.weightedValue();
        buyRate = valuation.buy;
        sellRate = valuation.sell;
    }
}
