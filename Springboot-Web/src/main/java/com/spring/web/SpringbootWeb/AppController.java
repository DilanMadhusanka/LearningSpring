package com.spring.web.SpringbootWeb;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("AppController->test()");
		return "test.jsp";
	}
	
	@RequestMapping("/list_contact")
	public String listContact(Model model) {
		ContactBusiness business = new ContactBusiness();
		List<Contact> contactList = business.getContactList();
		model.addAttribute("contact", contactList);
		return "contact";
	}
}
