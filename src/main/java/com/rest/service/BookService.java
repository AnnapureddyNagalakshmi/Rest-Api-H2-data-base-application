package com.rest.service;

import java.util.List;

import com.rest.entity.Book;
//and i created a service, service interface contains the abstract methods

public interface BookService {

	public String upsertBook(Book book);	//upsertBook- if the primary key not available it will insert new record
											//if primary key is already available it will update the record(add/update)
	public List<Book> getAllBooks();
	//public String updateBook();
	public String deleteBook(Integer bookId);
}
