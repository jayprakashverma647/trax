<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Lead</title>
</head>
<body>
<a href="viewCreateLead">Create new lead</a>
	<h3>All Lead</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			
			
		</tr>
		<c:forEach items="${leads}" var="lead">
			<tr>
				<td>${lead.id}</td>
				<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.lastName}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>