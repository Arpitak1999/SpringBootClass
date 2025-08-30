package com.SpringBootClass.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.props.ApplicationProps;

@RestController
@RequestMapping("/api")
public class MsgController {
	
	@Autowired
	private ApplicationProps appProps;
	
	@GetMapping(value = "/greet/{name}")
	public ResponseEntity<String> getGreetMsg(@PathVariable String name){
	    
		Map<String,String> messages=appProps.getMessages();
	    
	    System.out.println(messages);
					
		String welcomeMsg=messages.get("greet");
		
		String msg =name +" "+ welcomeMsg;
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
