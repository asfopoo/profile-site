<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Organ Trail</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<link rel="stylesheet" href="webresources/game.css"/>
	</head>

	<body>
		<div class="options">
			<div class="para">
				<c:out value="${para}" escapeXml="false" />
			</div>
		<br>
		<br>
		<br>
			<p>
				<c:out value="${questionHead}" escapeXml="false" /><br>
				<c:out value="${q1}" escapeXml="false" /><br>
				<c:out value="${q2}" escapeXml="false" /><br>
				<c:out value="${q3}" escapeXml="false" /><br>
				<c:out value="${q4}" escapeXml="false" /><br>
				<c:out value="${q5}" escapeXml="false" /><br>
				<c:out value="${q6}" escapeXml="false" /><br>
			</p>
			<form action="${pageContext.servletContext.contextPath}/game" method="post">
				<p>
						Your choice:
						<br>
						<input type="text" name="first" size="12" value="${choice}" />
						<br>
						<input type="Submit" name="submit" value="submit">
				</p>
			</form>	
			
		</div>
		
		
	</body>
</html>
