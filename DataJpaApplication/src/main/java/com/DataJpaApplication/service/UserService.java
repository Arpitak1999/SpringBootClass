package com.DataJpaApplication.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.DataJpaApplication.entities.User;
import com.DataJpaApplication.repo.UserRepo;

@Service
public class UserService {

	//only 3 records will display on one page
	public static final int pageSize=3;
	
    private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	public void getAllUser() {
		Iterable<User> allUser =userRepo.findAll();
	    allUser.forEach(System.out::println);
	}
	public void getAllUserByPage(int pageNum) {
		 
		
//		List<User> userList = userRepo.findAll();
//		userList.forEach(System.out::println);
		
		//pageNum-1  for Pagination representation
		PageRequest page= PageRequest.of(pageNum-1, pageSize);
		Page<User> pageData=userRepo.findAll(page);
		//Stream<User> stream =pageData.get();
		List<User> userData = pageData.getContent();
		
	    userData.forEach(System.out::println);
	}
	
	public void usersWithSorting() {
        Sort sort = Sort.by("age").ascending();
		List<User> allRec=userRepo.findAll(sort);
		allRec.forEach(System.out::println);
	}

	
	public void getUserByQBE() {
		
		User user= new User();
		user.setGender("Male");
		user.setCountry("India");
		user.setAge(35);
		
		Example<User> example=Example.of(user);
        List<User> allByQBE=	userRepo.findAll(example);
        allByQBE.forEach(System.out::println);
	}
	public void getByGenderAndAgeGreater() {
		
		List<User> findByAge=userRepo.findByGenderAndAgeGreaterThanEqual("Male",30);
		findByAge.forEach(System.out::println);
	}

}
