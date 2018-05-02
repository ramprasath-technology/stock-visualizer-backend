package com.stockinformation.stock;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSeriesResponse {
	
	private String date;
	
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public static TimeSeriesResponse build(String timeStamp, JSONObject timeSeriesObj) throws JSONException {
		TimeSeriesResponse resp = new TimeSeriesResponse();
		resp.setDate(timeStamp);
		resp.setClose(timeSeriesObj.getDouble("4. close"));
		resp.setOpen(timeSeriesObj.getDouble("1. open"));
		resp.setHigh(timeSeriesObj.getDouble("2. high"));
		resp.setLow(timeSeriesObj.getDouble("3. low"));
		resp.setVolume(timeSeriesObj.getDouble("5. volume"));
		return resp;
	}
}
