package com.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//Here I created the entity, that entity I mapped with db table and I created a repository

@Data
@Entity
@Table(name="BOOK_DET")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="BOOK_NAME")	
	private String bookName;
	
	@Column(name="BOOK_PRICE")
	private Double bookPrice;
}
