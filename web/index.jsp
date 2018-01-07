<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admitere Online</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="bulma.css">
    </head>
    <body>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>        
        <c:set var="message" value="<%=request.getParameter("message") %>"/>
        <c:if test="${(message != null)}">
            <p><c:out value="${message}"/></p>
        </c:if>
        <div class="container">
            <h1 class="title is-size-1 has-text-centered">Admitere Online</h1>
            <h2 class="subtitle is-size-4 has-text-centered">Departamentul de Calculatoare şi Inginerie Electrică</h2>
            <h2 class="subtitle is-size-4 has-text-centered">Facultatea de Inginerie</h2>
            <h2 class="subtitle is-size-4 has-text-centered">Universitatea "Lucian Blaga" din Sibiu</h2>
            <div class="content">
                <h3 class="title is-size-3">Bine ati venit!</h3>
                <p>Sunteţi pe situl oficial de admitere al Departamentului de Calculatoare şi Inginerie Electrică.</p>
                <p>Învăţământul universitar în domeniul Calculatoare şi Inginerie Electrică a apărut în Sibiu în anul 1986, când s-a înfiinţat specializarea Calculatoare, studii inginereşti cu durata de 5 ani.</p>
                <p>Astăzi, şcoala de Calculatoare şi Inginerie Electrică din Sibiu oferă întreaga gamă de programe universitare: programe de licenţă, programe de master şi programe de doctorat.</p>
            </div>
            <aside class="menu">
                <ul class="menu-list">
                    <li>
                        <a class="menu__item" href="http://localhost:8080/AdmitereOnline/AddCandidate">Inscriere</a>
                    </li>
                    <li>
                        <a class="menu__item" href="http://localhost:8080/AdmitereOnline/Login">Autentificare</a>
                    </li>
                    <li>
                        <a class="menu__item" href="http://localhost:8080/AdmitereOnline/OptionListVisitor">Optiuni</a> 
                    </li>
                </ul>
            </aside>
        </div>
    </body>
</html>
