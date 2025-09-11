package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {
	List<Users> findByName(String name);
	
	List<Users> findByNameAndEmail(String name,String email);
	
	List<Users> findByNameOrEmail(String name,String email);
}
