package com.MultipleDB.db2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer penId;
	private String penName;
	private Double penPrice;
	
	

}
