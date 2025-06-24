package com.SpringBootClass.WebMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@GetMapping("/greet")
	@ResponseBody
	//http://localhost:8080/greet?name=ak
	public String greetMsg(@RequestParam("name") String name) {
		
		String msg =name + ", Good Morning !!";
		return msg;
	}
	@GetMapping("/details")
	@ResponseBody
	public String getDetails(@RequestParam("c") String course, @RequestParam("t")String trainer) {
		String msg= course + " by "+ trainer + " will going to start soon.";
		return msg;
	}
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String welcomeMsg(@PathVariable("name") String name) {
		String msg = name + " Welcome to the page";
		return msg;
		
	}
	@GetMapping("/welcome2/{name}/{i}/{j}")
	@ResponseBody
	public String welcomeMsg2(@PathVariable("name") String name,
			                  @PathVariable("i") String i,
			                  @PathVariable("j") String j) {
		String msg = name +" " +i+" "+ j  + " Welcome to the page";
		return msg;
		
	}

}
