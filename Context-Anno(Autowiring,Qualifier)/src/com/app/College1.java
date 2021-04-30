package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College1 {
private int id;
private String name;

private Student student1;

private Student student2;

private List<Student> list;


@Autowired
public College1(int id, String name, @Qualifier("stud1")Student student1, @Qualifier("stud2")Student student2, List<Student> list) {
	super();
	this.id = id;
	this.name = name;
	this.student1 = student1;
	this.student2 = student2;
	this.list = list;
}


public College1() {
	super();
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


public Student getStudent1() {
	return student1;
}


public void setStudent1(Student student1) {
	this.student1 = student1;
}


public Student getStudent2() {
	return student2;
}


public void setStudent2(Student student2) {
	this.student2 = student2;
}


public List<Student> getList() {
	return list;
}


public void setList(List<Student> list) {
	this.list = list;
}


@Override
public String toString() {
	return "College1 [id=" + id + ", name=" + name + ", student1=" + student1 + ", student2=" + student2 + ", list="
			+ list + "]";
}










}
