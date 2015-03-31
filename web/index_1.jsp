<%-- 
    Document   : login
    Created on : Jan 12, 2015, 1:51:51 AM
    Author     : Administrator
--%>

<%@page  language="java" contentType="text/html" pageEncoding="UTF-8"%>
<% 
response.setHeader("cache-Control", "no-store,must-revalidate");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", -1);
new java.util.Date();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <title>SecureMail.com - Login Area</title>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <script type="text/javascript">
            function verify(){
                var uname = document.getElementById("u");
                var pwad = document.getElementById("p");
                var msg = "";
                
                if(uname.value == ""){
                    msg+="enter username";
                   uname.className = "inpboxError"; 
                }
                if(pwad.value == ""){
                           msg+="enter password";
                  pwad.className = "inpboxError";   
                }
                
                if(msg == ""){
                    return true;
                }
                else{
                    alert(msg);
                    return false;
                }
            }
            
        </script>
        <style type="text/css">
            .inpbox{
                background-color: #fff;
            }
            .inpboxError{
                border: 2px red;
            }
        </style>
    </head>
    <body onload="clearForms();" onunload="clearForms();">
     
<div id="header">
            
        <table width="100%" border="0" bgcolor="#0063A6" cellpadding="0" cellspacing="0">
            
            <tr>
                <td><a href="registration.jsp"><div class="link-login"><b>Create Account</b></div><img src="image/logo.jpg" width="500" height="55" border="0"></a></td>
            </tr>
        </table> </div>         <div class="left">
                 
             <img src="image/baner.jpg" >
                 
             </div>    
        <form name="l1" action="logServlet" method="post" onsubmit="return verify();">
                     
            
             
             <ul class="right-form" >
                 
					<h3>Login:</h3>
					<div>
                                            <li><input type="text" class="inpbox"  placeholder="Username" id="u" name="uname"/></li></br>
                                            <li><input type="password" class="inpbox"  placeholder="Password" id="p" name="pwad"/></li>
				            <a href="forgot.jsp" style="text-decoration: none; color: cornflowerblue;">Forgot Username and Password?</a>
                                           
                                                <input type="submit" value="Login" name="logServlet" />
					</div>
                                        <label style="color: red; margin-top: -35px;">Please Enter Your Valid Username and Password !!</label>
					
				</ul>

             
         </form>
          
    </body>
</html>
