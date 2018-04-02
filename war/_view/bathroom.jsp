<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bathroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>
	
	<body  style = text-align:center;>
	<br>
	You seriously need to clean this bathroom!!!! Its a disaster!!!!<br><Br>
	
	What will you do?<br>
	<br>
	<form action="${pageContext.servletContext.contextPath}/medicine" method="doGet">
		<input type="Submit" name="submit" value="Look in the medicine cabinet ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/sink" method="doGet">
		<input type="Submit" name="submit" value="Look under the sink">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/shower" method="doGet">
		<input type="Submit" name="submit" value="Open the shower curtain">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/lightCover" method="doGet">
		<input type="Submit" name="submit" value="Pull off the light cover">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/guestroom" method="doGet">
		<input type="Submit" name="submit" value="Go to the guest room">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="doGet">
		<input type="Submit" name="submit" value="Go to your bedroom">
		</form>
		<br>
		
	</body>
</html>		