<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Dresser2</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>
	
	<body>
		You got a bunch of junk in here....<br>
		Nothing useful except maybe this lighter.

		
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/FIX ME" method="doGet">
		<input type="Submit" name="submit" value="Take the lighter">
		</form>
		<br>
	</body>
</html>		