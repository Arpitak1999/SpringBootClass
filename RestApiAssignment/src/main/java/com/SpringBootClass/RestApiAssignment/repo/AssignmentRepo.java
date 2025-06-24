package com.SpringBootClass.RestApiAssignment.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootClass.RestApiAssignment.binding.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Serializable> {

}
