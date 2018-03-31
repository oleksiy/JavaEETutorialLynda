<%--
  Created by IntelliJ IDEA.
  User: oblavat
  Date: 3/31/18
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration and Expression Tags Are Used on this Page</title>
</head>
<body>
    <%!
        class User {
            public int id;
            public String firstName;
            public String lastName;

            public User(int id, String fName, String lName){
                this.id = id;
                this.firstName = fName;
                this.lastName = lName;
            }
        }
        User[] users = {
                new User(1, "Peter", "Frampton"),
                new User(2, "George", "W"),
                new User(3, "Nigel", "Thornberry"),
        };
        %>
    <table border="1">
        <tr><td>ID</td><td>First Name</td><td>Last Name</td></tr>
        <%
            for(int i = 0; i < users.length; i++){
        %>
        <tr><td><%=users[i].id%></td><td><%=users[i].firstName%></td><td><%=users[i].lastName%></td></tr>
        <%
            }
        %>
    </table>
</body>
</html>
