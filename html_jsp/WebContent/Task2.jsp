<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP TASK</title>
	</head>
	<body>
		<%--メソッド、変数の定義は<%! %>で行う。substractionメソッドで引き算を実行
		結果を表示するプログラムは<%= %>内に記述 --%>
		<%! int substraction(int num1, int num2){
				return num1 - num2;
		}%>

		<h1>125 - 15 =<%= substraction(125,15) %></h1>

		<h1>17 - 21 =<%= substraction(17,21) %></h1>

	</body>
</html>