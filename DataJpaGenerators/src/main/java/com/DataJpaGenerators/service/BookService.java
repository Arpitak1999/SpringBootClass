package com.DataJpaGenerators.service;

import org.springframework.stereotype.Service;

import com.DataJpaGenerators.entitiees.Book;
import com.DataJpaGenerators.repo.BookRepo;

@Service
public class BookService {
	
	private BookRepo bookRepo ;
	
	public BookService(BookRepo bookRepo) {
		this.bookRepo=bookRepo;
		
	}
	public void saveBook() {
		Book book = new Book();
		book.setBookName("DSA");
		book.setBookPrice(550.90);
		
		bookRepo.save(book);
		System.out.println("Book is saved");
			
		
	}

}
