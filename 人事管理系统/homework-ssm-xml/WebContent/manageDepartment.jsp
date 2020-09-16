<%@ page language="java" contentType="text/html;  charset=utf-8"
    pageEncoding="utf-8"%>
         <%@ page import="com.gdut.beans.Page" %>
         <%@ page import="com.gdut.beans.Existing_worksheet" %>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>部门管理</title>
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
					<a href="addew.jsp" target="_blank">添加部门</a>
				</div>
			
			</div>
		<div class="banner">
			<h2 style="margin-top: 50px;">部门管理</h2>
			
			
			<div class="cent" style="margin-top: 50px;">
				<form  class="select_form" action="${pageContext.request.contextPath}/querybypage.do" method="post">
  					工作描述：<input class="form-c" id="name_text" type="text" name="work" value=<%=(work==null?"":work) %>  >
  			 		&nbsp;&nbsp;&nbsp;
  			 		<input  class="but" type="submit" value="查询"/>
  			 		&nbsp;&nbsp;&nbsp;
  			 		每页显示
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
  	    			<th>部门名称</th>
  	    			<th>岗位名称</th>
  	    			<th>现有人员</th>
  	    			<th>具体工作</th>
  	    			<th>余缺情况</th>
  	    			<th>详情</th>
  	    			<th>删除</th>
  	    			<th>修改</th>
  	    		</tr>
			    <c:forEach var ="ew" items="${requestScope.p.ews}" varStatus="status">
			    <c:if test ="${status.count % 2 ==0 }">
  	    			<tr style = "background:#D7D7D7">
  	    			<td>${ew.no}</td>
  	    			<td>${ew.depart_name}</td>
  	    			<td>${ew.work_type}</td>
  	    			<td>${ew.now_number}</td>
  	    			<td>${ew.work}</td>
  	    			<td>${ew.remain_number}</td>
  	    			<%-- <td><a href="DeleteStudentServlet?sno=<%=student.getSno() %>    ">详情</a></td> --%>
  	    			<td><a style="color:#333333" href="show.do?no=${ew.no}">详情</a></td>
  	    			<td><a style="color:#333333" href="shanchu.do?no=${ew.no}">删除</a></td>
  	    			<td><a style="color:#333333" href="xiugai_.jsp?no=${ew.no}">修改</a></td>
  	    			</tr>
  	    		</c:if>
  	    		 <c:if test ="${status.count % 2 !=0 }">
  	    			<tr style = "background:#FAFAF2">
  	    			<td>${ew.no}</td>
  	    			<td>${ew.depart_name}</td>
  	    			<td>${ew.work_type}</td>
  	    			<td>${ew.now_number}</td>
  	    			<td>${ew.work}</td>
  	    			<td>${ew.remain_number}</td>
  	    			<%-- <c:set var="No" value="${ew.no}" scope="session"/> --%>
  	    			<td><a style="color:#333333" href="show.do?no=${ew.no}">详情</a></td>
  	    			<td><a style="color:#333333" href="shanchu.do?no=${ew.no}">删除</a></td>
  	    			<td><a style="color:#333333" 
  	    				href="xiugai_.jsp?no=${ew.no}">
  	    				修改
  	    				</a>
  	    			</td>
  	    			</tr>
  	    		</c:if>
  	    		</c:forEach>
  	    		</tbody>
  	    	</table>
  	    <%
		if(p.getCurrentPage()==0&&p.getTotalPage()!=p.getCurrentPage()+1){
		%>
			<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>
			<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getTotalPage()-1%>">尾页</a>
		<% }
		else if(p.getCurrentPage()==p.getTotalPage()-1&&p.getCurrentPage()!=0){
	    %>
	    <a href="${pageContext.request.contextPath}/querybypage.do?currentPage=0">首页</a>
		<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>
	    <% 	
		}else if(p.getCurrentPage()!=p.getTotalPage()-1){
		%>
		<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=0">首页</a>
		<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getCurrentPage()-1%> ">上一页</a>
		<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getCurrentPage()+1%> ">下一页</a>
		<a href="${pageContext.request.contextPath}/querybypage.do?currentPage=<%=p.getTotalPage()-1%>">尾页</a>
        <% }%>
        <%} %>  	   
         </div>


			</div>
		</div> 
		</div>

</body>
</html>