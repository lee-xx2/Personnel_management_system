<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
		<meta charset="UTF-8">
		<title>添加工资页面</title>
		<link rel="stylesheet" type="text/css" href="css/register.css" />
	</head>


	<body>
		<div class="banner" >
			<span>&nbsp;</span>
			<div class="cent" style="height: 550px;">
				<h1>添加员工工资</h1>
				<form action="add3.do" method="post">
					<input class="form-control" type="text" name="id" placeholder="序号"  required/><br />
					<input class="form-control" type="text" name="name" placeholder="姓名" required/><br />
					<input class="form-control" type="text" name="department" placeholder="部门名称" required/><br />
					<input class="form-control" type="text" name="biaozhun" placeholder="标准薪资" required/><br />
					<input class="form-control" type="text" name="ticheng" placeholder="销售提成 " required/><br />
					<input class="form-control" type="text" name="yingfa" placeholder="应发"  required/><br />
					<input class="form-control" type="text" name="koushui" placeholder="扣税" required/><br />
					<input class="form-control" type="text" name="shifa" placeholder="实发" required/><br />			
					<input class="form-control but" type="submit" name="确认添加" value="确认添加"/>
				</form>
			</div>

		</div>
	</body>
</html>