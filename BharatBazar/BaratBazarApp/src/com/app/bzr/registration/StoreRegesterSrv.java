package com.app.bzr.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/storereg")
public class StoreRegesterSrv extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("RUN...PROGRAM...!!");

    String name=req.getParameter("name");
    String email=req.getParameter("email");
    String mobileno=req.getParameter("mobileno");
    String address=req.getParameter("address");
    String password=req.getParameter("pssword");
    String confirmpass=req.getParameter("confirmpass");
   
    System.out.println("email="+email);
    System.out.println("name="+name);
    
    
    
    req.getRequestDispatcher("index.jsp").forward(req, resp);

   
	
}





}
