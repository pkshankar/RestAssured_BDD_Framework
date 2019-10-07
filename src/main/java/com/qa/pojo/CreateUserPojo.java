package com.qa.pojo;

public class CreateUserPojo {
	
	private String username;
	private String password;
	
	public CreateUserPojo(String username, String password) {
		
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
}
