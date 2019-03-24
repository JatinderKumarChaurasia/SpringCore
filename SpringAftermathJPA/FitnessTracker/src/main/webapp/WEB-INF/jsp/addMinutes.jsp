<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link rel="shortcut icon" href="assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/ico/apple-touch-icon-57-precomposed.png">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
<body class="container">
	<div class="navbar navbar-fixed-top navbar-inverse mt-5">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="#"> <spring:message
						code="minutes.exercised" />
				</a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div>
			<h1>
				<spring:message code="minutes.exercised" />
			</h1>
		</div>
		<a class="btn" href="?Language=en"> English </a> <a class="btn"
			href="?Language=es"> Spanish </a> <br /> <br />
		<form:form modelAttribute="exercise">
			<form:errors path="*" cssClass="errorblock" element="div" />
			<div class="control-group">
				<label for="textinput1"> <spring:message code="minutes.text" />
				</label>
				<form:input path="minutes" />
				<form:errors path="minutes" cssClass="error" />
			</div>

			<div class="control-group">
				<label for="selectinput1"> <spring:message
						code="minutes.activity" />
				</label>
				<form:select id="activities" path="activity" />
			</div>

			<input type="submit" class="btn"
				value="<spring:message code="minutes.button.enter"/>" />

		</form:form>

		<span class="label"> <spring:message code="minutes.goal" />
			${goal.minutes}
		</span>
	</div>

	<script src="assets/js/bootstrap.js">
		
	</script>
</body>
</html>