package com.DataJpaApplication;

import com.DataJpaApplication.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaApplication {

    private UserService userService;

    DataJpaApplication(UserService userService) {
        this.userService = userService;
    }

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(DataJpaApplication.class, args);
	
    UserService bean=context.getBean(UserService.class);
    //bean.getAllUser();
    //bean.getAllUserByPage(2);
    //bean.usersWithSorting();
//    bean.getUserByQBE();
    bean.getByGenderAndAgeGreater();
	}

}
