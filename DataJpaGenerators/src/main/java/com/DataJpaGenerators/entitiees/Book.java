package com.DataJpaGenerators.entitiees;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO) //for automatic id generation but so many query are executed
	@GeneratedValue(strategy =GenerationType.SEQUENCE)//this is only for oracle database
	private Integer bookId;
	private String bookName;
	private double bookPrice;
 
}
