<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="custObj" class="com.code.Customer">
</jsp:useBean>
<jsp:useBean id="custObj1" class="com.code.Customer">
	<jsp:setProperty name="custObj1" property="*" />
</jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome To MIT</h2>
	<%
	
	%>
	<%=custObj%>
	<hr>
	<%=custObj1%>
	<hr>
	<%=custObj1.getDetails() %>
	
</body>
</html>