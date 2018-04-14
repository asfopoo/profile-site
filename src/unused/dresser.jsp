<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Dresser</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		
		<style>
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}
</style>
	</head>
	
	<body style = text-align:center;>
		<img src="https://i.imgur.com/vkX1cF8.jpg" alt="Empty Drawer" style="width:50%;">
		Aint shit in there bro <br>
		Keep moving
		<br>
		<br>
		
		<form method = "get" action="/OrganTrail/bedroom">
			<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Go back</button>
		</form>
	</body>
</html>		