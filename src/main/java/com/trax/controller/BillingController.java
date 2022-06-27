package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.service.BillingService;
import com.trax.service.ContactService;

@Controller

public class BillingController {
	
	@Autowired
	
	private ContactService contactservice;
	
	@Autowired
	private BillingService billingservice;

	@RequestMapping("/createBill")
	public String createBill(@RequestParam ("bid")long id ,ModelMap model) {
		Contact contact = contactservice.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
		
		@RequestMapping("/saveBill")
		public String saveBill(@ModelAttribute Billing bill,ModelMap model) {
			billingservice.saveBill(bill);
			model.put("bill", bill);
			return"generate_bill";
		}
	
}
