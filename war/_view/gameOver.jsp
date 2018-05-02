<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Game Over</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
		<style> 
			body{
			    font-family: 'timeless';
			    font-size: 24px;
			    background-color: #202122;
			} 
 			 .center {
			    display: block;
			    margin-left: auto;
			    margin-right: auto;
			    width: 50%;
			}
			.button {
			    background-color: #7a0000; /* Red */
			    border: none;
			    color: white;
			    padding: 15px 32px;
			    text-align: center;
			    text-decoration: none;
			    display: inline-block;
			    font-size: 16px;
			}
		</style>  
	</head>

	<body>
	<img src="webresources/dead.png" alt="Paris" class="center">

		<div style="text-align:center;">
			<form method = "get" action="/OrganTrail/index">
		    	<button type="submit" name="submit" class="button">Start Over</button>
		    </form>
		</div>

		
	</body>
</html>
