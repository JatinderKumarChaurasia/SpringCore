<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Goal</title>
<style type="text/css">
* {
	background-color: aqua;
	color: black;
}

.errorBlock {
	border: 3px solid red;
	border-radius:20px;
	color:red;
	background-color: green;
}
</style>
</head>
<body>
	<form:form commandName="goal">
		<form:errors path="*" class="errorBlock" element="div"></form:errors>
		<table>
			<tr>
				<td>Enter Minutes:</td>
				<td><form:input path="minutes" /></td>
				<td><form:errors path="minutes" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enter Goal Inputs">
				</td>
				<td></td>
			</tr>
		</table>
	</form:form>
</body>
</html>