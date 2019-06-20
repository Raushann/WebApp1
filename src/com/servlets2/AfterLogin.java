package com.servlets2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Afterlogin")

public class AfterLogin  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out=resp.getWriter();
		
		HttpSession session=req.getSession(false);
		
		if(session!=null)
		{
			Employee emp=(Employee)session.getAttribute("emp");
			out.print(emp);
			out.print("<h1>"+"logged in sucessfully"+"<h1>");
			//Logic after Login
		}
		else
		{
			out.print("<h1>"+ " please login first"+"</h1>");
			 resp.sendRedirect("./login.html");
		}
	}
}
