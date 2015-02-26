<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/gen.css">
<link rel="icon" type="image/png" sizes="16x16" href="icons/favicon.ico">
<title>Empty Fridge Cooking</title>
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
	</nav>
	<br>
	<div>
		${recipe}
	</div>
</body>
</html>