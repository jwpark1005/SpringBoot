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
    <div>
        <form action="/signcheck">
            <div>
                <input type="text" name="userid" placeholder="Userid">
            </div>
            <div>
                <input type="password" name="userpwd" placeholder="Password">
            </div>
            <button><input type="submit" value="로그인"></button>
        </form>
    </div>
</body>
</html>