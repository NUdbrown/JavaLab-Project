<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/consistent.css">
<link rel="icon" type="image/png" sizes="16x16" href="icons/favicon.ico">
<title>Empty Fridge Cooking</title>
</head>
<body>
    <header>
        <img src="${pageContext.request.contextPath}icons/android-icon-192x192.png">
        <img id="secIMG" src="${pageContext.request.contextPath}icons/android-icon-192x192.png">
        <h1>College Life Presents:<br> The Empty Fridge</h1>

        <nav>
            <ul>  
                <li><a href="/Home">Home</a>
                </li>
                <li><a href="#">Preferences</a></li>
                <li><a href="/Home/search">Recipe Finder</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">User Login</a></li>
            </ul>
        </nav>
    </header>
    <article id="ingred">
        <section>
            <form method="get">
                <legend>Whats in your fridge? 
                    <p>(separate items with a coma)</p>                       <br>
                </legend>
                Items: 
                <input id="fillIn" type="text" name="usrname">
                <input id="sub" type="submit">
            </form>
            <di>
                <img src="${pageContext.request.contextPath}images/healthy.jpg">
            </di>
        </section>

    </article>
    <article id="wel">
        <section>
            <h2>Let's Get Cooking!</h2>
            <p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally...</p>
        </section>
    </article>
    <article id="rand">
        <section>
            <img src="${pageContext.request.contextPath}images/foodppl.gif">
            <img src="${pageContext.request.contextPath}images/empty.gif">
        </section>
    </article>    
    <footer>&copy;opyright, All rights reserved.<br>NU-Team 3</footer>
</body>   
</html>