<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script>
	if ('${message}' != "") {
		alert('${message}');
	}
</script>
</head>
<body>
	<%!String userAccound;
	String userPassword;
	String path;%>
	<%
		//获取cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("accound")) {
					userAccound = cookie.getValue();
				} else if (cookie.getName().equals("password")) {
					userPassword = cookie.getValue();
				}
			}
		}
		path = (String) session.getAttribute("photoPath");
	%>
	<!--banner开始-->
	<div class="banner">
		<div class="header">
			<div class="tit">人事管理系统</div>
		</div>
		<div class="login">

			<h5>用户登录</h5>
			<form action="${pageContext.request.contextPath}/login.do"
				method="post">
				<input class="form-control" type="text" name="accound"
					value="<%=(userAccound == null ? "" : userAccound)%>"
					placeholder="账号" required /><br /> <input class="form-control"
					type="password" name="password"
					value="<%=(userPassword == null ? "" : userPassword)%>"
					placeholder="密码" required /><br />
				<div class="shouquan">

					<span class="fo">角色：</span> <label> <input class="cb ra"
						type="radio" name="radiol" value="0" checked>
					<p1>管理员</p1>
					</label> <label> <input class="cb ra" type="radio" name="radiol"
						value="1">
					<p1>用户</p1>
					</label> <br />

				</div>
				<label><input id="remember" type="checkbox" name="remPass">
					<p1>记住密码</p1> </label> <input class="but" type="submit" value="登 录">
				<a href="register.jsp"> <input class="but" type="button"
					value="注 册"></a>
			</form>
			<div class="al">
				<a href="#">忘记密码？</a>
			</div>

		</div>
	</div>
	<!--footer开始-->
	<div class="footer">
		<div></div>
	</div>
</body>
</html>