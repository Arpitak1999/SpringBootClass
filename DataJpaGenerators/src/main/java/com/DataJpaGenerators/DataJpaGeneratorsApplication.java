package com.DataJpaGenerators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DataJpaGenerators.service.BookService;

@SpringBootApplication
public class DataJpaGeneratorsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(DataJpaGeneratorsApplication.class, args);
	
	BookService bookService=  context.getBean(BookService.class);
	bookService.saveBook();
	
	}

}
