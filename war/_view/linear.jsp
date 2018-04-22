<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Organ Trail</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<link rel="stylesheet" href="webresources/game.css"/>
	</head>

	
		<div class="options">
		<body>
			<div class="picture">
				<img src="webresources/${pic}" alt="Linear Image">  //float right pic of car
			</div>
			//// need a linear bar across the screen
			<div class="para">
				<c:out value="${para}" escapeXml="false" />
			</div>
		<br>
		<br>
		<br>
			<p>
				<c:out value="${questionHead}" escapeXml="false" /><br>
				<c:out value="${q1}" escapeXml="false" /><br>                ////// change meeeeeee
				<c:out value="${q2}" escapeXml="false" /><br>
				<c:out value="${q3}" escapeXml="false" /><br>
				<c:out value="${q4}" escapeXml="false" /><br>
				<c:out value="${q5}" escapeXml="false" /><br>
				<c:out value="${q6}" escapeXml="false" /><br>
			</p>
			
				<form method = "get" action="/OrganTrail/inventory">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Inventory</button>			//// style buttons	
				</form>
				
				<form method = "get" action="/OrganTrail/map">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Map</button>				
				</form>
				
				
			
		</div>
		
		
	</body>
</html>
