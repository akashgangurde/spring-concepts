package com.ag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	private int id;
	private String name;
	

	private Employee employee1;
	

	private Employee employee2;
	
	@Autowired
	public Company(int id, String name, @Qualifier("emp1") Employee employee1, @Qualifier("emp2") Employee employee2) {
		super();
		this.id = id;
		this.name = name;
		this.employee1 = employee1;
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
	public Employee getEmployee1() {
		return employee1;
	}
	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}
	public Employee getEmployee2() {
		return employee2;
	}
	public void setEmployee2(Employee employee2) {
		this.employee2 = employee2;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", employee1=" + employee1 + ", employee2=" + employee2 + "]";
	}
	
	

}
