<%-- 
    Document   : list_users
    Created on : Mar 5, 2022, 2:48:37 PM
    Author     : ITACHI
--%>

<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List User Page</title>
        <%
            ArrayList<User> users =  (ArrayList<User>)request.getAttribute("users");
        %>
    </head>
    <body>
        <h1>List oders</h1>
        <table border="1px">
            <tr>
                <td>STT</td>
                <td>User Name</td>
                <td>Password</td>
                <td>Full Name</td>
                <td>Gmail User</td>
                <td>Phone Number</td>
                
            </tr>
            
            <% 
                int i=1;
                for (User u : users) {
            %>
            <tr>
                <td><%=i%></td>
                <td><%=u.getUsername()%></td>
                <td><%=u.getUsername()%></td>
                <td><%=u.getFullname()%></td>
                <td><%=u.getGmail()%></td>
                <td><%=u.getSdt()%></td>
                
            </tr>
            
            <% i++;
                    }%>
    </body>
</html>
