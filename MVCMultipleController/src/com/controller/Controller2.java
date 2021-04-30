package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
	
	@RequestMapping("/controller2")
	public String getController2() {
		return "viewpage2";
	}

}
