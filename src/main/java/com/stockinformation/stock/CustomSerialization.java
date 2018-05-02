package com.stockinformation.stock;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CustomSerialization extends JsonDeserializer<Response> {

	@Override
	public Response deserialize(JsonParser jp, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		ObjectNode obj = jp.readValueAsTree();
		try {
			JSONObject jobj = new JSONObject(obj.toString());
			return Response.build(jobj);			
		} catch(Exception e) {
			// TODO log
			e.printStackTrace();
		}
		return null;
	}

}
