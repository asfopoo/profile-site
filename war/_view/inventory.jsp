<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Inventory view</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body>
		inventory styling 
		
		
		<p>
			<c:out value="${questionHead}" escapeXml="false" /><br>
			<c:out value="${item1}" escapeXml="false" /><br>
			<c:out value="${item2}" escapeXml="false" /><br>
			<c:out value="${item3}" escapeXml="false" /><br>
			<c:out value="${item4}" escapeXml="false" /><br>
			<c:out value="${item5}" escapeXml="false" /><br>
			<c:out value="${item6}" escapeXml="false" /><br>
			<c:out value="${item7}" escapeXml="false" /><br>
			<c:out value="${item8}" escapeXml="false" /><br>
			<c:out value="${item9}" escapeXml="false" /><br>
			<c:out value="${item10}" escapeXml="false" /><br>
			
		</p>
		<div>
			Inventory = <c:out value="${size}" escapeXml="false"/> /35  (whatever we choose)
		</div>
		
	</body>
</html>
