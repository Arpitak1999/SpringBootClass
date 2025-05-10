package com.SpringBootClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootClass.entitiees.MasterEntity;
import com.SpringBootClass.repository.ContactMasterRepo;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(DataJpaApplication.class, args);
		ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		
		
		MasterEntity entity =new MasterEntity();
		entity.setContactId(101);
		entity.setContactName("Arpita");
		entity.setContactNum(90908080899L);
		bean.save(entity);
		
		context.close();
	}

}
