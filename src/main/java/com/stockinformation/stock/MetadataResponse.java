package com.stockinformation.stock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.JSONException;
import org.json.JSONObject;

public class MetadataResponse {
	
	private String information, symbol, outPutSize, timeZone;
	private LocalDateTime lastRefreshed;
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getOutPutSize() {
		return outPutSize;
	}
	public void setOutPutSize(String outPutSize) {
		this.outPutSize = outPutSize;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public LocalDateTime getLastRefreshed() {
		return lastRefreshed;
	}
	
	public void setLastRefreshed(String lastRefreshed)  {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		try {
			this.lastRefreshed = (LocalDateTime) f.parse(lastRefreshed);
		}catch (Exception e) {}
	}
	public static MetadataResponse build(JSONObject jsonObject) throws JSONException {
		MetadataResponse resp = new MetadataResponse();
		resp.setInformation(jsonObject.getString("1. Information"));
		resp.setLastRefreshed(jsonObject.getString("3. Last Refreshed"));
		resp.setOutPutSize(jsonObject.getString("5. Output Size"));
		resp.setSymbol(jsonObject.getString("2. Symbol"));
		resp.setTimeZone(jsonObject.getString("6. Time Zone"));
		return resp;
	}
}
