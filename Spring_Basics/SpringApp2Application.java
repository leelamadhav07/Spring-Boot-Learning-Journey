package com.example.SpringApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringApp1.Book;

@SpringBootApplication
public class SpringApp2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringApp2Application.class, args);
		Book b1=context.getBean(Book.class);
		Book b2=context.getBean(Book.class);
		if(b1==b2)System.out.println("Same");
		else System.out.println("Different");
		 
	}

}
