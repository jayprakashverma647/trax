<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body style="background-color: coral;color: blue;">
	<h2>Billing | Create</h2>
	<div>
	${EmailError}
	</div>

	
		<pre>
		Id            ${bill.bid} 
		First Name    ${bill.firstName} 
		Last Name     ${bill.lastName} 
		Email         ${bill.email} 
		Mobile        ${bill.mobile}  
		product Name  ${bill.product}  
		Amount        ${bill.amount}  
		</pre>
		
		    <input type="submit" value="Generate bill">
		    
			<form  action="composeEmail" method="post">
			<input type="hidden" name="email" value="${bill.email}"/>
			Email <input type="submit" value="send email"/>
			</form>
	<div>${save}</div>

</body>
</html>