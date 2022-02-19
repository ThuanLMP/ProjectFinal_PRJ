<%-- 
    Document   : register
    Created on : Feb 17, 2022, 8:23:34 PM
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
        <form action="signup" method="POST">
            Username: <input type="text" name="username" required=""/> <br/>
            Password: <input type="password" name="password" required=""/> <br/>
            Fullname: <input type="text" name="fullname" required=""/> <br/>
            Gmail:    <input type="email" name="gmail" required=""/> <br/>
            Sdt:      <input type="text" name="sdt" required=""/> <br/>
            <input type="submit" value="Sign Up"/>
        </form>
    </body>
</html>
