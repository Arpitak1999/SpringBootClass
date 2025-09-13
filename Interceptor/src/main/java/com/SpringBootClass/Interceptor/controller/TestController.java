package com.SpringBootClass.Interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test() {
		System.out.println("Controller is executed");
		return "this is for test";
	}
	
}
