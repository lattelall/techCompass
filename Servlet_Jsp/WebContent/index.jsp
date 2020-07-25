<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--indexファイルはWebContent配下に置く --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet_Jsp</title>
</head>
<body>
	<%--課題1、Task1のdoGetメソッド呼び出しするHelloServletのボタンの配置 --%>
	<input type = "button" value = "HelloServlet" onClick = "location.href = 'Task1'">
	<%--課題2、hello.jspにフォワードするTask2へのリンクを作成 --%>
	<p><a href = "Task2">Hello JSP</a></p>
	<%--課題4、Task4のdoGetメソッド呼び出しするHelloServletのボタンの配置 --%>
	<input type = "button" value = "占う" onClick = "location.href = 'Task4'">
</body>
</html>