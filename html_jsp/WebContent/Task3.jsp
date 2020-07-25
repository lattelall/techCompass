<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date, java.text.SimpleDateFormat" %><%--インポートは<%@ %>内で定義する --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP KADAI</title>
	</head>
	<body>
		<%-- 変数countを作成。インクリメント処理（++）を行う
		ページをリロードするたびコードが実行される --%>
		<%!int count;%>
		<% count++;	%>
		<h1>訪問回数: <%= count %></h1>


		<%!SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");
		Date now = new Date();
		%>
		<p>今日の日付:	<% out.println(today.format(now)); %></p>

	</body>
</html>