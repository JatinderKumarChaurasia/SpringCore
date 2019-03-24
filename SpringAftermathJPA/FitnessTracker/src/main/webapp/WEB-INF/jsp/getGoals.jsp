<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Goals Report</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>MINUTES</th>
		</tr>
		<c:forEach items="${goals}" var="goal">
			<tr>
				<td>${goal.id}</td>
				<td>${goal.minutes}</td>
				<td>
					<table>
						<tr>
							<th>Exercise Id</th>
							<th>Exercise Minutes</th>
							<th>Exercise Activity</th>
						</tr>
						<c:forEach items="${goal.exercises}" var="exercise">
							<tr>
								<td>${exercise.id}</td>
								<td>${exercise.minutes}</td>
								<td>${exercise.activity}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
		<tr></tr>
	</table>
</body>
</html>