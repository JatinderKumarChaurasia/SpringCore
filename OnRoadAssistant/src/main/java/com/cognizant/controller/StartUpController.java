package com.cognizant.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Customer;
import com.cognizant.services.CustomerService;

@Controller
public class StartUpController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/welcome")
	public String welcomePage(Model model) {
		model.addAttribute("welcome", "Shivani Sharma");
		return "welcome";
	}

	@RequestMapping(value="/addCustomer",method = RequestMethod.GET)
	public String getCustomerPage(@ModelAttribute("customers") Customer customer){
		return "addCustomerSignUp";
	}
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@Valid @ModelAttribute("customers") Customer customer, HttpSession session,
			BindingResult result) {

		System.out.println("Customer Id:" + customer.getCustomerId());
		System.out.println("Customer Name:" + customer.getCustomerName());
		if (result.hasErrors()) {
			return "addCustomerSignUp";
		} else {
			customerService.save(customer);
		}
		return "addMinutes";
	}

}
