package com.servlets2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		
		Employee emp=new Employee();
		
		emp.setID(101);
		emp.setName("dinga");
		emp.setSalary(1700);
		
		session.setAttribute("emp", emp);
		
		/*
		 * req.setAttribute("emp", emp); RequestDispatcher
		 * dis=req.getRequestDispatcher("/AfterLogin"); dis.forward(req, resp);
		 */
		
		out.print("<h1>"+"Login Successfull"+"<h1>");
		
	}
	
	}


