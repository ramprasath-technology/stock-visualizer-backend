package com.stockinformation.app;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.stockinformation.stock.Response;




@SpringBootApplication
@ComponentScan(basePackages = {"com.stockinformation.app","com.stockinformation.stock"})
public class StockInformationApp{

	public static final Logger log = LoggerFactory.getLogger(StockInformationApp.class);
	
	public static void main(String[] args) {
		SpringApplication.run(StockInformationApp.class, args);
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> params = new HashMap<String, String>();
	    params.put("_function", "TIME_SERIES_INTRADAY");
	    params.put("_symbol", "MSFT");
	    params.put("_interval", "1min");
	    params.put("_apikey", "RFW0RTBM03V77L55");
	    
	    ResponseEntity<Response> responseEntity = restTemplate.getForEntity("https://www.alphavantage.co/query?apikey={_apikey}&function={_function}&symbol={_symbol}&interval={_interval}", Response.class, params);
	    //log.info("aa", responseEntity.getBody().getMetadata().getInformation());
	}

	}
