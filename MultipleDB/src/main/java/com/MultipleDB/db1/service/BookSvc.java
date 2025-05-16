package com.MultipleDB.db1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MultipleDB.db1.entity.Book;
import com.MultipleDB.db1.repo.BookRepo;

@Service
public class BookSvc {
    @Autowired
	private BookRepo bookRepo;
    
    public void saveBook() {
    	Book b = new Book();
    	b.setBookName("Java");
    	b.setBookPrice(120.30);
    	
    	bookRepo.save(b);
    	
    	System.out.println("Book is saved");
    	
    }
}
