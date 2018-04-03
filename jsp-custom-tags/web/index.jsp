<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 4/2/18
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ex" uri="/WEB-INF/custom.tld" %>
<%@ taglib prefix="fr" uri="/WEB-INF/format/formatTag.tld" %>
<html>
  <head>
    <title>User Defined Tags</title>
  </head>
  <body>
      <ex:Hello message="Kiff, I have the captain's itch."/><br>
      <fr:formattag color="green" fontSize="50" isUpper="true"> How cool is this?! </fr:formattag>
  </body>
</html>
