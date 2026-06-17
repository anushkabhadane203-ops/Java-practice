<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.time.LocalDateTime" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate JSP</title>
</head>

<body>

<h2>Welcome To Validate JSP</h2>

Requested At: <%= LocalDateTime.now() %>

<br><br>

<%
String username = request.getParameter("username");
String pwd = request.getParameter("pwd");
%>

Username : <%= username %>
<br>
Password : <%= pwd %>

</body>
</html>