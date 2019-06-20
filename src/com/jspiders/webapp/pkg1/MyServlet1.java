package com.jspiders.webapp.pkg1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		ClassA ref=new ClassA("jspiders",100);
		req.setAttribute("ClassA", ref);//Request Attribute
		
		ServletContext context=req.getServletContext();
		context.setAttribute("ClassA", ref);//Contex Attribute
		
		HttpSession session=req.getSession();
		session.setAttribute("ClassA", ref);//Session Attribute
		RequestDispatcher dispatcher=req.getRequestDispatcher("");
		dispatcher.forward(req, resp);
	}
}
