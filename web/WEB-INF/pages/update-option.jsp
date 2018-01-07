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
            <form action="UpdateOption" method="POST" id="add-option">
                <input type='hidden' value="${option.id}" name='id'/>
                <div class="field">
                    <label class="label" for="nume">Nume</label>
                    <div class="control">
                        <input class="input" type="text" name="nume" maxlength="50" value="${option.nume}" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="tip_admitere">Tip Admitere</label>
                    <div class="control">
                        <input class="input" type="text" name="tip_admitere" maxlength="10" value="${option.tipAdmitere}" required>
                    </div>
                </div>
                <div class="field">
                    <div class="control">
                        <input class="button is-link" type="submit" value="Modifica">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
