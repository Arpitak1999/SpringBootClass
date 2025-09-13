package com.SpringBootClass.circuitbreaker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDb", name="test")
	public String getDataFromRedis() {
		
		System.out.println("***********Redis method is called**********");
		int i =10/0;
		return "Retrieve Data from Redis";
	}
	public String getDataFromDb(Throwable t) {
		System.out.println("***********DB method is called**********");
		return "Retrieve Data from DB";
	}
}
