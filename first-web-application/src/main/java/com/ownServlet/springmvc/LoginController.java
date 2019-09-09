package com.ownServlet.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	LoginService service = new LoginService();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody		//We use this for return the text(String) to dispatcherServlet and it like a jsp(html) body
	public String showLoginPage() {
		return "login2";		//When we use @ResponseBody web browser is displayed "login"
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	//@ResponseBody		//We use this for return the text(String) to dispatcherServlet and it like a jsp(html) body
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!service.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login2";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome2";		//When we use @ResponseBody web browser is displayed "login"
	}
}