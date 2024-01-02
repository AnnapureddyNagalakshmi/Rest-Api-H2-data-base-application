package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Book;
import com.rest.service.BookService;
import java.util.*;

//which is reposible to handle request and reponse
@RestController
public class BookRestController {
	//In order to execute restcontroller logic we need service class inject service class
	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String msg=service.upsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> list=service.getAllBooks();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String msg=service.upsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId){
		String msg=service.deleteBook(bookId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
}
