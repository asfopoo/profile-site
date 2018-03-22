<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>
	
	<body>
	You seriously need to clean this bathroom!!!! Its a disaster!!!!<br><Br>
	
	What will you do?
	<br>
	<form action="${pageContext.servletContext.contextPath}/dresser" method="deGet">
		<input type="Submit" name="submit" value="check the first dresser ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/dresser2" method="doGet">
		<input type="Submit" name="submit" value="check the second dresser">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bed" method="doGet">
		<input type="Submit" name="submit" value="     check the bed       ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bed" method="doGet">
		<input type="Submit" name="submit" value="      make the bed      ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/tv" method="doGet">
		<input type="Submit" name="submit" value="     turn the tv off    ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="     leave the room     ">
		</form>
		<br>
		
	</body>
</html>		