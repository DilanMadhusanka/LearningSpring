<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!!!! From JSP</title>
</head>
<body>
<%
//This call Scriptlet
/*System.out.println(request.getParameter("name"));
Date date = new Date();*/
%>
<!-- <div>Current date is : <%//=date %> </div> -->
<!-- My First JSP ${name} and password is ${password} -->

<br/><br/>

<form action="/login" method="post">	<!-- action = "/spring-mvc/login" -->
<p><font color="red">${errorMessage}</font></p>
Enter your name <input type="text" name="name"/>
Enter your password <input type="password" name="password"/>
<input type="submit" name="submit" value="Login"/>
</form>

</body>
</html>