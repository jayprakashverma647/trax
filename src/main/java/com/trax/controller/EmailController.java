package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.utility.EmailServices;

@Controller
public class EmailController {
	
	@Autowired
	private EmailServices emailService;

	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("sub")String sub,@RequestParam("body")String body,ModelMap model) {
	emailService.sendSimpleMessage(to, sub, body);
	model.addAttribute("msg", "Email sent!!");
		return "compose_email";
		
	}
}
