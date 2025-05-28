package com.OneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
