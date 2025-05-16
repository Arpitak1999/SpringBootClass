package com.MultipleDB.db1.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.MultipleDB.db1.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
