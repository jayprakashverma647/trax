<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
	<h2>Billing | Create</h2>
	<div>
	${EmailError}
	</div>

	<form action="saveBill" method="post">
		<pre>
		Id             <input type="text" name="bid"  value="${contact.id}" readonly />
		First Name     <input type="text" name="firstName"  value="${contact.firstName }"autocapitalize="on"/> 
		Last Name      <input type="text" name="lastName"  value="${contact.lastName }"autocapitalize="on"/> 
		Email          <input type="email" name="email" value="${contact.email }"/>
		Mobile         <input type="text" name="mobile" value="${contact.mobile }"/>
		product Name   <input type="text" name="product"/>
		Amount         <input type="text" name="amount"/>
		
		     <input type="submit" value="Generate bill">
     </pre>
	</form>
	<div>${save}</div>

</body>
</html>