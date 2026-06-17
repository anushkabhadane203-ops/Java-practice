<%@ page language="java" errorPage="MyErrorPage.jsp"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>

<body bgcolor="grey">

<h2>This is Result Page</h2>

<%
int no1 = Integer.parseInt(request.getParameter("no1"));
int no2 = Integer.parseInt(request.getParameter("no2"));

int no3 = no1 / no2;
%>

<hr>

<h4><i>Div = <%= no3 %></i></h4>

</body>
</html>