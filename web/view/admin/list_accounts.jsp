<%-- 
    Document   : list_accounts
    Created on : Mar 10, 2022, 5:25:04 PM
    Author     : ITACHI
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Account_netf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List User Page</title>
        <%
            ArrayList<Account_netf> accs = (ArrayList<Account_netf>) request.getAttribute("accs");
        %>
    </head>
    <body>
        <h1>List account</h1>
        <table border="1px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>GMAIL</th>
                    <th>PASSWORD</th>
                    <th>PURCHASE PRICE</th>
                    <th>SALE PRICE</th>
                    <th>SLOT</th>
                    <th>TYPE</th>
                    <th>ACTIVE</th>
                </tr>

                <%
                    for (Account_netf a : accs) {
                %>
                <tr>
                    <td> <%=a.getId()%> </td>
                    <td> <%=a.getGmail()%> </td>
                    <td> <%=a.getPassword()%> </td>
                    <td> <%=a.getPurPrice()%> </td>
                    <td> <%=a.getSalePrice()%> </td>
                    <td> <%=a.getSlot()%> </td>
                    <td> <%=a.getType()%> </td>
                    <td> <%=a.getActive()%> </td>
                </tr>
                <%}%>


        </table>

    </body>
</html>

