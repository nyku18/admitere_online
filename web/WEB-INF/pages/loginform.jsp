<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>${message}</p>
        
        <form action="Login" method="POST">
            <label for="email">e-mail:</label>
            <input type="email" name="email" maxlength="50" required/>
            <br>
            
            <label for="parola">Parola:</label>
            <input type="password" name="parola" maxlength="50" required/>
            <br>
            
            <input class="btn" type="submit" value="Log In"/>
        </form>
        
    </body>
</html>
