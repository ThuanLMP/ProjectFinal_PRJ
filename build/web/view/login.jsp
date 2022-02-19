<%-- 
    Document   : login
    Created on : Feb 17, 2022, 12:03:48 PM
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
        <form action="login" method="POST">
            Username: <input type="text" name="username"/> <br/>
            Password: <input type="password" name="password"/> <br/>
            <input type="submit" value="Sign in"/>
        </form>
        <a href="signup"> <input type="submit" value="Sign Up"/> </a>
    </body>
</html>
