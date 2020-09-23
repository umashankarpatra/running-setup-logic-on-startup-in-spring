package com.uma.startup;

import java.util.Arrays;
import java.util.List;

public class Book {

	private String id;
	private String name;

	public Book() {

	}

	public Book(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Book> of() {

		Book book = new Book("12", "Programming");
		Book book2 = new Book("12", "Programming and Unit Testing");

		return Arrays.asList(book, book2);

	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

}