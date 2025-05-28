package com.OneToOne;

import com.OneToOne.service.PersonPassportSvc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToOneApplication {

   

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(OneToOneApplication.class, args);
	PersonPassportSvc service=context.getBean(PersonPassportSvc.class);
	//service.savePersonWithPassport();
	service.getPerson();
	
	}

}
