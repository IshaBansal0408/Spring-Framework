package com.book.jpa.controller;

import java.util.List;
import java.util.Optional;

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

import com.book.jpa.entities.Book;
import com.book.jpa.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookWebService;

	@GetMapping("/allBooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> allBooks = bookWebService.getAllBooks();
		if (allBooks.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(allBooks));
	}

	@GetMapping("/book/{book_id}")
	public ResponseEntity<Book> getBookById(@PathVariable("book_id") int id) {
		Book selbook = bookWebService.getBookById(id);
		if (selbook == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(selbook));
	}

	@PostMapping("/addBook")
	public ResponseEntity<Book> addNewBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = bookWebService.addNewBook(book);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Book Not Added!");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/delBook/{book_id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable("book_id") int id) {
		Book b = bookWebService.deleteBookById(id);
		if (b == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(b));
	}

	@PutMapping("/updateBook/{book_id}")
	public ResponseEntity<Book> updateBookById(@PathVariable("book_id") int id, @RequestBody Book bNew) {
		Book btemp = bookWebService.updateBookById(id, bNew);
		if (btemp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(btemp));

	}
}
