<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/6/18
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>State Handling</title>
  </head>
  <body>
  <%
    session.setAttribute("color", "pink");

    /**
     * Creating a cookie and including it on the response. The page that is loaded (page.jsp) will use the cookie to set the page color
    Cookie c = new Cookie("color", "turquoise");
    c.setMaxAge(3600);
    response.addCookie(c);
    */
  %>
  <a href="page.jsp">Goto page.jsp</a>
  </body>
</html>
