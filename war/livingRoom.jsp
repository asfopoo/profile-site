<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body  style = text-align:center;>
		<br>
		You are in the living room
		<br>
		There is a tv and a tv changer on a tv stand, a couch, a chair,
		<br> and a mantle over a fake fireplace with a candle on it.
		<br>
		<br>
		<br>
		
		What do you want to do<br>
		<br>
		
		<form action="${pageContext.servletContext.contextPath}/tvRemote" method="Post">
		<input type="Submit" name="submit" vaue="Grab the tv remote">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/couch" method="doGet">
		<input type="Submit" name="submit" value="Check the couch">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/chair" method="doGet">
		<input type="Submit" name="submit" value="Check the chair">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/candle" method="Post">
		<input type="Submit" name="submit" value="Grab the candle">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/firePoker" method="Post">
		<input type="Submit" name="submit" value="Grab the fire poker">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/diningroom" method="doGet">
		<input type="Submit" name="submit" value="Go to the dining room">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="doGet">
		<input type="Submit" name="submit" value="Go to the bathroom">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="doGet">
		<input type="Submit" name="submit" value="Go to the bedroom">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/guestroom" method="doGet">
		<input type="Submit" name="submit" value="Go to the guest room">
		</form>
		<br>
		
		
	</body>
</html>
