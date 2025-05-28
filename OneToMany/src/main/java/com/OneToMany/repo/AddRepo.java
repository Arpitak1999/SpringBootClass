package com.OneToMany.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.entities.Address;

public interface AddRepo extends JpaRepository<Address, Integer>{

}
