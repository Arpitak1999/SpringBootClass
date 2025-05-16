package com.DataJpaTest.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DataJpaTest.entities.Users;

import jakarta.transaction.Transactional;
public interface UsersRepo extends CrudRepository<Users, Integer> {
	//select * from users where gender=:Female
    public List<Users> findByGender(String gender);
    
    //select * from users where country=:India
    public List<Users> findByCountry(String country);
    
    //select * from users where gender=:Female and country=:India
    public List<Users> findByGenderAndCountry(String gender,String country);

    //select * from users where gender=:Female and country=:India
    public List<Users> findByAgeGreaterThanEqual(Integer age);
    
    @Query(value ="select * from users", nativeQuery = true)
    public List<Users> getAllUsers();
    
    @Query(value="FROM Users")
    public List<Users> getAllUsersHQL();
   
    @Query(value="delete from Users where uid =:id")
    @Transactional
    @Modifying
    public void deleteUsersByHQL(Integer id);
}
