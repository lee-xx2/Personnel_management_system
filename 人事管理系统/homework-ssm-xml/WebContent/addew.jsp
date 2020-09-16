<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
		<meta charset="UTF-8">
		<title>添加部门</title>
		<link rel="stylesheet" type="text/css" href="css/register.css" />
	</head>


	<body>
		<div class="banner">
			<span>&nbsp;</span>
			<div class="cent" style="height: 500px;">
				<h1>添加部门</h1>
				<form action="add2.do" method="post">
					<input class="form-control" type="text" name="id" placeholder="编号"  required/><br />
					<input class="form-control" type="text" name="department" placeholder="所属部门" required/><br />
					<input class="form-control" type="text" name="worktype" placeholder="工作类型" required/><br />
					<input class="form-control" type="text" name="now_number" placeholder="当前人数" required/><br />
					<input class="form-control" type="text" name="work" placeholder="工作内容" required/><br />
					<input class="form-control" type="text" name="remain_number" placeholder="还需人数" required/><br />
					<input class="form-control but" type="submit" name="确认添加" value="添加"/>
				</form>
			</div>
		</div>
	</body>
</html>