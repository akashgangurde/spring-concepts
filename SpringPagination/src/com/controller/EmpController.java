package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.dao.EmpDao;
import com.model.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDao dao;
	
	@RequestMapping(value = "/viewemp/{pageid}")
	public String page(@PathVariable int pageid, Model model) {
		
		int total = 5;
		
		if (pageid == 1) {
			
		} else {
			pageid = (pageid - 1) * total + 1;
		}
		System.out.println(pageid);
		
		List<Emp> list = dao.getEmployeesByPage(pageid, total);
		model.addAttribute("emp", list);
		return "viewemp";
	}
}
