package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.entities.Book;

// Fake Service
@Service
public class BookService {

//	Fake List of Books
	private static List<Book> bookList = new ArrayList<Book>();
	static {
		bookList.add(new Book(1, "Book02", "Author02"));
		bookList.add(new Book(2, "Book03", "Author03"));
		bookList.add(new Book(3, "Book04", "Author04"));
		bookList.add(new Book(5, "Book05", "Author05"));
	}

//	Get all Books Data
	public List<Book> getAllBooks() {
		return bookList;
	}

// Filter book by id
	public Book getBookById(int id) {
		Book book = null;
		book = bookList.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}
}
