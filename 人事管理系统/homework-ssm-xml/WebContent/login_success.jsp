<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page import="com.gdut.beans.Existing_worksheet" %>
     <%@ page import="com.gdut.beans.Page" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=utf-8">
<title>登录成功</title>
<link rel="stylesheet" type="text/css" href="css/login_success.css" />
</head>
<%
	
	String work = (String)session.getAttribute("a");
%>
	<script>
		if('${message}'!=""){
			alert('${message}');
		}
	</script>
<body>
	<div class="bannerF">
	<div class="header">
				
				<div id="a_con">
				    <a href="${pageContext.request.contextPath}/delete.do?accound=${sessionScope.accound}" >注销账号</a>
				    <!-- 删除当前帐号的操作，把当前账号传入logoutServlet中 -->
				</div>
				<div id="a_con">
				    <a href="editPassword.jsp" >修改密码</a>
				</div> 
				<div id="a_con">
					<a href="editMessage.jsp" >个人信息</a>
				</div>
				<div id="a_con">
					<a href="${pageContext.request.contextPath}/queryall.do" >查看最新</a>
				</div>
				<div id="a_con">
					<a href="outlogin.do">退出登录</a>
				</div>
				<!-- <div id="a_con">
					<a href="add.jsp">增加人员</a>
				</div> -->
	</div>
	<div class="banner">									
			<h2 style="margin-top: 50px;">登陆成功!欢迎用户${sessionScope.name}</h2> <br/>
			在线人数：<%=session.getAttribute("userNumber") %><br/>
  	
  	</div>
  	</div>
</div>
</body>
</html>