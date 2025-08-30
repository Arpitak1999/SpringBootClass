package com.SpringBootClass.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SpringBootClass.entity.Student;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long> {

}
