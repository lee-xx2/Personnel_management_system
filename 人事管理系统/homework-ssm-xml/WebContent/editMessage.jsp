<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个人信息</title>
<link rel="stylesheet" type="text/css" href="css/editPassword.css" />
</head>
	<%!
	String ext;
	String nowPath;
	%>
	<%
	ext = (String)session.getAttribute("ext");
	if(ext!=null){
		nowPath = "images/"+session.getAttribute("accound")+ext;
	}
	%>
	<body style="background-color: rgba(0,0,0,0.5);">
		<div class="banner">
			  <span>&nbsp;</span>
			<div class="cent">
			<%if(ext!=null){ %>
			<div><img src=<%=nowPath %>></div>
			<%} %>
			<form action="${pageContext.request.contextPath }/fileupload.do" enctype="multipart/form-data" method="post" style="color:white;padding-top: 20px;">
			头像：<input class="form-control" type="file" name="photo" /><br />
			姓名：<input class="form-control" type="text" name="name" value="${sessionScope.name}"/><br/>
			<input  class="form-control but" type="submit" value="修改"/>
			</form>
		</div>
		</div>
	</body>
</html>