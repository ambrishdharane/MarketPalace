package com.app.bzr.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/product")
public class DisplayProduct extends HttpServlet{
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String productpage="/product/product.jsp";
				System.out.println("welcome..to product page..!!");
		
		req.getRequestDispatcher(productpage).forward(req, resp);
	}
}
