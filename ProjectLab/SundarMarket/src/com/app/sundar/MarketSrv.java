package com.app.sundar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarketSrv extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
		System.out.println("yeehh....i am success...!!"); 
		
	        SundarShopi shopi=new SundarShopi();
	        shopi.setCostomername("aakash");
		    shopi.setAddress("hadpsar");
	        shopi.setBill("2000"); 	
	        
	        SundarShopi shopi2=new SundarShopi();
	        shopi2.setCostomername("mitali");
		    shopi2.setAddress("hadpsar");
	        shopi2.setBill("2500"); 
	        
	        SundarShopi shopi3=new SundarShopi();
	        shopi3.setCostomername("aasha");
		    shopi3.setAddress("bhekrai");
	        shopi3.setBill("1000"); 	
		
		List <SundarShopi> shopiList= new ArrayList<SundarShopi>();
		  shopiList.add(shopi); 
		  shopiList.add(shopi2);
		  shopiList.add(shopi3);
		  
		      req.setAttribute("shoping", shopi);
		      req.setAttribute("shopinglist", shopiList);
		      
		      req.getRequestDispatcher("sundar.jsp").forward(req, resp);
		  
	}
	
	
	
	

}
