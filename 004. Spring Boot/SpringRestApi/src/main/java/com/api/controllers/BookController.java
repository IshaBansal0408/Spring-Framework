package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Book;
import com.api.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
}
