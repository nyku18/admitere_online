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

        <h1>Optiuni</h1>

        <table>
            <tr> 
                <td> Nr. Crt. </td>
                <td> Nume </td>
                <td> Tip Admitere </td>
            </tr>
            <c:forEach var="option" items="${options}">
                <c:set var = "index" scope = "session" value = "0"/>
                <tr> 
                    <td>
                        <c:set var="index" value="${index + 1}"/>
                        <c:out value = "${index}"/>
                    </td>
                    <td>
                        ${option.nume}
                    </td>
                    <td>
                        ${option.tipAdmitere}
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/AddOption?id=${option.id}">Adauga</a>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/UpdateOption?id=${option.id}">Modifica</a>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/DeleteOption?id=${option.id}">Sterge</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>