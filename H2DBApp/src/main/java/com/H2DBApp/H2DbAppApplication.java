package com.H2DBApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.H2DBApp.entity.Product;
import com.H2DBApp.service.ProductSvc;

@SpringBootApplication
public class H2DbAppApplication {

	public static void main(String[] args) { 
	ConfigurableApplicationContext db=	SpringApplication.run(H2DbAppApplication.class, args);
	ProductSvc prod = db.getBean(ProductSvc.class);
	
	prod.saveProduct();
	}

}
