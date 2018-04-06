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
    <form action="UserServlet" method="POST" enctype="multipart/form-data">
        <label>Enter your name:</label>
        <input type="text" name="first_name" value="" /></br>

        <label>Enter your last name:</label>
        <input type="text" name="last_name" value="" /></br>

        <label>Enter your age:</label>
        <input type="text" name="age" value="" size="2" maxlength="3"/></br>

        <label>Select your gender:</label></br>
        <input type="radio" name="gender" value="male"/>Male</br>
        <input type="radio" name="gender" value="female"/>Female</br>

        <label>Date of Birth:</label>
        <input type="date" name="date" value="date"/></br>

        <label>Select Plan:</label>
        <select name="plan">
            <option value="basic">Basic</option>
            <option value="standard">Standard</option>
            <option value="pro">Pro</option>
        </select><br>

        <label>Upload photo:</label>
        <input type="file" name="photo"/></br>

        <label>Do you agree to share your data?</label>
        <input type="checkbox" name="agree"/></br>
        <input type="submit" value="Send" name="submit"/>
    </form>
  </body>
</html>
