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
				var time3 = 9000;
				var time4 = 12000;
				var time5 = 15000;
				var time6 = 18000;
				var time7 = 21000;
				var time8 = 24000;
				var time9 = 27000;
				var time10 = 30000;
				var time11 = 33000;
				var time12 = 36000;
				
				
				function timedText() {
				    setTimeout(myTimeout1, time1) 
				    setTimeout(myTimeout2, time2) 
				    setTimeout(myTimeout3, time3) 
				    setTimeout(myTimeout4, time4) 
				    setTimeout(myTimeout5, time5) 
				    setTimeout(myTimeout6, time6) 
				    setTimeout(myTimeout7, time7) 
				    setTimeout(myTimeout8, time8) 
				    setTimeout(myTimeout9, time9) 
				    setTimeout(myTimeout10, time10) 
				    setTimeout(myTimeout11, time11) 
				    setTimeout(myTimeout12, time12) 
				}   

				function myTimeout1() {
					document.getElementById("demo").innerHTML = "${para1}";
					count++;	
				}	
				function myTimeout2() {
					document.getElementById("demo").innerHTML = " ";
					count++;	
				}	
					
				function myTimeout3() {
					document.getElementById("demo").innerHTML = "${para2}";
					count++;
				}
				
				function myTimeout4() {
					document.getElementById("demo").innerHTML = " ";
					count++;
				}
				function myTimeout5() {
					document.getElementById("demo").innerHTML = "${para3}";
					count++;
				}
				
				function myTimeout6() {
					document.getElementById("demo").innerHTML = " ";
					count++;
				}
				function myTimeout7() {
					document.getElementById("demo").innerHTML = "${para4}";
					count++;	
				}	
				function myTimeout8() {
					document.getElementById("demo").innerHTML = " ";
					count++;	
				}	
					
				function myTimeout9() {
					document.getElementById("demo").innerHTML = "${para5}";
					count++;
				}
				
				function myTimeout10() {
					document.getElementById("demo").innerHTML = " ";
					count++;
				}
				function myTimeout11() {
					document.getElementById("demo").innerHTML = "${para6}";
					count++;
				}
				
				function myTimeout12() {
					document.getElementById("demo").innerHTML = " ";
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
