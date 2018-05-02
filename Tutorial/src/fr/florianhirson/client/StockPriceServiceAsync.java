package fr.florianhirson.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.florianhirson.shared.StockPrice;

public interface StockPriceServiceAsync {
	
	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
}
