package com.ag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Address a=ac.getBean(Address.class, "address1");
		Employee employee1 = ac.getBean(Employee.class, "e2");
		employee1.show();
		//System.out.println(a);
	}

}
