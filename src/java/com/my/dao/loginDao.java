/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.dao;

import com.my.ben.loginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utill.ConnectionUtill;




/**
 *
 * @author Administrator
 */
public class loginDao {
    
    static Connection conn = null;
    static PreparedStatement pst = null;
    static Statement smt = null;
    static ResultSet rs = null;
   
    static boolean flag=false;
    
    /* connection declaration*/
    
                String url = "jdbc:mysql://localhost:3306";
		String dbName = "indexx";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
   
  
    
    
public static boolean validate(loginBean lbean) {		

  try{
      conn = ConnectionUtill.getCon();
      String account;
      account = "insert into name(firstname,lastname,username,password,mobile_no,city,state,country,email) values (?,?,?,?,?,?,?,?,?)";
      pst = conn.prepareStatement(account);
     
      pst.setString(1,lbean.getFirst());
      pst.setString(2,lbean.getLast());
      pst.setString(3,lbean.getUser());
      pst.setString(4,lbean.getPass());
      pst.setInt(5,lbean.getMob());
      pst.setString(6,lbean.getCity());
      pst.setString(7,lbean.getState());
      pst.setString(8,lbean.getCont());
      pst.setString(9,lbean.getEmail());
      
      
      
      int i = pst.executeUpdate();
      
      if(i > 0)
      {
          flag = true;
                System.out.println("insert data....");
            } else {
                System.out.println("not insert data....");
            }
      
  }
  catch (SQLException se){
      
        System.out.println("DataInsertion Error......");
      
  }
    return flag;
}

  
}