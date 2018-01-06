<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AddCandidate" method="POST" id="add-candidate">

        <label for="nume">Nume:</label>
        <input type="text" name="nume" maxlength="25" required/>
        <br>

        <label for="initialaTata">Initiala tatalui:</label>
        <input type="text" name="initialaTata" maxlength="1" required/>
        <br>
        
        <label for="prenume">Prenume:</label>
        <input type="text" name="prenume" maxlength="25" required/>
        <br>
        
        <label for="cnp">CNP:</label>
        <input type="number" name="cnp" maxlength="13" required/>
        <br>
        
        <label for="adresa">Adresa:</label>
        <input type="text" name="adresa" maxlength="100" required/>
        <br>
        
        <label for="telefon">Telefon:</label>
        <input type="number" name="telefon" maxlength="12" required/>
        <br>
        
        <label for="email">E-mail:</label>
        <input type="email" name="email" maxlength="25" required/>
        <br>
                
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
        
            <label>Optiuni:</label>
            <br>

            <c:forEach var="option" items="${options}">
                <input type='checkbox' name="option" value="${option.id}"> ${option.nume}
                <br>
            </c:forEach>                 
            
            <br>
        
        <input class="btn" type="submit" value="Aplica"/>
    </form>
    </body>
</html>
