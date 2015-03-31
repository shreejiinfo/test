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
public class logoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        String username = request.getParameter("uname");
        String password = request.getParameter("pwad");
      
    
        logBean rbean = new logBean();
        
        rbean.removeUname();
        rbean.removePwd();
        
        HttpSession session = request.getSession(false);
        session.removeAttribute("currentSessionrbean");
        session.invalidate();
        response.sendRedirect("index.jsp");
        }
         catch(IOException theException) {
             
             System.out.println("theException");
         }
    }
}