<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/3/18
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
      <title>JSTL</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <c:out value="This is a c:out tag output."></c:out><br>
    <c:if test = "${'cookies' == 'cookies'}">
        <c:out value="This will only show up if true"></c:out>
    </c:if><br>
    <c:set var="a" value="3"></c:set>
    <c:set var="b" value="3"></c:set>
    <c:forEach var="item" items="Etherium, Bitcoin, ICX, Wanchain">
        <div style="border: 1px solid black; padding: 3px; margin:5px;">${item}</div>
    </c:forEach>
  </body>
</html>
