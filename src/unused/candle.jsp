<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Couch</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		
		
	</head>
	
	<body style = text-align:center;>
	
		
		<br>You took the candle<br>

		
		<br>
		<form action="${pageContext.servletContext.contextPath}/livingroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
		<br>
	</body>
</html>		