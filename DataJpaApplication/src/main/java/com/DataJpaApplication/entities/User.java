package com.DataJpaApplication.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
	@Id
	@Column(name = "user_id")
	private Integer uid;
	private String uname;
	private Integer age;
	private String gender;
	private String country;

}
