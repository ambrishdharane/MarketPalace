package com.app.bzr.aboutus;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/aboutus")
public class DisplayAboutUs extends HttpServlet  {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String aboutuspage="/aboutus/aboutus.jsp";
		System.out.println("welcome...in aboutus page");
		
	     req.getRequestDispatcher(aboutuspage).forward(req, resp);
		
	}

}
