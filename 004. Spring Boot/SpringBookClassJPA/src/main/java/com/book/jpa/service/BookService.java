package com.book.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.jpa.entities.Book;
import com.book.jpa.dao.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		List<Book> allBooks = (List<Book>) bookRepository.findAll();
		return allBooks;
	}
	
	public Book getBookById(int id) {
		Book findById = bookRepository.findById(id);
		return findById;
	}
	
	public Book addNewBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
	public Book deleteBookById(int id) {
		Book b = bookRepository.findById(id);
		bookRepository.delete(b);
		return b;
	}
	
	public Book updateBookById(int id, Book bNew) {
		bNew.setId(id);
		bookRepository.save(bNew);
		return bNew;
	}
}
