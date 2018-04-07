<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/6/18
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Enterprise Java Beans - Session Beans</title>
  </head>
  <body>
  <form action="ConverterServlet" method="POST">
    <input type="number" name="temperature" value="value"/><br>
    <select name="type">
      <option value="C2F">Celsius to Fahrenheit</option>
      <option value="F2C">Fahrenheit to Celsius</option>
    </select>
    <input type="submit" value="Convert"/>
  </form>
  </body>
</html>
