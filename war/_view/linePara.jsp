<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Organ Trail</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<link rel="stylesheet" href="webresources/game.css"/>
	</head>

	
		<div class="options">     <!-- javascript modeled from w3 schools example -->
		<body>
			<div class="picture">
				<img src="webresources/car.gif" alt="Linear Image">  
			</div>
			//// need a linear bar across the screen
			<div class="para">
				<p id="demo"></p>
			</div>
			
			<button onclick="timedText()">Start</button>

			
			
			<script>
				var count = 0;
				var time1 = 3000;
				var time2 = 6000;
				
				
				function timedText() {
				    setTimeout(myTimeout1, time1) 
				    setTimeout(myTimeout2, time2) 
				}   

				function myTimeout1() {
					document.getElementById("demo").innerHTML = "${para1}";
					count++;
						
				}	
					
				function myTimeout2() {
					document.getElementById("demo").innerHTML = "${para2}";
					count++;
				}
				
					
					
			</script>
		<br>
		<br>
		<br>
		
			
				<form method = "get" action="/OrganTrail/inventory">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Inventory</button>
				</form>
				
				<form method = "get" action="/OrganTrail/map">
					<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Map</button>				
				</form>
				
				
			
		</div>
		
		
	</body>
</html>
