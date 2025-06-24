package com.SpringBootClass.RestApiAssignment.rest;

import java.net.http.HttpClient;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootClass.RestApiAssignment.binding.Assignment;
import com.SpringBootClass.RestApiAssignment.service.AssignmentSvc;

@RestController
public class AssignmentRestController {
	@Autowired
	private AssignmentSvc assgSvc;
	
	@PostMapping("/assignment")
	public ResponseEntity<String> addAssignment(@RequestBody Assignment assg){
		String status = assgSvc.upsert(assg);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/assignment/{aid}")
	public ResponseEntity<Assignment> getAssignment(@PathVariable Integer aid){
		Assignment assg= assgSvc.getById(aid);
		return new ResponseEntity<>(assg,HttpStatus.OK);
		
	}
	@GetMapping("/assignments")
	public ResponseEntity<List<Assignment>> getAllAssignment(Assignment assg){
		List<Assignment> allAssign = assgSvc.getAllAssignments();
		return new ResponseEntity<>(allAssign,HttpStatus.OK);
	}
	@PutMapping("/assignment")
	public ResponseEntity<String> updateAssignment(@RequestBody Assignment assg){
		String status = assgSvc.upsert(assg);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	@DeleteMapping("/assignment/{aid}")
	public ResponseEntity<String> deleteAssignment(@PathVariable Integer aid){
		String sts= assgSvc.deleteById(aid);
		return new ResponseEntity<>(sts,HttpStatus.OK);
		
	}
}
