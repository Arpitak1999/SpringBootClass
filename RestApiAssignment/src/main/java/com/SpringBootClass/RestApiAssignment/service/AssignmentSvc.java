package com.SpringBootClass.RestApiAssignment.service;

import java.util.List;

import com.SpringBootClass.RestApiAssignment.binding.Assignment;

public interface AssignmentSvc {
	
	public String upsert(Assignment assg) ;
	
	public Assignment getById(Integer aid);
	
	public List<Assignment> getAllAssignments();
	
	public String deleteById(Integer aid);

}
