package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Billing;
import com.zohocrm.services.BillingService;

@Controller
public class LeadGenerateController {

	@Autowired
	private BillingService billingSer;
	
	@RequestMapping("/generate")
	public String generateDetails(Billing bil) {
		billingSer.generateBill(bil);
		
		return "";
	}
	
	
}
