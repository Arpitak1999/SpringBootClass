package com.SpringBootClass.RestApiAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootClass.RestApiAssignment.binding.Assignment;
import com.SpringBootClass.RestApiAssignment.repo.AssignmentRepo;


@Service
public class AssignmentSvcImpl implements AssignmentSvc {
    @Autowired
	private AssignmentRepo assgRepo;
	@Override
	public String upsert(Assignment assg) {
		assgRepo.save(assg);
		return "success";
	}

	@Override
	public Assignment getById(Integer aid) {
		Optional<Assignment> findById= assgRepo.findById(aid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Assignment> getAllAssignments() {
		return assgRepo.findAll();
	}

	@Override
	public String deleteById(Integer aid) {
		
		if(assgRepo.existsById(aid)) {
			assgRepo.deleteById(aid);
			return "Record Deleted ";
		}else {
			return "No Record Found";
		}
	
	}

}
