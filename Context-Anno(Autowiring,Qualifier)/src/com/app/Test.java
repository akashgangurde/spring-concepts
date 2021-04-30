package com.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config-anno.xml");
		System.out.println("============Autowiring via Properties===================");
		College college=ac.getBean("clg", College.class);
		System.out.println(college);
		System.out.println("=================================");
		List<Student> students=college.getList();
		students.forEach(System.out::println);
		System.out.println("=================================");
		Student student1=college.getStudent1();
		System.out.println(student1);
		System.out.println();
		
		System.out.println("==============Autowiring via Constructor====================");
		College1 college1=ac.getBean("clg1", College1.class);
		System.out.println(college1);
		System.out.println("=========LIST================");
		List<Student> s=college1.getList();
		s.forEach(System.out::println);
		
		
	
	}

}
