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
    <div class="navbar-collapse collapse" id="navbar-main">
        <form class="navbar-form navbar-right" role="search" action="<%=request.getContextPath()%>/login/loginCheck">
            <div class="form-group">
                <input type="text" class="form-control" name="userid" placeholder="Username">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="userpwd" placeholder="Password">
            </div>
            <button><input type="submit" class="btn btn-default" value="로그인"></button>
        </form>
    </div>
</body>
</html>