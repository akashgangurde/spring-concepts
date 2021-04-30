package com.model;

import javax.validation.constraints.Size;

public class Employee {
	
	private String username;
	
	@Size(min = 6, message = "6 Characters Required")
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
