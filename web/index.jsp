<%@ page import="java.util.ArrayList" %>
<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: Alexey.Dartau
  Date: 16.01.2020
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HomePage</title>
  </head>
  <body>
  <%
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
    for (User user: users
         ) {
      if (user!=null){
        out.println(user.getLogin());
      }
    }
  %>

  <form style="margin: 30px" action="/home" method="post">
    <button>getCookie</button>
  </form>
<br>
  <%
    User user = (User) request.getSession().getAttribute("USER_DATA");
    out.print(user);
  %>

  <form style="margin: 30px" action="/session" method="post">
    fullName: <input type="text" name="fullName">
    login: <input type="text" name="login">
    password: <input type="text" name="password">
    languageId: <input type="number" name="languageId">
  <button>Create Session</button>
</form>
  <%
  Cookie [] cookies = request.getCookies();
    for (Cookie cookie :
            cookies) {
      if(cookie.getName().equals("langID")){
        out.println(cookie.getValue() + " " + cookie.getName());
      }
    }
  %>
  <br>

  <a href="/logout">logout</a>
  <a href="/profile">profile</a>
  </body>
</html>
