package com.SpringBootClass.myRunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("Application Runner Executed");
	}

}
