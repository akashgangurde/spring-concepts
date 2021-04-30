package com.ag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao employeeDao = ac.getBean(EmployeeDao.class, "empdao");
		Employee employee1 = new Employee();
		employee1.setId(23);
		employee1.setName("Leborn");
		employee1.setSalary("450000");
		
		System.out.println(employeeDao.saveEmployee(employee1));
		
		
		int status = employeeDao.updateEmployee(new Employee(23, "AD", "40"));
		System.out.println(status);
		
		System.out.println(employeeDao.deleteEmployee(employee1));
	}

}
