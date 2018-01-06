<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

        <h1>Candidates</h1>

        <table>
            <tr> 
                <td> Nr. Crt. </td>
                <td> Nume </td>
                <td> Initiala tataului </td>
                <td> Prenume </td>
                <td> CNP </td>
                <td> Adresa </td>
                <td> Telefon </td>
                <td> e-mail </td>
            </tr>
            <c:forEach var="candidate" items="${candidates}">
                <tr> 
                    <td>
                        ${candidate.id}
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
    </body>
</html>