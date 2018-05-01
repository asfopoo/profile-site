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
				<img src="webresources/car.gif" alt="Linear Image">  
			</div>
			
	<br>
	

			
			
			
			
			
			Health -> <c:out value="${size}" escapeXml="false"/> /20 
			<progress value = "${size}" max = "20"></progress>
	
				//throw in day count, health etc.  this page cannot map to other locations
			
		</div>
		
		<script>
			window.location = "linePara";
			
			</script>
			
		
		
	</body>
</html>
