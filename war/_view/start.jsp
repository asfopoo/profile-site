<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: gray;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
    text-align: justify;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
    text-align: justify;
}
</style>
</head>
<body bgcolor: #FDF5E6 >

<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>

<div class="container">

<header>
   <h1>YORK DAILY SUN</h1>
</header>
  
<nav>
  <p> Always remeber fire saftey.  Use any available extiguisher possible and always remeber to stop drop and roll....some other hint to be used later in the game!!!</p>
</nav>

<article>
  <h1>Breaking News</h1>
  <p>There was a recent outbreak of the mutated rabies virus that has been causing mass hysteria.
      If infected, the virus causes high fever quickly followed
	  by some form of psychosis.  Authorities are still looking into the origin , but everyone
	  is urged to stay inside and lock all doors and windows.  The infected are considered extremely 
	  dangerous!!!!</p>
  <p>The CDC is strongly urging everyone to wear protective masks, long sleeves and long pants.  Everyone is urged to protect themselves
  		at all costs.  Stock up on food and water as much as possible.</p>
</article>

<footer>Co-written by Ed Nardo and Greg Plachno </footer>

</div>

<form action="${pageContext.servletContext.contextPath}/start" method = "post"
	<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Click to continue</button>
</form>

</body>
</html>
