<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body  style = text-align:center;>
		Not much in here... 
		<br>
		<br>
		<br>
		
		<form action="${pageContext.servletContext.contextPath}/bed" method="doGet">
		<input type="Submit" name="submit" value="Check the bed">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/nightstand" method="doGet">
		<input type="Submit" name="submit" value="Check the night stand">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/window" method="doGet">
		<input type="Submit" name="submit" value="look out the window">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="      Go to the bathroom     ">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="doGet">
		<input type="Submit" name="submit" value="Go to your bedroom">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/living room" method="doGet">
		<input type="Submit" name="submit" value=" Go downstairs ">
		</form>
		<br>
		
		
	</body>
</html>
