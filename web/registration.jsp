<%-- 
    Document   : index
    Created on : Jan 9, 2015, 12:40:21 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SecureMail.com - Registration Area</title>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <script src="js/registration-validation.js"></script>

    </head>

    <body>

       
<div id="header">
            
        <table width="100%" border="0" bgcolor="#0063A6" cellpadding="0" cellspacing="0">
            
            <tr>
                <td><a href="index.jsp"><div class="link-login"><b>Login Here!</b></div><img src="image/logo.jpg" width="500" height="55" border="0"></a></td>
            </tr>
        </table> </div>        
        <div class="left">
            <img src="image/baner1.jpg" >
        </div>  
        
        <form name="regi" action="insertServlet" >
            <ul class="right-form">
                <h2>Create your Account</h2>
                <li>
                    <input type="text" class="inpbox"  placeholder="Firstname" required name="first" onblur="allLetter()"/>
                </li>
                    <li>
                    <input type="text"   placeholder="Lastname" required name="last" onblur="allLetter1()"/>
                </li> 
                <li>
                    <input type="text"   placeholder="Username" required name="user"  maxlength="30" autocomplete="off"
                           spellcheck="flase" />
                    <samp class="atsecuremail" >@securemail.com</samp> 					
                </li>  
                <li>
                    <input type="password"   placeholder="Password" required name="pass"/>
                </li> 
                <li>
                    <input type="password"   placeholder="Confirm password"  required name="repass" onblur="myFunction()"/>
                </li> 
                <li>
                    <input type="text"   placeholder="Mobile_no" required name="mob" onblur="phonenumber()"/>
                </li> 
                <li>
                    <input type="text"   placeholder="Email" required name="email"/>
                </li> 
                <li>
                    <input type="text"   placeholder="City" required name="city"/>
                </li> 
                <li>
                    <input type="text"   placeholder="State" required name="state"/>
                </li> 
                <li>
                    <input type="text"  placeholder="Country" required name="cont" />
                </li> 
                <input type="submit" value="Create Account" name="insertServlet" />
            </ul>
        </form>
      
    </body>
</html>
