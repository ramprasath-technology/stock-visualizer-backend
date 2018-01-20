package com.stockinformation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.stockinformation.app","com.stockinformation.stock"})
public class StockInformationApp {

	public static void main(String[] args) {
		SpringApplication.run(StockInformationApp.class, args);
	}
}
