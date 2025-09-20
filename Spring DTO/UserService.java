package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDto;
import com.example.demo.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	public List<UserDto> getUserDtoByName(String name){
		return repo.findUserDtoByName(name);
	}
}
