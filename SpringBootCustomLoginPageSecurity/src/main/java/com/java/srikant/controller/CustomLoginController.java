package com.java.srikant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomLoginController {
	@GetMapping("/customLogin")
	public String JspLoginPage() {
		return "login";
	}

}
