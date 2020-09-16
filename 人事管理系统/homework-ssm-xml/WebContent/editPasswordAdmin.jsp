<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
<link rel="stylesheet" type="text/css" href="css/editPassword.css" />
</head>
<script >
if('${message}'!=""){
	alert('${message}');
}
	
</script>
<body>
		<div class="banner">
		<span>&nbsp;</span>
		<div class="cent">
			<h1>修改密码</h1>
			<p>6-16个字符，可由英文、数字、下划线组成</p>
			<form action="editpassword1.do" method="post">
				<input class="form-control" type="text" name="oldPassword" placeholder="原密码" value=${sessionScope.password} /><br /> 
				<input class="form-control" type="password" name="newPassword" placeholder="新密码" /><br /> 
				<input class="form-control" type="password" name="verifyPassword" placeholder="确认密码" /><br />
				 <input class="form-control but" type="submit" value="确认提交" />
			</form>

		</div>

	</div>
</body>
</html>