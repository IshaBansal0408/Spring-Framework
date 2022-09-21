package com.book.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="AUTHOR")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String name;
	private String location;
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private Book book;
	

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int authorId, String name, String location) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.location = location;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", location=" + location + "]";
	}

}
