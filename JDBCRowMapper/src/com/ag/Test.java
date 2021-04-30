package com.ag;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = ac.getBean(EmployeeDao.class, "edao");
		List<Employee> list = dao.getAllEmployeesRowMapper();
		
		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
