package com.example.Spring_Data_JPA.New.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Spring_Data_JPA.New.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}