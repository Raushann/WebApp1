package com.jspiders.webapp.pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyReadCookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] ck=req.getCookies();
		PrintWriter out=resp.getWriter();
		out.println("Name = "+ck[0].getName());
		out.println("Value = "+ck[0].getValue());
		out.println("Name = "+ck[1].getName());
		out.println("Value = "+ck[1].getValue());
	}
}
