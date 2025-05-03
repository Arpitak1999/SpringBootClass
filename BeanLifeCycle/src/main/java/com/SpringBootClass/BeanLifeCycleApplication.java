package com.SpringBootClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootClass.bean.Motor;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(BeanLifeCycleApplication.class, args);
		
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
	}

}
