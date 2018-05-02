package com.stockinformation.stock;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StockData {
	
	@JsonProperty("1. open")
	public double open;
	@JsonProperty("2. high")
	public double high;
	@JsonProperty("3. low")
	public double low;
	@JsonProperty("4. close")
	public double close;
	@JsonProperty("5. volume")
	public double volume;
	
	public StockData() {
		super();
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	

}
