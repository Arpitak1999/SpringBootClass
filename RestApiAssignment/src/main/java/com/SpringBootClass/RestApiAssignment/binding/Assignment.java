package com.SpringBootClass.RestApiAssignment.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
public class Assignment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;
	private String name;
	private String assignmentName;
	private String email;
	
}
