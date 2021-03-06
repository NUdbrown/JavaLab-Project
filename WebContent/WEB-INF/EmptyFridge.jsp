<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/consistent.css">
<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}icons/favicon.ico">
<title>Empty Fridge Cooking</title>
</head>
<body>
    <header>
        <img src="icons/android-icon-192x192.png">
        <img id="secIMG" src="icons/android-icon-192x192.png">
        <h1>College Life Presents:<br> The Empty Fridge</h1>

        <nav>
            <ul>  
                <li><a href="/Home">Home</a>
                </li>
                <li><a href="/Home/Preferences">Preferences</a></li>
                <li><a href="/Home/Search">Recipe Finder</a></li>
                <li><a href="/Home/Login">User Login</a></li>
                <li><a href="/Home/Contact">Contact Us</a></li>
            </ul>
        </nav>
    </header>
    <article id="ingred">
        <section>
            <form method="get" action="/Home/Search">
                <legend>Whats in your fridge? 
                    <p>(separate items with a coma)</p>                       <br>
                </legend>
                Items: 
                <input id="fillIn" type="text" name="ingred">
                <input id="sub" type="submit" value="Sumbit">
            </form>
            <di>
                <img src="images/healthy.jpg">
            </di>
        </section>

    </article>
    <article id="wel">
        <section>
            <h2>Let's Get Cooking!</h2>
            <p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and 
            I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, 
            the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, 
            but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. 
            Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally...</p>
        </section>
    </article>
    <article id="rand">
        <section>
            <img src="images/foodppl.gif">
            <img src="images/empty.gif">
        </section>
    </article>    
    <footer>&copy;opyright, All rights reserved.<br>NU-Team 3</footer>
</body>   
</html>