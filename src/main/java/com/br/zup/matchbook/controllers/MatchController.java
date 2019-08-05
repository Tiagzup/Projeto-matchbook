package com.br.zup.matchbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MatchController {
 

	@GetMapping("/")
	public ModelAndView displayHomePage() {
		ModelAndView modelAndView = new ModelAndView("home.html");
		return modelAndView;
	}
	
	@GetMapping("/login")
	public ModelAndView displayLoginPage() {
		ModelAndView modelAndView = new ModelAndView("Login.html");
		return modelAndView;	
	}
	
	
	
}
