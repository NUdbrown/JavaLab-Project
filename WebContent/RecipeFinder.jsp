<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/consistent.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/Search_Archive.css" title="default">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/Search_Full.css" title="fullView">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/Search_List.css" title="list">
<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/icons/favicon.ico">
<script Response.ContentType="text/js" src="${pageContext.request.contextPath}/styleSwitch.js"></script>
<title>Empty Fridge</title>
</head>
<body>
    <header>
        <img src="${pageContext.request.contextPath}/icons/android-icon-192x192.png">
        <h1>Welcome to Empty Fridge!</h1>
    </header>
	<nav>
		<ul>  
		  <li><a href="/Home">Home</a></li>
		  <li><a href="EmptyFridge.html">Preferences</a></li>
		  <li><a href="/Home/search">Recipe Finder</a></li>
		  <li><a href="EmptyFridge.html">User Login</a></li>
            <li><a href="EmptyFridge.html">Contact Us</a></li>
		</ul>
		<br/>
		<br/>
	</nav>
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