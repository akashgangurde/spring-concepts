package com.ag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Student student = applicationContext.getBean(Student.class, "studentbean");
		student.display();
	}

}
