package fr.florianhirson.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.florianhirson.shared.StockPrice;


@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService {

  StockPrice[] getPrices(String[] symbols) throws DelistedException;
}
