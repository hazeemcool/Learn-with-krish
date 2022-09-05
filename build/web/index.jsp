<%-- 
    Document   : wcd2
    Created on : Nov 1, 2021, 11:23:41 AM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

if(session.getAttribute("login")!=(null) ){
    if(session.getAttribute("login").equals(Boolean.TRUE)){
response.sendRedirect("home.jsp");

    }}



%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div align="center">
        <h1>Login Here</h1>
        <form action="login" method="POST">
        <table>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email" /></td>
            </tr>
              <tr>
                <th>Password</th>
                <td><input type="password" name="password" /></td>
            </tr>
              <tr>
                  <th><a href="register.jsp">create new account</a></th>
                <td><input type="submit" value="login" /></td>
            </tr>
            
        </table>
            </form>
        </div>
    </body>
</html>
