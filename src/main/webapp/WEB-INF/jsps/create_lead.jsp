<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead |Create</title>
</head>
<body>
	<h2>Lead |Create</h2>
	<div>
	${EmailError}
	</div>

	<form action="saveLead" method="post">
		<pre>
		First Name     <input type="text" name="firstName" autocapitalize="on"/> 
		Last Name      <input type="text" name="lastName" autocapitalize="on" /> 
		Lead Source:   <select name="leadSource" >
			<option value="radio">Radio Channel</option>
			<option value="newspaper">News Paper</option>
			<option value="tv">TV</option>
			<option value="online">Online</option>
		</select>
		Email          <input type="email" name="email" />
		Mobile         <input type="text" name="mobile" min="10" maxlength="10"/>
		
		     <input type="submit" value="Save">
     </pre>
	</form>
	<div>${save}</div>

</body>
</html>