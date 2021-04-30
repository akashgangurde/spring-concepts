package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
	
	@RequestMapping("/page2")
	public String redirect() {
		return "viewpage";
	}
	
	@RequestMapping("/pagefinal")
	public String getFinalPage() {
		return "final";
	}

}
