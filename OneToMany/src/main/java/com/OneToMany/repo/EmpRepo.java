package com.OneToMany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
