<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.2-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/gen.css">
<link rel="stylesheet" type="text/css" Response.ContentType="text/css" href="${pageContext.request.contextPath}/css/consistent.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/pref.css">
<link rel="icon" type="image/png" sizes="16x16" href="icons/favicon.ico">
<title>What's Your Taste?</title>
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
        </nav>
    </header>
    <article id="forms">
        <section>
            <h3>Method</h3>
            <form method="post">
                <input type="checkbox" name="Roast"><label>Roast</label>
                <input type="checkbox" name="Baked">
                <label>Baked</label>
                <input type="checkbox" name="Boiled">
                <label>Boiled</label>
                <br>
                <input type="submit" value="Save" #save>
            </form>
        </section>
        <section>
            <h3>Cuisine</h3>
            <form>
                <input type="checkbox" name="french">                             <label>French</label>
                <input type="checkbox" name="italian">
                <label>Italian</label>
                <input type="checkbox" name="american">
                <label>American</label>
                <br>
                <input type="checkbox" name="asian">
                <label>Asiain</label>
                <input type="checkbox" name="chinese">
                <label>Chinese</label>
                <input type="checkbox" name="mexican">
                <label>Mexican</label>
                <br>
                <input type="checkbox" name="latinAmerican">
                <label>Latin-American</label>
                <input type="checkbox" name="caribbean">
                <label>Caribbean</label>
                <br>
                <input type="submit" value="Save">
            </form>
        </section>
    </article>
    <footer>&copy;opyright, All rights reserved.<br>NU-Team 3</footer>
</body>
</html>