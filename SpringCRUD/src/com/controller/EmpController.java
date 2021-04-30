package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmpDao;
import com.model.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDao dao;
	
	
	@ModelAttribute("emp")
	public Emp mapEmp() {
		return new Emp();
	}
	
	@RequestMapping("/empform")
	public String showForm() {
		return "empform";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp) {
		dao.save(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewEmp(Model model) {
		List<Emp> list = dao.getEmployees();
		model.addAttribute("list", list);
		return "viewemp";
	}
	
	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model model) {
		Emp emp = dao.getEmpById(id);
		model.addAttribute("emp", emp);
		return "empeditform";
	}
	
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Emp emp) {
		dao.update(emp);
		System.out.println("updated");
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String deleteEmp(@PathVariable int id) {
		dao.delete(id);
		return "redirect:/viewemp";
	}
}
