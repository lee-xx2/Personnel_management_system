<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="java.sql.*,javax.sql.*" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>优质资源推荐列表</title>
</head>
<link rel="stylesheet" type="text/css" href="css/show_message.css" />
<body>
<table class="tablecss" border="1px" cellspacing="0px" width="600px" align="center">
	<caption>信息-----------新员工列表</caption> 
	<tr style="background-color: #3471B0;">
	<td>id</td><td>姓名</td><td>年龄</td><td>性别</td><td>专业</td><td>职业经历</td></tr>
	<c:forEach var="jobSeeker" items="${sessionScope.jobSeekerList}" varStatus="status">
	
	<c:if test = "${status.count%2==0}">
		<tr style="background:#D7D7D7">
	</c:if>
	<c:if test = "${status.count%2!=0}">
		<tr style="background:#FAFAF2">
	</c:if>
	<td>${jobSeeker.id}</td>
	<td>${jobSeeker.name}</td>
	<td>${jobSeeker.age}</td>
	<td>${jobSeeker.sex}</td>
	<td>${jobSeeker.major}</td>
	<td>${jobSeeker.career}</td>
	</tr>
	
	</c:forEach>
	
</table>
</body>
</html>