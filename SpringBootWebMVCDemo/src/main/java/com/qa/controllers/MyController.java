package com.qa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.qa.models.Customer;
import com.qa.services.CustomerService;

@Controller
@SessionAttributes({"phone"})
public class MyController {
	
	//inject service class
	@Autowired
	private CustomerService customerService;

	// Should have some mapping methods
	@RequestMapping("/")
	public String hello() {
		return "welcome";
	}
	
	@ModelAttribute("phone")
	public String defaultPhone() {
		return "Does not exist";
	}
	
	@RequestMapping("/readName")
	public ModelAndView display() {
		ModelAndView mv = new ModelAndView("display", "name", new String("Katie"));
		mv.addObject("email", new String("me@email.com"));
		mv.addObject("address", new String("London"));
		mv.addObject("phone", new String("021923832929")); //Storing within session
		return mv;
	}
	
//	@RequestMapping("/register")
//	public String registrationProcess(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName) {
//		
//		if(!fName.equals("") && !lName.equals("")) {
//			System.out.println("valid Input");
//			return "reg_success";
//		}
//		else {
//			System.out.println("Invalid input");
//			return "reg_failed";
//		}
//	}
	
	
	@RequestMapping("/register")
	public String registrationProcess(@ModelAttribute Customer c) {
			System.out.println("String" + c);
		
		if(!c.getFirstName().equals("") && !c.getLastName().equals("") && !c.getEmail().equals("")) {
			System.out.println("valid Input");
			customerService.createCustomerRecord(c);
			return "reg_success";
		}
		else {
			System.out.println("Invalid input");
			return "reg_failed";
		}
	}
	
}
