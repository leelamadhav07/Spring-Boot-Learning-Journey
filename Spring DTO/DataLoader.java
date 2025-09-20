package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;

@Component
public class DataLoader implements CommandLineRunner{
	@Autowired
	private UserRepo repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new User("John", "john@example.com", "pass123"));
        repo.save(new User("Alice", "alice@example.com", "pass456"));
        repo.save(new User("John", "john.doe@example.com", "pass789"));
		
	}

}
