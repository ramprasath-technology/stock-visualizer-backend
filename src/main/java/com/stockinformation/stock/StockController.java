package com.stockinformation.stock;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StockController {
	

	@RequestMapping("/stocks")
	public Stock GetStockInformation() {
		Stock stockObj = new Stock("MSFT","Microsoft");
		return stockObj;
	}
}
