package com.model;

import javax.validation.constraints.Pattern;

public class Employee {
	
	private String username;
	
	@Pattern(regexp = "[a-zA-Z0-9]{8,}", message = "Password must be of atleast 8 Characters")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
