<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/6/18
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>State Handling</title>
</head>
<%
    out.println("<body ");
    Cookie[] cookies = request.getCookies();
    for(Cookie c : cookies){
        if(c.getName().equals("color")){
            //out.print("bgcolor="+c.getValue());
            out.print("bgcolor="+session.getAttribute("color"));
        }
    }
    out.println("></body");
%>
</html>
