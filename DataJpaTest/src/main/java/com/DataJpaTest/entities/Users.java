package com.DataJpaTest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {
	@Id
	@Column(name = "user_id")
	private Integer uid;
	private String uname;
	private Integer age;
	private String gender;
	private String country;

}
