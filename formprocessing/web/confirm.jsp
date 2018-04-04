<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/3/18
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forms Processing</title>
</head>
<body>
    <h2>Congratulations, your information has been processed!</h2><br/>
    <p>Your first name: <%=request.getParameter("first_name")%></p>
    <p>Your last name: <%=request.getParameter("last_name")%></p>
    <p>Your age: <%=request.getParameter("age")%></p>
</body>
</html>
