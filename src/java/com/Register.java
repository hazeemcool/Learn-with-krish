/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thilini
 */
public class Register extends HttpServlet{
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.sendRedirect("register.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
   String email=req.getParameter("email");
   String address=req.getParameter("address");
   String phone=req.getParameter("phone");
   String password=req.getParameter("password");
        ArrayList<User> userlist= new ArrayList();
        ServletContext sc = getServletContext();
   Object ob =sc.getAttribute("users");
   if(ob!=null){
       
       userlist=(ArrayList) ob;
   
   
   }
   boolean b=true;
   for(User u: userlist){
   if(u.getEmail().equals(email)){
   b=false;
   break;
   }
   
   }
   if(b){
    User user=new User();
   user.setName(name);
   user.setEmail(email);
   user.setAddress(address);
   user.setPhone(phone);
   user.setPassword(password);
   
   userlist.add(user);
   sc.setAttribute("users", userlist);
   resp.sendRedirect("index.jsp");
  
   
   }else{
      resp.getWriter().write("User"+"  "+  email+"Already exist");
   }
   }

   
    }
     

