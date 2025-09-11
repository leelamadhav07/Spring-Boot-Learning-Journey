package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Repository.UserRepo;
import com.example.demo.model.Users;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@PostMapping
	public Users createUser(@RequestBody Users users) {
		return repo.save(users);
	}
	@GetMapping("/byName/{name}")
	public List<Users> findByName(@PathVariable String name){
		return repo.findByName(name);
	}
	@GetMapping("/byNameAndEmail")
	public List<Users> findByNameAndEmail(@RequestParam String name,@RequestParam String email){
		return repo.findByNameAndEmail(name, email);
	}
	@GetMapping("/byNameOrEmail")
	public List<Users> findByNameOrEmail(@RequestParam String name,@RequestParam String email){
		return repo.findByNameOrEmail(name, email);
	}
	
}
