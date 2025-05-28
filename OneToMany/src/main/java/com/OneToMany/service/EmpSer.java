package com.OneToMany.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OneToMany.OneToManyApplication;
import com.OneToMany.entities.Address;
import com.OneToMany.entities.Employee;
import com.OneToMany.repo.EmpRepo;

@Service
public class EmpSer {

    
	
	@Autowired
	private EmpRepo empRepo;
	
	
	public void saveEmpWithAdd() {
		Address a1 = new Address();
		a1.setState("UP");
		a1.setCity("CNB");
		a1.setCountry("India");
		a1.setType("Home");
		
		
		Address a2 = new Address();
		a2.setState("HR");
		a2.setCity("GGN");
		a2.setCountry("India");
		a2.setType("Present");
		
		Employee e = new Employee();
		e.setEmpName("AK");
		e.setEmpSalary(10000.99);
		
		
		//associating emp obj with add
		a1.setEmp(e);
		a2.setEmp(e);
		
		//associating add obj with emp obj
		e.setAddList(Arrays.asList(a1,a2));
		
		//save record
		
		empRepo.save(e);
		
		System.out.println("employee saved");
	}
		
	public void getEmp() {
		empRepo.findById(1);
	}

}
