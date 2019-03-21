<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$("h1").css("background-color", "yellow");

	$(document)
			.ready(
					function() {
						//First Way
						/*$
								.getJSON(
										'http://localhost:8080/FitnessTracker/activities.json',
										{
											ajax : 'true'
										},
										function(data) {
											var html = '<option value="">---Select Any One of Them---</option>';
											var len = data.length;
											for (var i = 0; i < len; i++) {
												html += '<option value="' + data[i].desc + '">'
														+ data[i].desc
														+ '</option>';
											}
											html += '</option>';
											$('#activities').html(html);
										});
						*/
						//Second Way
						$
						.getJSON(
								'<spring:url value="activities.json"/>',
								{
									ajax : 'true'
								},
								function(data) {
									var html = '<option value="">---Select Any One of Them---</option>';
									var len = data.length;
									for (var i = 0; i < len; i++) {
										html += '<option value="' + data[i].desc + '">'
												+ data[i].desc
												+ '</option>';
									}
									html += '</option>';
									$('#activities').html(html);
								});
					}
					
					);
	
</script>
<title>AddMinutes</title>
</head>
<body>
	<h1>Add Minutes</h1>
	Language:
	<a href="?Language=en">English</a>|
	<a href="?Language=es">Espanol</a>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text" /></td>
				<td><form:input path="minutes" /></td>
				<td><form:select id="activities" path="activity">
					</form:select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter Exercise" />
				</td>
			</tr>
		</table>
	</form:form>
	<h1>Goal You Stored:${goal.minutes}</h1>
</body>
</html>