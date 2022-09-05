<%-- 
    Document   : newjspregister
    Created on : Nov 1, 2021, 11:30:20 AM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <div align="center">
        <h1>create new account</h1>
        <form action="register" method="POST">
        <table>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name" /></td>
            </tr>
            
            <tr>
                <th>Password</th>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type="text" name="address" /></td>
            </tr>
            <tr>
                <th>Phone</th>
                <td><input type="text" name="phone" /></td>
            </tr>
            <tr>
                <th><a href="index.jsp">login</a></th>
                <td><input type="submit" value="register" /></td>
            </tr>
            
            
            
        </table>
        </form>
        </div>
    </body>
</html>
