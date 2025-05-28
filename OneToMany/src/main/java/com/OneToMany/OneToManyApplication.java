package com.OneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.OneToMany.entities.Employee;
import com.OneToMany.service.EmpSer;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToManyApplication.class, args);
		EmpSer bean = context.getBean(EmpSer.class);
		//bean.saveEmpWithAdd();
			bean.getEmp();
	}

}
