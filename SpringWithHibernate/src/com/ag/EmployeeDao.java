package com.ag;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDao {
	
	@Autowired
	private SessionFactory factory;

	
	public void saveEmployee(Employee e) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(e);
		
		transaction.commit();
		session.close();
	}
	
	public void updateEmployee(Employee e) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(e);
		
		transaction.commit();
		session.close();
	}
	
	public void deleteEmployee(Employee e) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.delete(e);
		
		transaction.commit();
		session.close();
	}
	
	public Employee getById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e = (Employee)session.get(Employee.class, id);
		
		return e;
	}
	
	public List<Employee> getEmployees() {
		Session session = factory.openSession();
		
		List<Employee> list =session.createQuery("from com.ag.Employee").list();
		return list;
	}
	

}
