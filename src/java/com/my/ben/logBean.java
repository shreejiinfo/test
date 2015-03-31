/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.ben;

/**
 *
 * @author Administrator
 */
public class logBean {
    
    private String uname;
    private String pwd;
    private boolean valid;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void removeUname() {
    uname=null;      
    }

    public void removePwd() {
        pwd=null;
    }

    public void removeUname(String username) {
    username = null;   
    }

    public void removePwd(String password) {
    password = null;   
    }

    public boolean isValid() {
      return valid;
    }
    
    
    
    
}
