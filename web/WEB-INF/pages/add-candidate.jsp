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
            <form action="AddCandidate" method="POST" id="add-candidate">
                <h1 class="title is-size-4">Inscriere</h1>
                <div class="field">
                    <label class="label" for="nume">Nume</label>
                    <div class="control">
                        <input class="input" type="text" name="nume" maxlength="25" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="initialaTata">Initiala tatalui</label>
                    <div class="control">
                        <input class="input" type="text" name="initialaTata" maxlength="1" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="prenume">Prenume</label>
                    <div class="control">
                        <input class="input" type="text" name="prenume" maxlength="25" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="cnp">CNP</label>
                    <div class="control">
                        <input class="input" type="number" name="cnp" maxlength="13" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="adresa">Adresa</label>
                    <div class="control">
                        <input class="input" type="text" name="adresa" maxlength="100" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="telefon">Telefon</label>
                    <div class="control">
                        <input class="input" type="number" name="telefon" maxlength="12" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label" for="email">E-mail</label>
                    <div class="control">
                        <input class="input" type="email" name="email" maxlength="25" required>
                    </div>
                </div>                    
                <div class="field">
                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
                        <label class="label">Optiuni</label>
                        <c:forEach var="option" items="${options}">
                            <div class="control">
                                <input type='checkbox' name="option" value="${option.id}"> ${option.nume} pe baza de ${option.tipAdmitere}
                            </div>
                        </c:forEach> 
                    <div class="control">
                        <input class="button is-link" type="submit" value="Aplica">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
