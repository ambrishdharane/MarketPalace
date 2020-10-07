package com.app.bzr.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class DisplayLoginSrv extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String loginpage="/login/login.jsp";
		System.out.println("welcome....to login page");
		
		req.getRequestDispatcher(loginpage).forward(req, resp);
	
		    
		    
		    
		
		
		
	}
	
	
}
