package com.DataJpaTest.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.DataJpaTest.entities.Users;
import com.DataJpaTest.repo.UsersRepo;

@Service
public class UsersService {
	
	private UsersRepo userRepo;

	public UsersService(UsersRepo userRepo) {
		this.userRepo = userRepo;
	}
	public void saveUser() {
		Users entity = new Users();
		
		entity.setUid(1);
		entity.setUname("Arpita");
		entity.setAge(26);
		entity.setCountry("India");
		entity.setGender("Female");
		
		userRepo.save(entity);
		
		System.out.println("User Saved...");
	}
	public void saveUsers() {
		Users entity1 = new Users();
		entity1.setUid(2);
		entity1.setUname("AK");
		entity1.setAge(27);
		entity1.setCountry("India");
		entity1.setGender("Female");
		
		
		Users entity2 = new Users();
		entity2.setUid(3);
		entity2.setUname("Ravi");
		entity2.setAge(30);
		entity2.setCountry("USA");
		entity2.setGender("Male");
		userRepo.saveAll(Arrays.asList(entity1,entity2));
		
		System.out.println("All Users Saved...");
	}
	public void getUserById() {
		Optional<Users> byId =userRepo.findById(5);
		if(byId.isPresent()) {
			Users user = byId.get();
			System.out.println("User"+user);
		}else {
			System.out.println("No Record Found");
		}
	}
	public void getMultipleUserById() {
		Iterable<Users> allById =userRepo.findAllById(Arrays.asList(1,3));
		allById.forEach(System.out::println);
		
	}
	public void getAllUser() {
		Iterable<Users> allUser =userRepo.findAll();
	    allUser.forEach(System.out::println);
	}
	
	public void existById() {
		boolean existById = userRepo.existsById(2);
		if(existById){
			System.out.println("Record Present");
		}else {
			System.out.println("No Record Present");
		}
		
		
	}
	
	public void deleteUser() {
		userRepo.deleteById(2);
	}

	public void getUserByGender() {
		List<Users> findByGender=userRepo.findByGender("Female");
		findByGender.forEach(System.out::println);
	}
	
	public void getUserByCountry() {
		List<Users> findByCountry=userRepo.findByCountry("USA");
		findByCountry.forEach(System.out::println);
	}
	public void getUserByAge() {
		List<Users> findByAge=userRepo.findByAgeGreaterThanEqual(30);
		findByAge.forEach(System.out::println);
	}
	
//	public void getAllUserByHQL() {
//		List<Users> allUserHQL=userRepo.getAllUsersHQL();
//		allUserHQL.forEach(System.out::println);
//	}
//	public void deleteByHQL() {
//		userRepo.deleteAllUsersByHQL(2);
//		
//	}
}
