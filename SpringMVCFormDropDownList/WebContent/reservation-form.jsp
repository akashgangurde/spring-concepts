<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
		First Name: <form:input path="firstName" /> <br> <br>
		Last Name: <form:input path="lastName" /> <br> <br>
		Gender: 
		Male: 	<form:radiobutton path="Gender" value="Male"/>
		Female:	<form:radiobutton path="Gender" value="Female"/> <br> <br>
		Meals :
		Breakfast<form:checkbox path="Food" value="Breakfast"/>
		Lunch<form:checkbox path="Food" value="Lunch"/>
		Dinner<form:checkbox path="Food" value="Dinner"/> <br> <br>
		Departing From: <form:select path="cityFrom">
						<form:option value="Los Angeles" label="Los Angeles"></form:option>
						<form:option value="Portland" label="Portland"></form:option>
						<form:option value="Seattle" label="Seattle"></form:option>
						<form:option value="Phoenix" label="Phoenix"></form:option>
						</form:select>
						<br> <br>
		Arriving At: <form:select path="cityTo">
					 <form:option value="Los Angeles" label="Los Angeles"></form:option>
					 <form:option value="Portland" label="Portland"></form:option>
					 <form:option value="Seattle" label="Seattle"></form:option>
					 <form:option value="Phoenix" label="Phoenix"></form:option>
					 </form:select>
					 <br> <br>			
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>