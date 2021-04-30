package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Emp;

public class EmpDao {
	
	@Autowired
	DataSource dataSource;
	
	public int save(Emp e) {
		String query = "insert into employees(name,salary,designation) values('"+e.getName()+"','"+e.getSalary()+"','"+e.getDesignation()+"')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
	}
	
	public int update(Emp e) {
		String query = "update employees set name='"+e.getName()+"', salary='"+e.getSalary()+"', designation='"+e.getDesignation()+"' where id="+e.getId();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
	}
	
	public int delete(int id) {
		String query = "delete from employees where id="+id+"";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.update(query);
	}
	
	public Emp getEmpById(int id) {
		String query = "select * from employees where id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	public List<Emp> getEmployees() {
		String query = "select * from employees";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Emp> list= jdbcTemplate.query(query, new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getString(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
		return list;
		
	}
}
