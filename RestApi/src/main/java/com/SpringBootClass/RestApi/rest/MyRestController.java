package com.SpringBootClass.RestApi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
///@RequestMapping("/test") optional
public class MyRestController {
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg ="Welcome to REST API class";
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg= "Good Morning!!";
		return msg;
	}
	@GetMapping("/greet1")
	public ResponseEntity<String> greetMsg1() {
		String msg ="Good Morning!!";
			return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

}
