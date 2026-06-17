<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='gray'>
	<%
		String username = "admin";
	    String pwd = "admin@123";

	if (username.equals("admin") && pwd.equals("admin@123"))
	%>

	//redirect user to next welcome.jsp
	<jsp:forward page="welcome.jsp">
		<jsp:param value="MIT Pune" name="clgName" />
	</jsp:forward>


</body>
</html>