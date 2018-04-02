<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Shower</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<style>
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}
		</style>
	
	</head>
	
	<body style = text-align:center;>
		<img src="https://i.imgur.com/l5KJQwd.jpg" alt="Shower" style="width:600px;height:600px;"> 
		<br>
		<br>Thats gross bro!!!!<br>
		<br>
		<form action="${pageContext.servletContext.contextPath}/shower" method="doGet">
		<input type="Submit" name="submit" value="Take the shampoo">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
	</body>
</html>		