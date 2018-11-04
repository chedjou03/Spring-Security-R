package com.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityDemoController {

	@GetMapping("/")
	public String showHomePage()
	{
		return "home-page";
	}
}
