package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
	
	private String username;
	
	@Size(min = 6, message = "6 Characters Required")
	private String password;
	
	@Min(value = 18, message = "Age must be atleast 18")
	@Max(value = 45, message = "Age must be no greater than 45")
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
