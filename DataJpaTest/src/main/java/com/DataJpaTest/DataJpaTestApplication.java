package com.DataJpaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DataJpaTest.service.UsersService;

@SpringBootApplication
public class DataJpaTestApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context=	SpringApplication.run(DataJpaTestApplication.class, args);
	
	UsersService userService =context.getBean(UsersService.class);
	
	//userService.saveUser();
	//userService.saveUsers();
	//userService.getUserById();
	//userService.getMultipleUserById();
	//userService.getAllUser();
	//userService.existById();
	//userService.deleteUser();
	//userService.getUserByGender();
	//userService.getUserByCountry();
	//userService.getUserByAge();
	//userService.getAllUserByHQL();
	userService.deleteByHQL();
	}

}
