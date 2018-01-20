package com.stockinformation.stock;

public class Stock {
	private String symbol;
	private String name;
	
	public Stock() {
		super();
	}
	
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		symbol = symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		name = name;
	}
	
}
