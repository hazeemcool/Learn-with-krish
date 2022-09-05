/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thilini
 */
public class Login extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.sendRedirect("index.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
         String password=req.getParameter("password");
         
          
         
      ServletContext sc = getServletContext();
         boolean login = false;
         if(sc.getAttribute("users")!=null){
         
             ArrayList<User> users=(ArrayList<User>) sc.getAttribute("users");
             
             for(User u:users){
             if(u.getEmail().equals(email)){
                 
                 if(u.getPassword().equals(password)){
                     
                      HttpSession session = req.getSession();
            session.setAttribute("login", true);
            
                      login = true;
break;
                 }
             
             
             }
             }
         }
         if(login){
         //resp.sendRedirect("home.jsp?email="+email);
         
         RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
         rd.forward(req, resp);
         }else{
          resp.sendRedirect("index.jsp");//https://www.w3schools.com/
         }
    }
    
    
    
    
}
