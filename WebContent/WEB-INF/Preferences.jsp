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
                <li><a href="/Home/Preferences">Preferences</a></li>
                <li><a href="/Home/Search">Recipe Finder</a></li>
                <li><a href="/Home/Login">User Login</a></li>
                <li><a href="/Home/Contact">Contact Us</a></li>
            </ul>
        </nav>
    </header>
        <article id="forms">
        <section>
            <h2>Cuisine Types:</h2>
            <form method="post">
                <h3>A</h3>
                <input type="checkbox" name="african">
                <label>African</label>
                <input type="checkbox" name="american">
                <label>American</label>
                <input type="checkbox" name="asian">
                <label>Asiain</label>
                <input type="checkbox" name="austrian">
                <label>Austrian</label>
                <br>
                <h3>B</h3>
                <input type="checkbox" name="british-isles">
                <label>British Isles</label>
                <br>
                <h3>C</h3>
                <input type="checkbox" name="caribbean">
                <label>Caribbean</label>
                <input type="checkbox" name="chinese">
                <label>Chinese</label>
                <br>
                <h3>F</h3>
                <input type="checkbox" name="french">
                <label>French</label>
                <br>
                <h3>G</h3>
                <input type="checkbox" name="german">
                <label>German</label>
                <input type="checkbox" name="greek">
                <label>Greek</label>
                <br>
                <h3>I</h3>
                <input type="checkbox" name="indian">
                <label>Indian</label>
                <input type="checkbox" name="italian">
                <label>Italian</label>
                <br>
                <h3>L</h3>
                <input type="checkbox" name="latin-american">
                <label>Latin-American</label>
                <br>
                <h3>M</h3>
                <input type="checkbox" name="mediterranean">
                <label>Mediterranean</label>
                <input type="checkbox" name="mexican">
                <label>Mexican</label>
                <br>
                <input type="checkbox" name="middle-eastern">
                <label>Middle Eastern</label>
                <br>
                <h3>R</h3>
                <input type="checkbox" name="russian-eastern-european">
                <label>Russian / Eastern European</label>
                <br>
                <h3>S</h3>
                <input type="checkbox" name="scandinavian">
                <label>Scandinavian</label>
                <br>
                <input type="checkbox" name="spanish-portuguese">
                <label>Spanish / Portuguese</label>
                <br>
                <h3>V</h3>
                <input type="checkbox" name="vietnamese">
                <label>Vietnamese</label>
                <br>
                <br>
                <input type="submit" value="Save">
            </form>
        </section>
    </article>
    <footer>&copy;opyright, All rights reserved.<br>NU-Team 3</footer>
</body>
</html>