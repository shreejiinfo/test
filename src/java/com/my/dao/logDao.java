/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.dao;

import com.my.ben.logBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utill.ConnectionUtill;

/**
 *
 * @author Administrator
 */
public class logDao {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    public static boolean insert(logBean rbean) {

        boolean flag = false;
        String username = rbean.getUname();
        String password = rbean.getPwd();
        System.out.println("" + username);
        System.out.println("" + password);
        try {
            conn = ConnectionUtill.getCon();
            st=conn.createStatement();
            String chkquery = "select * from name where username='" + username + "' and password='" + password + "'";
            rs=st.executeQuery(chkquery);
            
            while (rs.next()) {
                flag = true;
            }
        } catch (SQLException se) {
            
            System.out.println("SQL Error...");
           
        }
        return flag;
    }

    }


