<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
<link rel="stylesheet" type="text/css" href="css/register.css" />
<script>
	if('${message}'!=""){
		alert('${message}');
	}
	
	var xmlHttp;
	function createXMLHttpRequest(){
		if(window.ActiveXObject){
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
		}
	}
	
	function validate()
	{
		createXMLHttpRequest();
		var accound =document.getElementById("accound");
		var url = "register.do?accound="+escape(accound.value);
		xmlHttp.open("GET",url,true);
		xmlHttp.onreadystatechange = handleStateChange;
		xmlHttp.send(null);
	}	
	function  handleStateChange(){
		if(xmlHttp.readyState == 4){
			if(xmlHttp.status == 200){
				var message = xmlHttp.responseXML.getElementsByTagName("message")[0].firstChild.data;
				var messageArea = document.getElementById("result");
				messageArea.innerHTML = "<p>" + message +"</p>";			
			}
		}
	}
</script>
</head>
<body>
	<div class="banner">
			<span>&nbsp;</span>
			<div class="cent">
				<h1>注册</h1>
				<form action="${pageContext.request.contextPath}/insert.do" method="post"> 
					<input class="form-control" id="name" type="text" name="name"   placeholder="姓名" required/><br />
					<input class="form-control" id="accound" type="text" name="accound" onblur="validate()" placeholder="账号" required/><br />
					<div id="result" style="font-size:15px;color:white;margin-top: 10px;margin-bottom:0px ;">请输入账号</div>
					<input class="form-control" id="firstPassword" type="password" name="firstPassword" placeholder="密码" required/><br />
					<input class="form-control" id="secondPassword" type="password" name="secondPassword" placeholder="确认密码" required/><br />
					<input class="form-control but" type="submit" value="确认" />
				 </form> 
			</div>
	</div>
</body>
</html>