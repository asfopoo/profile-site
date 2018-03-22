<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
	</head>

	<body>
		You have just woken up<br><br><br>
		How did I sleep so long?<br>
		What time is it?<br>
		... screw sitting around this place, im getting outta here!!!!!<br><br><br>
		Grab what you need and get on the road, keep in mind, you can only take what you can carry!!!! 
		<br>
		You are in a room.  There are two dressers and a tv turned on to the local news.
		<br>
		<br>
		<br>
		
		What do you want to do<br>
		1. check the first dresser<br>
		2. check the second dresser<br>
		3. check the bed<br>
		4. make the bed<br>
		5. turn the tv off<br>
		6. leave the room<br>
		
	
		
		<form action="${pageContext.servletContext.contextPath}/bedroom" method="post">
			<table>
				<tr>
					<td class="label">Your choice:</td>
					<td><input type="text" name="choice" size="12" value="${game.choice}" /></td>
				</tr>
			</table>
		<input type="Submit" name="submit" value="submit">
		</form>	
		
		
		
	</body>
</html>
