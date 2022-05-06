package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadSer;
	
	@Autowired
	private ContactService contactSer;

	//handler method
	@RequestMapping("/viewLeadPage")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	//dto method
	@RequestMapping("/saveLeadData")
	public String saveLeadData(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadSer.saveLeadData(lead);
		model.addAttribute("leadData", lead);
		return "lead_info";
	}
	
	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap model) {
		
		List<Lead> leads = leadSer.findAllLeads();
		model.addAttribute("leads", leads);
		
		return "lead_result";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadSer.getLead(id);
		model.addAttribute("leadData", lead);
		return "lead_info";
	}
	
	@RequestMapping("/generateLead")
	public String getLeadDetailsById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadSer.getLeadDetails(id);
		model.addAttribute("generateLeadData", lead);
		return "generate_lead_details";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadSer.getLead(id);
		
		Contact cont = new Contact();
		cont.setFirstName(lead.getFirstName());
		cont.setLastName(lead.getLastName());
		cont.setEmail(lead.getEmail());
		cont.setLeadSource(lead.getLeadSource());
		cont.setMobile(lead.getMobile());
		
		contactSer.saveContactData(cont);
		
		leadSer.deleteData(id);
		
		model.addAttribute("contactData", cont);
		
		return "contact_info";
	}
	
}
