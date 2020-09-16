<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
		<meta charset="UTF-8">
		<title>修改员工页面</title>
		<link rel="stylesheet" type="text/css" href="css/register.css" />
	</head>


	<body>
		<div class="banner" >
			<span>&nbsp;</span>
			<div class="cent" style="height: 500px;">
				<h1>修改页面</h1>
				<form action="xiugai1.do" method="post">
					<input class="form-control" type="text" name="id" placeholder="序号" value="<%=request.getParameter("id") %>" required/><br />
					<input class="form-control" type="text" name="name" placeholder="姓名" required/><br />
					<input class="form-control" type="text" name="age" placeholder="年龄" required/><br />
					<input class="form-control" type="text" name="sex" placeholder="性别" required/><br />
					<input class="form-control" type="text" name="major" placeholder="专业" required/><br />
					<input class="form-control" type="text" name="career" placeholder="经历" required/><br />			
					<input class="form-control but" type="submit" name="确认修改" value="确认修改"/>
				</form>
			</div>
		</div>
	</body>
</html>