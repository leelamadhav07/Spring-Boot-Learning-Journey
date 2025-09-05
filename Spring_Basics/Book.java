package com.example.SpringApp2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class Book {
	public Book() {
		System.out.println("Book is created");
	}
}
