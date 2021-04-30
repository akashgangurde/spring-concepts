package com.ag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("emp2")
	private Employee employee;
	
	@Autowired
	@Qualifier("emp1")
	private Employee employee2;
	
	
	
	public Employee getEmployee2() {
		return employee2;
	}
	public void setEmployee2(Employee employee2) {
		this.employee2 = employee2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", employee=" + employee + ", employee2=" + employee2 + "]";
	}
	
	
	
	
	

}
