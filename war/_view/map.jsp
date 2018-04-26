<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Map view</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<style>  
 			img {  
    		display: block;  
 			margin-left: auto;  
 			margin-right: auto;  
		</style>  
	</head>

	<body>
		map styling 
		<img src="webresources/map.jpg" alt="Map" style="width:600px;height:600px;"> 
		
		<br>
		<br>
		<br>
		<div>
			<form method = "get" action="/OrganTrail/linear">
				<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Go Back</button>
			</form>
		</div>
	</body>
</html>
