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
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
        <div class="container">
            <h1 class="title is-size-4">Candidati</h1>
            <table class="table is-striped">
                <tr> 
                    <td>Nr. Crt.</td>
                    <td>Nume</td>
                    <td>Initiala tatalui</td>
                    <td>Prenume</td>
                    <td>CNP</td>
                    <td>Adresa</td>
                    <td>Telefon</td>
                    <td>E-mail</td>
                </tr>
                <c:forEach var="candidate" items="${candidates}">
                    <c:set var = "index" scope = "session" value = "0"/>
                    <tr> 
                        <td>
                            <c:set var="index" value="${index + 1}"/>
                            <c:out value = "${index}"/>
                        </td>
                        <td>
                            ${candidate.nume}
                        </td>
                        <td>
                            ${candidate.initialaTata}
                        </td>
                        <td>
                            ${candidate.prenume}
                        </td>
                        <td>
                            ${candidate.cnp}
                        </td>
                        <td>
                            ${candidate.adresa}
                        </td>
                        <td>
                            ${candidate.telefon}
                        </td>
                        <td>
                            ${candidate.email}
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/DeleteCandidate?id=${candidate.id}">Sterge</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>