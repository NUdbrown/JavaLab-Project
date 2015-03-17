<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/consistent.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/user.css">
<link rel="icon" type="image/png" sizes="16x16" href="icons/favicon.ico">
<title>Happy Cooking!</title>
</head>
<body>
    <header>
        <img src="${pageContext.request.contextPath}/icons/android-icon-192x192.png">
        <img id="secIMG" src="${pageContext.request.contextPath}/icons/android-icon-192x192.png">
        <h1>College Life Presents:<br> The Empty Fridge</h1>
        <nav>
            <ul>  
 				<li><a href="/Home">Home</a></li>
                <li><a href="/Home/Preferences">Preferences</a></li>
                <li><a href="/Home/Search">Recipe Finder</a></li>
                <li><a href="/Home/Login">User Login</a></li>
                <li><a href="/Home/Contact">Contact Us</a></li>
            </ul>
        </nav>
    </header>
    <article id="main">
            <h1>Welcome User #4578!</h1>
      <article id="ingred">
        <section>
            <form method="get" action="/Home/Search">
                <legend>Whats in your fridge? 
                    <p>(separate items with a coma)</p><br>
                </legend>
                Items: 
                <input id="fillIn" type="text" name="ingredients">
                <input id="sub" type="submit">
            </form>
            <di>
                <img src="images/healthy.jpg">
            </di>
        </section>
        </article>
    </article>
    <footer>&copy;opyright, All rights reserved.<br>NU-Team 3</footer>
</body>   
</html>