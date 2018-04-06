<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Under Couch</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		
		
	</head>
	
	<body style = text-align:center;>
	
		
		<br>Just a bunch of dust and gunk.... <br>

		
		
		<br>
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="Post">
		<input type="Submit" name="submit" value="Go back">
		</form>
		<br>
	</body>
</html>		