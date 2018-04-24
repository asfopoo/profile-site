<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Inventory view</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body>
		inventory (needs styled) 
		
		
		<p>
			<c:forEach var="items" items="${items}">
				<c:out value = "${items}"/> <br>
			</c:forEach>	
		</p>
		<div>
			Inventory Size = <c:out value="${size}" escapeXml="false"/> /35  (whatever we choose)
		</div>
		
	</body>
</html>
