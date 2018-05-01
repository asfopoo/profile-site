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
			//// need a linear bar across the screen
			<div id= "delay">
				<button onclick="timedText()"> start? </button>
			</div>
			
		<br>
		<br>
		<br>
		
			<script>
				var time1 = 3000;
				function timedText() {
				    setTimeout(myTimeout1, time1) 
				}
				
				function myTimeout1() {
					document.getElementById("delay").innerHTML = "test time";
					window.location = "linePara";	
				}	
				
				
			</script>
				<form method = "get" action="/OrganTrail/inventory">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Inventory</button>
				</form>
				
				<form method = "get" action="/OrganTrail/map">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Map</button>				
				</form>		
			
		</div>
		
		<form method = "get" action="/OrganTrail/linePara">
				</form>		
		
		
	</body>
</html>
