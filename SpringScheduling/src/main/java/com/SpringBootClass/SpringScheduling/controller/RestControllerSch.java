package com.SpringBootClass.SpringScheduling.controller;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerSch {

	@GetMapping("/msg")
	public String getMsg() {
		return "Hello Scheduller";
	}
//	@Scheduled(fixedRate = 1000)
//	public void m1() {
//		System.out.println("m1 is executed succesfully ::"+ LocalDateTime.now());
//	}
	@Scheduled(fixedDelay = 1000)
	public void m2() {
		System.out.println("m2 is executed succesfully ::"+ LocalDateTime.now());
	}
}
