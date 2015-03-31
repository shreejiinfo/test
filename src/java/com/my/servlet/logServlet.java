/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.servlet;

import com.my.dao.logDao;
import com.my.ben.logBean;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Administrator
 */
public class logServlet extends HttpServlet {

    private static final long serialVersionUID = 2562294252731783855L;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
 try{   
        String username = request.getParameter("uname");
        String password = request.getParameter("pwad");
      
    
        logBean rbean = new logBean();
        
        rbean.setUname(username);
        rbean.setPwd(password);
        
        boolean flag = logDao.insert(rbean);
      
        
        if(flag)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("currentSessionrbean", rbean);
         
            response.sendRedirect("mail.jsp");}
        else{
         
            response.sendRedirect("index_1.jsp");
        }} 
    catch (Exception theException) {
     System.out.println(theException);
       
            }
    
 }}
 