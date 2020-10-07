package com.app.bzr.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class DisplayRegisterSrv extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String registerPage="/register/register.jsp";
		 System.out.println("executing register srv");
		req.getRequestDispatcher(registerPage).forward(req, resp);

			}
	
}
