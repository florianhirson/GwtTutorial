package fr.florianhirson.client;

import java.io.Serializable;

public class DelistedException extends Exception implements Serializable {

	private static final long serialVersionUID = 7787914752073150714L;

	private String symbol;

	public DelistedException() {
	}

	public DelistedException(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return this.symbol;
	}
}
