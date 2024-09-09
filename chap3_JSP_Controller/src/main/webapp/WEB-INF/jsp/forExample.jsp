<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	for (int i = 1; i <= 5; i++) {
	%>
	<strong><%=i%></strong>
	<%
	}
	%>
	<a href="/">홈으로 돌아가기</a>
	<a href="/list">리스트로 돌아가기</a>
</body>
</html>