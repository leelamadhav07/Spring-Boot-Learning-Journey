package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{
	//find by name
	@Query("SELECT u FROM Users u WHERE u.name = :name")
	List<Users> findByNameJPQL(@Param("name") String name);
	
	//find by name and email
	@Query("SELECT u FROM Users u WHERE u.name = ?1 AND u.email = ?2")
	List<Users> findByNameAndEmailJPQL(String name,String email);
	
	//count users
	@Query("SELECT COUNT(u) FROM Users u")
	int countusers();
	
}
