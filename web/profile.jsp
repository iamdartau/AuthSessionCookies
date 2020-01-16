<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: Alexey.Dartau
  Date: 16.01.2020
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/logout">logout</a>

<%
    User user = (User) request.getSession().getAttribute("USER_DATA");
    request.setAttribute("user", user);
    out.print(user);
%>
</body>
</html>
