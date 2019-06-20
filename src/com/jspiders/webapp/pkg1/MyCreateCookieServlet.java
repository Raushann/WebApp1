package com.jspiders.webapp.pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCreateCookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie ck1=new Cookie("Class","J2EE");
		Cookie ck2=new Cookie("jspiders","100");
		ck2.setMaxAge(7*24*60*60);
		
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		PrintWriter out=resp.getWriter();
		out.println("cookie is Created.....");
	}

}
