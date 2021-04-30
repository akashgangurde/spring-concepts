package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Emp;

public class EmpDao {
	
	@Autowired
	DataSource dataSource;
	
	public List<Emp> getEmployeesByPage(int pageid, int total) {
		
		String query = "select * from employees limit " + (pageid - 1) + "," + total;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Emp> list = jdbcTemplate.query(query, new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int id) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				return e;
			}
		});
		
		return list;
	}

}
