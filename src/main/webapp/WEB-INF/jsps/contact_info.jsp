<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact | Information</title>
</head>
<body style="background-color: coral;color: blue;">
<h2>Information</h2>
First Name : ${contact.firstName}<br>
Last Name  : ${contact.lastName}<br>
Lead Source: ${contact.leadSource}<br>
Email      : ${contact.email}<br>
Mobile     : ${contact.mobile}<br>
<form  action="composeEmail" method="post">
<input type="hidden" name="email" value="${contact.email}"/>
Email <input type="submit" value="send email"/>
</form>
</body>
</html>