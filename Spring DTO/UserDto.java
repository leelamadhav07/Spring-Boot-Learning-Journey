package com.example.demo.DTO;

public class UserDto {
	private String name;
	private String email;
	
	public UserDto(String name,String email) {
		this.name=name;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
