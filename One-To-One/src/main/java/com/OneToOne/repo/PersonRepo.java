package com.OneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
