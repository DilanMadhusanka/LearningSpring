package com.ownServlet.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService service = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
//		String name = request.getParameter("name");
//		request.setAttribute("name", name);
//		
//		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		//System.out.println(request.getParameter("name"));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean userValid = service.isUserValid(name, password);
		
		if(userValid) {
			
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Invalid Credential!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}
