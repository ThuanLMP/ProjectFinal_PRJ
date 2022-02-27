<%-- 
    Document   : expire
    Created on : Feb 21, 2022, 8:22:27 AM
    Author     : ITACHI
--%>

<%@page import="model.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <% ArrayList<Order> orders = (ArrayList<Order>) request.getAttribute("expire");%>
    </head>
    <body>
        <h1>List oders</h1>
        <table border="1px">
            <tr>
                <td>STT</td>
                <td>Full Name</td>
                <td>User Name</td>
                <td>Gmail User</td>
                <td>Phone Number</td>
                <td>Account Netflix</td>
                <td>Slot</td>
                <td>Start Date</td>
                <td>Time</td>
                <td>Type</td>
            </tr>
            
            <% 
                int i=1;
                for (Order o : orders) {
            %>
            <tr>
                <td><%=i%></td>
                <td><%=o.getFullname()%></td>
                <td><%=o.getUsername()%></td>
                <td><%=o.getGmail()%></td>
                <td><%=o.getSdt()%></td>
                <td><%=o.getAccNetf()%></td>
                <td><%=o.getSlot()%></td>
                <td><%=o.getStartDate()%></td>
                <td><%=o.getTime()%></td>
                <td><%=o.getType()%></td>
            </tr>
            
            <% i++;
                    }%>
        </table>    
    </body>
</html>
