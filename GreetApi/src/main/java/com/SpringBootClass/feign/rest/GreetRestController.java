package com.SpringBootClass.feign.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.feign.WelcomeApiClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
//		String msg = "Good Morning !,Welcome to the Microservices class";
//		return msg;
		String welcomeApiReponse= welcomeApiClient.invokeWelcomeApi();
		String greetApiResponse= "Good Morning";
		return greetApiResponse + " , "+ welcomeApiReponse;
	}
}
