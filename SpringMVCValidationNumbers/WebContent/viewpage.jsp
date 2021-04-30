<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<form:form action="loginpage" modelAttribute="emp">
	Username: <form:input path="username"/> <br> <br>
	Password: <form:password path="password"/>
	<form:errors path="password" cssClass="error"></form:errors> <br><br>
	Age:      <form:input path="age"/>
	<form:errors path="age" cssClass="error"></form:errors> <br><br>
	<input type="submit" value="Submit">
</form:form>
</body>
</html>