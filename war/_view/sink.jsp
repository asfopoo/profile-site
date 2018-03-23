<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Sink</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>
	
	<body>
		<img src="https://i.imgur.com/Yq5sG94.jpg" alt="Sink" style="width:500px;height:500px;"> 
		<br>
		<form action="${pageContext.servletContext.contextPath}/sink" method="deGet">
		<input type="Submit" name="submit" value="Take toilet paper">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
	</body>
</html>		