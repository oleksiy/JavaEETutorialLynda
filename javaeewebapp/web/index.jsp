<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 3/30/18
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Java EE</title>
  </head>
  <body>
  <form action="hellocalculator" method="post">
      <input type="text" name="a"/>
      <input type="text" name="b"/>
      <input type="submit" value="add"/>
  </form>

  <%--<%
    Random rd = new Random();
    System.out.println(rd.nextInt(500));
    out.println("Random number: " + rd.nextInt(11));
  %>--%>
  </body>
</html>
