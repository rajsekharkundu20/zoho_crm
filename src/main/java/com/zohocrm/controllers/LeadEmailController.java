package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.EmailService;

@Controller
public class LeadEmailController {
	
	@Autowired
	private EmailService emailSer;

	@RequestMapping("/composeEmail")
	public String composeLeadEmail(@RequestParam("emailId") String email, ModelMap model) {
		
		model.addAttribute("email", email);
		return "sendEmail";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String subject,@RequestParam("body") String body) {
		
		emailSer.sendSimpleMessage(to, subject, body);
		return "sendEmail";
	}
	
}
