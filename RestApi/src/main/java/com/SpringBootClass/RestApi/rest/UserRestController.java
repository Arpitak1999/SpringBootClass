package com.SpringBootClass.RestApi.rest;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.RestApi.dto.User;

@RestController
public class UserRestController {
	@DeleteMapping(value = "/user/{userId}", produces="text/plain")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
        //System.out.println(user);
		String msg= "User deleted";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	@PutMapping(value = "/user/{userId}", consumes = {"application/json","application/xml"}, produces="text/plain")
	public ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable Integer userId){
        System.out.println(user);
		String msg= "User Updated";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	@PostMapping(value = "/user", consumes = {"application/json","application/xml"}, produces="text/plain")
	public ResponseEntity<String> createUser(@RequestBody User user){
        System.out.println(user);
		String msg= "User Created";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	//@GetMapping("/user")
	@GetMapping(value = "/user", produces={"application/json","application/xml"})
	public ResponseEntity<User> getUser(){
		User user = new User(101, "Raj","abc@gmail.com");
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
//	@GetMapping("/users")  we can write  like this or like below
	@GetMapping(value="/users", produces ={"application/json","application/xml"})
//	@GetMapping(value="/users", produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<User>> getUsers(){
	User u1 = new User(101,"Raj","abc@gmail.com");
	User u2 = new User(102,"Raj1","abc@gmail.com");
	User u3 = new User(103,"Raj2","abc@gmail.com");
	List<User> userList = Arrays.asList(u1,u2,u3);
	return new ResponseEntity<>(userList,HttpStatus.OK);
}
}
