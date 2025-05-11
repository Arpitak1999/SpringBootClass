package com.DataJpaGenerators.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJpaGenerators.entitiees.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
