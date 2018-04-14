<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Nightstand</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		
	
	</head>
	
	<body style = text-align:center;>
	
	
	
	<br>
	Nightstand things
	<br>
	<br>
		<form action="${pageContext.servletContext.contextPath}/guestroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
	</body>
</html>		