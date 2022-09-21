package com.book.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.jpa.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	public Book findById(int id);

}
