package com.SpringBootClass.RestApi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
///@RequestMapping("/test") optional
public class MyRestController {
	@GetMapping("/welcome")
	public String welcomeMsg(@RequestParam("name") String name) {
		String msg ="Welcome to REST API class";
		return msg;
	}
	
	@GetMapping(value="/greet/{name}",produces = "text/plain")
	public String greetMsg(@PathVariable("name") String name) {
		String msg= "Good Morning!!";
		return msg;
	}
	@GetMapping("/greet1")
	public ResponseEntity<String> greetMsg1() {
		String msg ="Good Morning!!";
			return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

}
