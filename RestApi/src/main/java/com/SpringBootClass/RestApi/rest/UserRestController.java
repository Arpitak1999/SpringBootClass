package com.SpringBootClass.RestApi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.RestApi.dto.User;

@RestController
public class UserRestController {
	@GetMapping("/user")
	public ResponseEntity<User> getUser(){
		User user = new User(101, "Raj","abc@gmail.com");
		return new ResponseEntity<>(user,HttpStatus.OK);
	}

}
