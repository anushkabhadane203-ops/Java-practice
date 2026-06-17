<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Input JSP</title>
</head>
<body>

<h2>Enter Two Numbers</h2>

<form method="post">

    Number 1:
    <input type="text" name="no1">
    <br><br>

    Number 2:
    <input type="text" name="no2">
    <br><br>

    <input type="submit" value="Add">

</form>

<%
String n1 = request.getParameter("no1");
String n2 = request.getParameter("no2");

if(n1 != null && n2 != null)
{
    int a = Integer.parseInt(n1);
    int b = Integer.parseInt(n2);
%>

<hr>

No1 = <%= a %><br>
No2 = <%= b %><br>

Add = <%= (a+b) %><br>

<%
}
%>

</body>
</html>