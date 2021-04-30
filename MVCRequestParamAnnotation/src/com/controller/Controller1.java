package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
	
	@RequestMapping("/display")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		
		if (password.equals("admin")) {
			String msg = "Welcome, " + username;
			model.addAttribute("message", msg);
			return "viewpage";
		} else {
			String msg = "Sorry, " + username + " Invalid Login Credentials";
			model.addAttribute("message", msg);
			return "errorpage";
		}
	}

}
