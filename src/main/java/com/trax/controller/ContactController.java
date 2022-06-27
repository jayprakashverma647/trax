package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Contact;
import com.trax.entities.Lead;
import com.trax.service.ContactService;
import com.trax.service.LeadService;

@Controller
public class ContactController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactservice;

	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead=leadService.findLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setLeadSource(lead.getLeadSource());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactservice.saveContact(contact);
		leadService.deleteLeadById(id);
		List<Contact> contacts = contactservice.getAllContacts();
		model.addAttribute("contacts", contacts);
		
		return "contact_list";
	}
	
	@RequestMapping("/contactInfo")
	public String leadinfo(@RequestParam("id")long id,ModelMap model) {
	Contact contact = contactservice.findContactById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactservice.getAllContacts();
		model.addAttribute("contacts", contacts);
		
		return "contact_list";
	}
}
