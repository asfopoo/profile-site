<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Bedroom</title>
		
	</head>

	<body>
		You have just woken up<br><br><br>
		How did I sleep so long?<br>
		What time is it?<br>
		... screw sitting around this place, im getting outta here!!!!!<br><br><br>
		Grab what you need and get on the road, keep in mind, you can only take what you can carry!!!! <br><br<br>
		
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
					<td><input type="text" name="first" size="12" value="${numbers.firstChoice}" /></td>
				</tr>
			</table>
		<input type="Submit" name="submit" value="submit">
		</form>	
		
		
		
	</body>
</html>
