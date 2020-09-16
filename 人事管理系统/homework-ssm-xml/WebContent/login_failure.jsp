<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆失败页面</title>
</head>
<body>
<center>

    <h2>登陆失败，请重新登陆!${requestScope.reason}<br>
 
     <a href="login.jsp">重试</a>
    </h2>
    
    </center>
</body>
</html>