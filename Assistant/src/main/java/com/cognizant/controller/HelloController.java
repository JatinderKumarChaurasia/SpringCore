package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		// addAttribute(key,value)
		model.addAttribute("greeting", "Shivani Sharma");
		return "hello";
	}

}