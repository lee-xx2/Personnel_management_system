<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
		<meta charset="UTF-8">
		<title>修改页面</title>
		<link rel="stylesheet" type="text/css" href="css/register.css" />
	</head>

	<body>
		<div class="banner">
			<span>&nbsp;</span>
			<div class="cent">
				<h1>修改页面</h1>
				<form action="xiugai.do" method="post">
					<input class="form-control" type="text" name="id" placeholder="编号" value="<%=request.getParameter("no") %>" required/><br />
					<input class="form-control" type="text" name="department" placeholder="所属部门"   required/><br />
					<input class="form-control" type="text" name="worktype" placeholder="工作类型"   required/><br />
					<input class="form-control" type="text" name="work" placeholder="工作内容"   required/><br />
					<input class="form-control but" type="submit" name="确认修改" value="确认修改"/>
				</form>
			</div>
		</div>
	</body>
</html>