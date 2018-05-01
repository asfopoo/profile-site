<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Organ Trail</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<link rel="stylesheet" href="webresources/game.css"/>
		<style>
			.btn-group .button {
			    background-color: #545454; /* Green */
			    border: none;
			    color: white;
			    padding: 15px 32px;
			    text-align: center;
			    text-decoration: none;
			    display: inline-block;
			    font-size: 16px;
			    cursor: pointer;
			    float: left;
			    width: 500px;
			}
	
			.btn-group .button:hover {
			    background-color: #a9a9a9;
			}
		
		</style>
	</head>

	
		<div class="options">     <!-- javascript modeled from w3 schools example -->
		<body>
			<div class="picture">
				<img src="webresources/car.gif" alt="Linear Image">  
			</div>

			<div class="para">
				<c:out value= "${para}" escapeXml= "false" />
			</div>

		<br>
		<br>
		<br>
		
			<div class="btn-group">
				<form method = "get" action="/OrganTrail/inventory">
					<button type="submit" name="submit" class="button">Inventory</button>
				</form>				
				<form method = "get" action="/OrganTrail/map">
					<button type="submit" name="submit" class="button">Map</button>				
				</form>
				<form method = "get" action="/OrganTrail/look">
					<button type="submit" name="submit" class="button">Take a look around</button>				
				</form>
				<form method = "get" action="/OrganTrail/linear">
					<button type="submit" name="submit" class="button">keep moving</button>				
				</form>
				<form method = "get" action="/OrganTrail/rest">
					<button type="submit" name="submit" class="button">Rest</button>				
				</form>
				<form method = "get" action="/OrganTrail/minigame">
					<button type="submit" name="submit" class="button">kill zombies</button>				
				</form>
			</div>	
			
			<p style= "clear:both"></p>
				
			
		</div>
		
		
	</body>
</html>
