package com.ednSolutions.ws.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String redirect() {
		return "index";
	}

	@RequestMapping("/home")
	public String redirectHome() {
		return "index";
	}
	
}
