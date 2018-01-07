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
        <div class="form__container">
            <form action="AddOption" method="POST" id="add-option">
                <div class="field">
                    <label class="label" for="nume">Nume</label>
                    <div class="control">
                        <input class="input" type="text" name="nume" maxlength="50" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="tip_admitere">Tip Admitere</label>
                    <div class="control">
                        <input class="input" type="text" name="tip_admitere" maxlength="10" required>
                    </div>
                </div>
                <div class="field">
                    <div class="control">
                        <input class="button is-link" type="submit" value="Adauga">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
