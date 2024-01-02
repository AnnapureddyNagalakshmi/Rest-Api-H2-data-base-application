package com.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entity.Book;
import com.rest.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	public BookRepository repo;
	
	//I am injecting repositoty into service through constructor
	public BookServiceImpl(BookRepository repo) {
		this.repo=repo;
		
	}
	@Override
	public String upsertBook(Book book) {
		Integer bookId=book.getBookId();
		Book save=repo.save(book);
		if(bookId==null) {
			return "Record got Inserted";
		}else {
		return "Record got Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		
		return repo.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return "Book record deleted";
	}

}
