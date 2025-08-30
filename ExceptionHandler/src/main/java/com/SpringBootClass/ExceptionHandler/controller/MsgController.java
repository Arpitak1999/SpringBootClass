package com.SpringBootClass.ExceptionHandler.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.ExceptionHandler.ApplicationProps;
import com.SpringBootClass.ExceptionHandler.ExInfo;


@RestController
@RequestMapping("/app")
public class MsgController {

	@Autowired
	private ApplicationProps appProps;

//	
//	@Value("${api.messages.welcome}")
//	private String welcomeMsg;
	
//	@GetMapping("/welcome")
//	public ResponseEntity<String> welcomeMsg() {
//		//String msg ="Welcome to REST API class";
//		String msg = welcomeMsg;
//		//int i = 10/0;
//		return new ResponseEntity<>(msg,HttpStatus.OK);
//	}
//	@ExceptionHandler(exception= Exception.class)
//	public ResponseEntity<ExInfo> handleRx(Exception e){
//		ExInfo exInfo =new ExInfo();
//		exInfo.setExCode("EX00001");
//		exInfo.setExMsg(e.getMessage());
//		exInfo.setExDate(LocalDateTime.now());
//		
//		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
//	@GetMapping(value="/greet")
//	public ResponseEntity<String> greetMsg() {
//		String msg= "Good Morning!!";
//		String s=null;
//		s.length();
//		return new ResponseEntity<>(msg,HttpStatus.OK);
//	}
	
	@GetMapping(value = "/greet")
	public ResponseEntity<String> getGreetMsg(){
	    
		Map<String,String> messages=appProps.getMessages();
	    
	    System.out.println(messages);
					
		String welcomeMsg=messages.get("greet");
		
		String msg = welcomeMsg;
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
