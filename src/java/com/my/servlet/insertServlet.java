/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.servlet;

import com.my.dao.loginDao;
import com.my.ben.loginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class insertServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
      String firstname=req.getParameter("first");
      String lastname=req.getParameter("last");
      String username=req.getParameter("user");
      String password=req.getParameter("pass");
      Integer mobile_no=req.getIntHeader("mob");
      String city=req.getParameter("city");
      String state=req.getParameter("state");
      String country=req.getParameter("cont");
      String email=req.getParameter("email");
         
       loginBean lbean = new loginBean();
       lbean.setFirst(firstname);
       lbean.setLast(lastname);
       lbean.setUser(username);
       lbean.setPass(password);
       lbean.setMob(mobile_no);
       lbean.setCity(city);
       lbean.setState(state);
       lbean.setCont(country);
       lbean.setEmail(email);
               
       
       boolean flag=loginDao.validate(lbean);

       
       if(flag){
           RequestDispatcher rd=req.getRequestDispatcher("registration.jsp");
           rd.forward(req, resp);
       }
       
    }
    
    
    
}
