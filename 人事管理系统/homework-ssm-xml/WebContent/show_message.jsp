<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://www.mydomain.com/sample" prefix="d" %>
    <%@ page import="com.gdut.beans.Existing_worksheet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>部门详细信息展示页</title>
</head>
<link rel="stylesheet" type="text/css" href="css/show_message.css" />
<body >
	<div class="bbyy">
	自定义标签显示的内容：<br/>
	<d:show no='<%=request.getParameter("no") %>'  
			depart_name='<%=((Existing_worksheet)request.getAttribute("ew")).getDepart_name() %>'
			work_type='<%=((Existing_worksheet)request.getAttribute("ew")).getWork_type() %>'
			now_number='<%=((Existing_worksheet)request.getAttribute("ew")).getNow_number() %>'
			work='<%=((Existing_worksheet)request.getAttribute("ew")).getWork() %>'
			remain_number='<%=((Existing_worksheet)request.getAttribute("ew")).getRemain_number() %>'
			
			/>
	<br/>
    <br/>
    <br/>
      单击下面链接下载介绍文件<br/>
   <a href="upAndDown/SSS.txt" download="download">文档资料</a><br/>
   <a href="filedownload.do">jieshao.mp4</a>
	</div>
</body>
</html>