package com.SpringBootClass.WebMVC2.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {

	@NotEmpty(message="Name is Manadatory")
	private String name;
	@NotEmpty(message="Email is Manadatory")
	@Email(message="Enter Valid Email ID")
	private String email;
	@NotNull(message="Phone number is Manadatory")
	private Long phno; 
}
