<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/consistent.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/Search_Archive.css" title="default">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/Search_Full.css" title="fullView">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/Search_List.css" title="list">
<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/icons/favicon.ico">
<script Response.ContentType="text/js" src="${pageContext.request.contextPath}/js/styleSwitch.js"></script>
<title>Empty Fridge</title>
</head>
<body>
    <header>
        <img src="${pageContext.request.contextPath}/icons/android-icon-192x192.png">
        <img id="secIMG" src="${pageContext.request.contextPath}/icons/android-icon-192x192.png">
        <h1>College Life Presents:<br> The Empty Fridge</h1>
    <nav>
		<ul>  
		  <li><a href="/Home">Home</a></li>
		  <li><a href="/Preferences">Preferences</a></li>
		  <li><a href="/Search">Recipe Finder</a></li>
		  <li><a href="/Login">User Login</a></li>
            <li><a href="/Contact">Contact Us</a></li>
		</ul>
		<br/>
		<br/>
	</nav>
	</header>
	<br/>
	<br/>
	<br/>
	<br/>
	<form method="get" action="/Home/Search">
		<label for="ingred">Any Ingredients in a recipe&nbsp;</label><input type="text" name="ingred"><br/>
		<label for="ingred">Cuisine of a recipe&nbsp;</label><input type="text" name="cuisine"><br/>
		<label for="ingred">Cooking Method of a recipe&nbsp;</label><input type="text" name="methodCook"><br/>
        <input id="sub" type="submit">
	</form>
	<br/>
	<br/>
	
	<form>
		<input type="submit" onclick="switch_style('default');return false;" name="theme" value="Archive View" id="archive">
		<input type="submit" onclick="switch_style('fullView');return false;" name="theme" value="Full View" id="full">
		<input type="submit" onclick="switch_style('list');return false;" name="theme" value="List View" id="list">
	</form>
		<div class="container">
			${recipe}
		</div>
    </body>
</html>