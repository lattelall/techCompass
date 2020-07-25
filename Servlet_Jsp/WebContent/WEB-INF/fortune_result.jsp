<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="practice.FortuneBean" %><%-- 作成したJavaBeans（FortuneBean）をインポート--%>
<%-- Task4でリクエストスコープに格納したfortuneResultを受け取り--%>
<%  FortuneBean fortuneBean = (FortuneBean)request.getAttribute("fortuneResult");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><%-- nullチェックし日付と占い結果をgetterメソッドで取得--%>   
    <% 
    	if(fortuneBean != null){
    		out.println("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
    		out.println("<h1>" + fortuneBean.getFortune() + "</h1>");
    	}
    %>
</body>
</html>