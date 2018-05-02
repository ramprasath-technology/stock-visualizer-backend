package com.stockinformation.stock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using=CustomSerialization.class)
public class Response {
	
	
	private MetadataResponse metadata;
	private List<TimeSeriesResponse> timeSeries;
	
	public Response() {
		super();
	}

	public List<TimeSeriesResponse> getTimeSeries() {
		return timeSeries;
	}

	public void setTimeSeries(List<TimeSeriesResponse> timeSeries) {
		this.timeSeries = timeSeries;
	}

	public MetadataResponse getMetadata() {
		return metadata;
	}

	public void setMetadata(MetadataResponse metadata) {
		this.metadata = metadata;
	}
	
	@SuppressWarnings("unchecked")
	public static Response build(JSONObject raw) throws JSONException {
		Response resp = new Response();
		resp.setMetadata(MetadataResponse.build(raw.getJSONObject("Meta Data")));
		JSONObject timeSeries = raw.getJSONObject("Time Series (1min)");
		Iterator<String> iter = (Iterator<String>)timeSeries.keys();
		List<TimeSeriesResponse> finalList = new ArrayList<>();
		while(iter.hasNext()) {
			String timeStamp = iter.next();
			JSONObject timeSeriesObj = timeSeries.getJSONObject(timeStamp);
			finalList.add(TimeSeriesResponse.build(timeStamp, timeSeriesObj));
		}
		resp.setTimeSeries(finalList);
		return resp;
	}
	

}
