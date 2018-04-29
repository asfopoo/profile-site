<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Health view</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body>
		Health
		<br>
		<br>
		<br>
	
		<div>
			Health = <c:out value="${size}" escapeXml="false"/> /20  
		</div>
		<div>
			<progress value = "${size}" max = "20"></progress>
		</div>

	</body>
</html>
