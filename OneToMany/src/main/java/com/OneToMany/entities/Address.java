package com.OneToMany.entities;

	import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer addId;
	
	private String state;
	private String city;
	private String country;
	private String type;
	@ManyToOne
	@JoinColumn(name ="emp_id")
   private Employee emp;	
}
