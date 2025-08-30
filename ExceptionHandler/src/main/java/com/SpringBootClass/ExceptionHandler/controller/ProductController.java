package com.SpringBootClass.ExceptionHandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product")
	public ResponseEntity<String> products(){
		
		String msg ="Price of the product";
		String i =null;
		i.length();
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
