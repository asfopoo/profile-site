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
				<c:out value="${para2}" escapeXml="false" />
			</div>
			
			<button onclick="timedText()">Try it</button>

			<p id="demo">Click on "Try it". I will display when two, four, and six seconds have passed.</p>
			
			<script>
				function timedText() {
				    setTimeout(myTimeout1, 2000) 
				    setTimeout(myTimeout2, 4000) 
				    setTimeout(myTimeout3, 6000) 
				}
				function myTimeout1() {
				    document.getElementById("demo").innerHTML = "${para3}";
				}
				function myTimeout2() {
				    document.getElementById("demo").innerHTML = "${para4}";
				}
				function myTimeout3() {
				    document.getElementById("demo").innerHTML = "${para5}";
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
