package com.jspiders.webapp.pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		Object obj=req.getAttribute("ClassA");
		ClassA ref=(ClassA)obj;
		
		PrintWriter out=resp.getWriter();
		out.println("Name = "+ref.name);
		out.println("value = "+ref.value);
		
	}
}
