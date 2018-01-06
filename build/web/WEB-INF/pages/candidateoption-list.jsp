<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

        <h1>Candidate Options</h1>

        <table>
            <tr> 
                <td> Nr. Crt. </td>
                <td> Nume </td>
                <td> Tip Admitere </td>
            </tr>
            <c:forEach var="candidateoption" items="${candidateoptions}">
                <tr> 
                    <td>
                        ${candidateoption.id}
                    </td>
                    <td>
                        ${candidateoption.idCandidat}
                    </td>
                    <td>
                        ${candidateoption.idOptiune}
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
