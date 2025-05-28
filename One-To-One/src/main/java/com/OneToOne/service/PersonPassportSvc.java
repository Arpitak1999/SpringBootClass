package com.OneToOne.service;

import java.lang.foreign.Linker.Option;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToOne.entity.Passport;
import com.OneToOne.entity.Person;
import com.OneToOne.repo.PassportRepo;
import com.OneToOne.repo.PersonRepo;

@Service
public class PersonPassportSvc {

	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private PassportRepo passportRepo;
	
	
	public void savePersonWithPassport() {
		Passport pp = new Passport();
		pp.setPassportNum("2324124AK");
		pp.setIssueDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));
		
		Person p = new Person();
		p.setName("John");
		p.setGender("Male");
		//associating 
		p.setPassport(pp);
		pp.setPerson(p);
		
		personRepo.save(p);
		
		
		System.out.print("Person is saved");
		

	}
	public void getPerson() {
		Optional<Person> byId= personRepo.findById(1);
		if(byId.isPresent()) {
			Person person =byId.get();
			System.out.println("Name : "+ person.getName());
		}
	}
}
