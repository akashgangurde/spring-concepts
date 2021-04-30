package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
	
	
	@RequestMapping("/controller1")
	public String getController1() {
		return "viewpage1";
	}
	

}
