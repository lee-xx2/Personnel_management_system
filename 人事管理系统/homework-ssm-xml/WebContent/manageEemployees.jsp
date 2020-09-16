<%@ page language="java" contentType="text/html;  charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="com.gdut.beans.Page" %>
         <%@ page import="com.gdut.beans.job_seeker" %>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>员工管理</title>
<link rel="stylesheet" type="text/css" href="css/login_success.css" />
</head>
<script>
		if('${message}'!=""){
			alert('${message}');
		}
	</script>
<body>
		<div class="bannerF">
			<div class="header">
			
				<div id="a_con">
					<a href="addJb.jsp" target="_blank">添加员工</a>
				</div>
			
			</div>
		<div class="banner">
			<h2>员工管理</h2>
			
<%
	
	String ename = (String)session.getAttribute("e");
%>			
				<div class="cent">
				<form  class="select_form" action="${pageContext.request.contextPath}/querybypage1.do" method="post">
  		员工姓名：<input class="form-c" id="name_text" type="text" name="ename" value=<%=(ename==null?"":ename) %>  >
  			 &nbsp;&nbsp;&nbsp;<input  class="but" type="submit" value="查询"/>
  			 &nbsp;&nbsp;&nbsp;每页显示
  			 <select class="op" name="pagesize">
  			      <option value="3">3</option>
  			      <option value="5">5</option>
  			      <option value="8">8</option>
  			 </select>
  			 条数据
  	    </form>
  	    <div id="select_table" style="overflow-x: auto; overflow-y: auto; height: 300px; width:900px;">
  	    		<tbody>
  	    		<%
			    Page p = (Page)request.getAttribute("p");
  	    		if(p!=null){
			    %>	
			    <table border="1px" cellspacing="0px" width="900px"  align="center">
  	    		<tr style="background-color: #3471B0;">
  	    			<th>序号</th>
  	    			<th>姓名</th>
  	    			<th>年龄</th>
  	    			<th>性别</th>
  	    			<th>专业</th>
  	    			<th>工作经历</th>
  	 			<!-- 	<th>详情</th>  -->
  	    			<th>删除</th>
  	    			<th>修改</th>
  	    		</tr>
			    <c:forEach var ="jb" items="${requestScope.p.jbs}" varStatus="status">
			    <c:if test ="${status.count % 2 ==0 }">
  	    			<tr style = "background:#D7D7D7">
  	    			<td>${jb.id}</td>
  	    			<td>${jb.name}</td>
  	    			<td>${jb.age}</td>
  	    			<td>${jb.sex}</td>
  	    			<td>${jb.major}</td>
  	    			<td>${jb.career}</td>
  	    			<%-- <td><a href="DeleteStudentServlet?sno=<%=student.getSno() %>    ">详情</a></td> --%>
  	    			<td><a style="color:#333333" href="shanchu1.do?id=${jb.id}" >删除</a></td>
  	    			<td><a style="color:#333333" href="xiugai1.jsp?id=${jb.id}" target="_blank">修改</a></td>
  	    			</tr>
  	    		</c:if>
  	    		 <c:if test ="${status.count % 2 !=0 }">
  	    			<tr style = "background:#FAFAF2">
  	    			<td>${jb.id}</td>
  	    			<td>${jb.name}</td>
  	    			<td>${jb.age}</td>
  	    			<td>${jb.sex}</td>
  	    			<td>${jb.major}</td>
  	    			<td>${jb.career}</td>
  	    			<%-- <c:set var="No" value="${ew.no}" scope="session"/> --%>
  	    			<td><a style="color:#333333" href="shanchu1.do?id=${jb.id}">删除</a></td>
  	    			<td><a style="color:#333333" href="xiugai1.jsp?id=${jb.id}" target="_blank">修改</a></td>
  	    			</tr>
  	    		</c:if>
  	    		</c:forEach>
  	    		</tbody>
  	    	</table>
  	    <%
		if(p.getCurrentPage()==0&&p.getTotalPage()!=p.getCurrentPage()+1){
		%>
			<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>
			<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getTotalPage()-1%>">尾页</a>
		<% }
		else if(p.getCurrentPage()==p.getTotalPage()-1&&p.getCurrentPage()!=0){
	    %>
	    <a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=0">首页</a>
		<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>
	    <% 	
		}else if(p.getCurrentPage()!=p.getTotalPage()-1){
		%>
		<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=0">首页</a>
		<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getCurrentPage()-1%> ">上一页</a>
		<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getCurrentPage()+1%> ">下一页</a>
		<a href="${pageContext.request.contextPath}/querybypage1.do?currentPage=<%=p.getTotalPage()-1%>">尾页</a>
        <% }%>
        <%} %>  	   
         </div>


			</div>
		</div> 
		</div>

</body>
</html>