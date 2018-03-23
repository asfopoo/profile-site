<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>
	
	<body>
	
		Just a light... Quit wasting time!!!!
		<br>
	
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
	</body>
</html>		