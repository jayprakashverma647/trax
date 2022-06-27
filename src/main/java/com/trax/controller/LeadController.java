package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Lead;
import com.trax.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService service;

	@RequestMapping("/viewCreateLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	  
	@RequestMapping(value="/saveLead",method = RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead, ModelMap model)throws RuntimeException{
		try {
			service.saveLeadInfo(lead);
			model.addAttribute("save", "Saved...!");
			model.addAttribute("lead", lead);
		} catch (Exception e) {
			model.addAttribute("EmailError", "This email id exist ...!");
			return "create_lead";
		}
		return "lead_info";
		
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email,ModelMap model) {
		//System.out.println(email);
		model.addAttribute("email", email);
		return"compose_email";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = service.getAllLeads();
		model.addAttribute("leads",leads);
		return"lead_result" ;
		}
	@RequestMapping("/leadInfo")
	public String leadinfo(@RequestParam("id")long id,ModelMap model) {
		Lead lead =service.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
}
