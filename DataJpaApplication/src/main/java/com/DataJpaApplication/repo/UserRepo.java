package com.DataJpaApplication.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.DataJpaApplication.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

	public List<User> findByGenderAndAgeGreaterThanEqual(String gender,Integer age);

}
