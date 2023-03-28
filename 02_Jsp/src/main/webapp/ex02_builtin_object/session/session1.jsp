<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 자동로그인을 적용시키려면 sessionId값을 DB와 cookie 총 2곳에 적용시킨다. --%>
	
	<%
		String sessionId = session.getId();
	%>
	<h1><%=sessionId%></h1>
	
</body>
</html>