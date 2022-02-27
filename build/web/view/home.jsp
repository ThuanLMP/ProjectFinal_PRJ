<%-- 
    Document   : home
    Created on : Feb 19, 2022, 12:42:14 PM
    Author     : ITACHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="login" method="get">
            <input  type="submit" value="Login"/>
        </form>
        
        <form action="signup" method="get">
            <input type="submit" value="Sign up"/>
        </form>
        <form action="logout" method="get">
            <input type="submit" value="Logout"/>
        </form>
    </body>
</html>
