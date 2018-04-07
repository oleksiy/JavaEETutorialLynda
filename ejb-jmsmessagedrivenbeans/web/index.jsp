<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/6/18
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JMS Message Driven Beans</title>
  </head>
  <body>
    <form action="MessageServlet" method="POST">
      <label for="message">Enter Message:</label><br/>
      <input id="message" type="text" name="message"/><br>
      <input type="submit"/>
    </form>
  </body>
</html>
