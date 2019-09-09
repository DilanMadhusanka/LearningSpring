package com.ownServlet.jee;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Springboot WebApplication") && password.equals("userPassword"))
			return true;
		return false;
	}
}
