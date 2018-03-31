<%@ page import="java.time.LocalDate" %>
<%--
  Created by IntelliJ IDEA.
  User: oleksiy
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
      <%!
        //this is a declaration tag
          public String test(){
              String msg = "This is a test, do not panic!";
              return msg;
          }
      %>
      <input type="text" name="a"/>
      <input type="text" name="b"/>
      <input type="submit" value="add"/>
      <br>
      <!--Scriptlet tags-->
      <%
        out.print(LocalDate.now());
      %>
      <br>
      <%
        out.print(test());
      %>
      <br>
      <%=test()%>
      <br>
      <a href="expression_and_declaration_example.jsp">More examples - expression and declaration tags</a>
  </form>

  <%--<%
    Random rd = new Random();
    System.out.println(rd.nextInt(500));
    out.println("Random number: " + rd.nextInt(11));
  %>--%>
  </body>
</html>
