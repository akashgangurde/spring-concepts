package com.ag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = ac.getBean(EmployeeDao.class, "edao");
		dao.saveEmployeeByPreparedStatement(new Employee(23, "Lebron", "45"));
	}

}
