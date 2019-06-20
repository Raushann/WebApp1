<%@page import="com.servlets2.Employee"%>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! void run()
{
	int i=50;
}
%>

<%=new Date()%>

<% session=request.getSession();
Employee emp=(Employee)session.getAttribute("emp");
//out.print(emp);
%>
<br> 

<%=emp.getID() %>
<br>
<%=emp.getName() %>
<br>
<%=emp.getSalary() %>
</body>
</html>