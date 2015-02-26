<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/gen.css">
<link rel="icon" type="image/png" sizes="16x16" href="icons/favicon.ico">
<title>Empty Fridge</title>
</head>
<body>
    <header>
        <img src="/icons/android-icon-192x192.png">
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
    	${recipe}
    </body>
</html>