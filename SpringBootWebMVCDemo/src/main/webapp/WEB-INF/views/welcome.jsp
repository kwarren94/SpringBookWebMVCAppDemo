<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h1> Welcome to Spring Boot Web MVC </h1>

<%
	String phone = (String) session.getAttribute("phone");
	
%>

Phone Number is : <%=phone %> <br>


<form action="/register" method="post">
First Name: <input type="text" name="firstName" />
Last name: <input type="text" name="lastName" />
Email: <input type="text" name="email" />

<input type="submit" value="Register" />
</form>

</body>
</html>