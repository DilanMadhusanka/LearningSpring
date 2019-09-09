package com.ownServlet.springmvc;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Springboot") && password.equals("userPassword");
	}
}
