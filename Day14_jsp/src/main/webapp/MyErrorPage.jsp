<%@ page isErrorPage="true"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>

<body bgcolor="pink">

<h2>Something Went Wrong!</h2>

Error Message:
<%= exception.getMessage() %>

<br><br>

<a href="index.jsp">Go Back</a>

</body>
</html>