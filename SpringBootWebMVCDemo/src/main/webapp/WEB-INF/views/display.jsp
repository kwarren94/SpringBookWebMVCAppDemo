<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Name is : <h1>${name}</h1>

<%
	String email = (String) request.getAttribute("email");
	String address = (String) request.getAttribute("address");
	
	String phone = (String) session.getAttribute("phone");
%>

Email is <%=email %> <br/>
Address is <%=address %> <br/>
Phone number is <%=phone %> <br/>
</body>
</html>