package com.SpringBootClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.bean.UserService;

@SpringBootApplication
@RestController //with
@ComponentScan(basePackages = {"app.user","com.SpringBootClass"})
public class SpringBootCourseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
//		System.out.println(context.getBeanDefinitionCount());
//		System.out.println(context.getClass().getName());
        UserService bean = context.getBean(UserService.class);
        bean.printName(100);
	}
	@GetMapping("/")
	public String getMsg(){
		return "Welcome to Spring Course and microservices";
		
	}
	@Bean
	public AppSecurity createInstance() {
		return new AppSecurity("SHA-256");
	}

}
