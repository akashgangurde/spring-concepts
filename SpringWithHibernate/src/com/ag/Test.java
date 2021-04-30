package com.ag;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = ac.getBean(EmployeeDao.class, "empdao");
		
		
		Employee employee1 = new Employee();
		employee1.setId(3);
		employee1.setName("AD");
		employee1.setSalary(40);
		System.out.println(employee1);
//		dao.saveEmployee(employee1);
		
//		employee1.setSalary(50);
//		dao.updateEmployee(employee1);
		
		Employee employee2 = new Employee();
		employee2.setId(5);
		employee2.setName("Kuz");
		employee2.setSalary(15);
//		dao.saveEmployee(employee2);
		
//		dao.deleteEmployee(employee2);
		
//		System.out.println(dao.getById(3));
		
		List<Employee> list = dao.getEmployees();
		
		for (Employee emplist : list) {
			System.out.println(emplist);
		}
		
	}

}
