package com.SpringBootClass.feign.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Morning !,Welcome to the Microservices class";
		return msg;
	}
}
