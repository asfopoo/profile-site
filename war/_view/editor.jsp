<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Editor</title>
<head>
	<link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
</head>
<body>
		<h1>Add an area</h1>
		<form action="${pageContext.servletContext.contextPath}/editor"
			method="post">
			<input type="name" name="name"placeholder="Area Name"/>
			<input type="para" name="para" placeholder="Paragraph"/> 
			<input type="pic" name="pic"placeholder="Picture"/>
			<input type="op1" name="o1"placeholder="Option"/>
			<input type="op2" name="o2"placeholder="Option"/>
			<input type="op3" name="o3"placeholder="Option"/>
			<input type="op4" name="o4"placeholder="Option"/>
			<input type="op5" name="o5"placeholder="Option"/>
			<input type="op6" name="o6"placeholder="Option"/>
			<input type="link1" name="ln1"placeholder="Option"/>
			<input type="link2" name="ln2"placeholder="Option"/>
			<input type="link3" name="ln3"placeholder="Option"/>
			<input type="link4" name="ln4"placeholder="Option"/>
			<input type="link5" name="ln5"placeholder="Option"/>
			<input type="link6" name="ln6"placeholder="Option"/>
			<button type="submit" name="submit"
				class="btn btn-primary btn-block btn-large">Create Area</button>
		</form>
</body>
</html>