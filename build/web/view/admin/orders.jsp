<%-- 
    Document   : oders
    Created on : Feb 19, 2022, 2:57:17 PM
    Author     : ITACHI
--%>

<%@page import="model.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
        <% ArrayList<Order> orders = (ArrayList<Order>) request.getAttribute("orders");%>
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
