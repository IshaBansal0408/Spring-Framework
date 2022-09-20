package com.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.book.entities.Book;

@Service
public class BookWebService {

//	Get a fake list of Books data
	private static List<Book> bookList = new ArrayList<>();
//	Add data to the list of Books
	static {
		bookList.add(new Book(1, "In Search of Lost Time", 350, "Marcel Proust"));
		bookList.add(new Book(2, "Ulysses", 400, "James Joyce"));
		bookList.add(new Book(3, "One Hundred Years of Solitude", 990, "Gabriel Garcia Marquez"));
		bookList.add(new Book(4, "War and Peace", 550, "Leo Tolstoy"));
		bookList.add(new Book(5, "Madame Bovary", 250, "Gustave Flaubert"));
	}

//	Get all Books
	public List<Book> getAllBooks() {
		return bookList;
	}

//	Get Book by id
	public Book getBookById(int id) {

		Book selBook = null;
		try {
			/*
			 * Stream - Get data of the whole list... Filter - filter data according to a
			 * condition ( here e->each book and check if id of book matches id passed.
			 * FindFirst - Get the first matched data.... Get - Get the information
			 */
			selBook = bookList.stream().filter(e -> e.getId() == id).findFirst().get();

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Book Not Found!");
		}
		return selBook;
	}

//	Add a new Book
	public Book addNewBook(Book book) {
		bookList.add(book);
		return book;
	}

//	Delete Book by Id
	public Book deleteBookById(int id) {
		Book selBook = null;
		try {
			selBook = bookList.stream().filter(e -> e.getId() == id).findFirst().get();
			bookList.remove(selBook);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Book Not Found!");
		}
		return selBook;
	}

//	update Book by Id
	public Book updateBookById(int id, Book bNew) {
		Book selBook = null;
		try {
			selBook = bookList.stream().filter(e -> e.getId() == id).findFirst().get();
			selBook.setName(bNew.getName());
			selBook.setPrice(bNew.getPrice());
			selBook.setAuthor(bNew.getAuthor());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Book Not Found!");
		}
		return selBook;
	}
}
