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
		You have just woken up<br><br><br>
		How did I sleep so long?<br>
		What time is it?<br>
		... screw sitting around this place, im getting outta here!!!!!<br><br><br>
		Grab what you need and get on the road, keep in mind, you can only take what you can carry!!!! 
		<br>
		You are in your bedroom.  There are two dressers and a tv turned on to the local news.
		<br>
		<br>
		<br>
		
		What do you want to do<br>
		<br>
		
		<form action="${pageContext.servletContext.contextPath}/dresser" method="doGet">
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
		<form action="${pageContext.servletContext.contextPath}/bathroom" method="post">
		<input type="Submit" name="submit" value="     leave the room     ">
		</form>
		<br>
		
		
	</body>
</html>
