package com.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
	
	@RequestMapping("/display")
	public String login(HttpServletRequest req, Model model) {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		
		if (password.equals("admin")) {
			String msg = "Hello " + username;
			model.addAttribute("message", msg);
			return "viewpage";
		} else {
			String msg = "Sorry, " + username + " Incorrect Password Entered";
			model.addAttribute("message", msg);
			return "errorpage";
		}
	}
	

}
