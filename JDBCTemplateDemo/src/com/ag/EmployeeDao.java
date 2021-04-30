package com.ag;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	@Autowired
	private DataSource dataSource;
	
	public int saveEmployee(Employee e) {
		String query = "insert into emp values(" + e.getId() + ",'" +  e.getName() + "','" + e.getSalary()+"')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee e) {
		String query = "update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
		
	}
	
	public int deleteEmployee(Employee e) {
		String query = "delete from emp where id='"+e.getId()+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
	}
	

}
