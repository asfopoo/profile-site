<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Medicine Cabinet</title>
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
	
	<img src="https://i.imgur.com/ojgDg4A.jpg" alt="Medicine Cabinet" style="width:600px;height:600px;"> 
	<br>
	<form action="${pageContext.servletContext.contextPath}/medicine" method="deGet">
		<input type="Submit" name="submit" value="Take band-aids">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="Go back">
		</form>
	</body>
</html>		