package com.SpringBootClass.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringBootClass.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("App Config .....Constructor");
	}
	@Bean
	public AppSecurity createInstance1() {
		return new AppSecurity("SHA-256 ");
	}
}
