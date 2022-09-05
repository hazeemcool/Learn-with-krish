<%-- 
    Document   : home
    Created on : Nov 1, 2021, 1:17:02 PM
    Author     : Thilini
--%>


<%@page import="com.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

if(session.getAttribute("login")==(null) ){
response.sendRedirect("index.jsp");
}



%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>welcome to home</h1>
        <br>
           <form method="post" action="logout">
            <input type="submit"  value="Logout" />
        </form>
        
    </body>
</html>
