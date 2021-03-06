<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admitere Online</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="bulma.css">
    </head>
    <body>
        <p>${message}</p>
        <div class="form__container">
            <form action="Login" method="POST">  
                <h1 class="title is-size-3">Autentificare</h1>
                <div class="field">
                    <label class="label" for="email">E-mail:</label>
                    <div class="control">
                        <input class="input" type="email" name="email" maxlength="50" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="parola">Parola:</label>
                    <div class="control">
                        <input class="input" type="password" name="parola" maxlength="50" required>
                    </div>
                </div>
                <div class="field">
                    <div class="control">
                        <input class="button is-link" type="submit" value="Log In">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
