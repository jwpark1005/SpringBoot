<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table border="1">
    <c:forEach var="item" items="${result}">
        <tr>
            <td>
                <li>${item.uname}</li>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>