<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/3/18
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Forms Processing</title>
  </head>
  <body>
    <form action="UserServlet" method="POST">
        <label>Enter your name:</label>
        <input type="text" name="first_name" value="" /><br>
        <label>Enter your last name:</label>
        <input type="text" name="last_name" value="" /><br>
        <label>Enter your age:</label>
        <input type="text" name="age" value="" size="2" maxlength="3"/><br>
        <input type="submit" value="Send" name="submit"/>
    </form>
  </body>
</html>
