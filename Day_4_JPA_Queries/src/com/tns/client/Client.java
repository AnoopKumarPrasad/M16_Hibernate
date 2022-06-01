package com.tns.client;

import com.tns.entities.Book;
import com.tns.services.BookService;
import com.tns.services.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Book with ID 104:"+service.getBookById(104));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book:service.getAuthorBooks("Robert Fischer") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on Android*************");
		for(Book book:service.getBookByTitle("Pro Java 8 Programming")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(300, 700) ) {
			System.out.println(book);
		}
		
		
		
		
	}
	}