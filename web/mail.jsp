<%-- 
    Document   : mail
    Created on : Mar 17, 2015, 4:01:29 AM
    Author     : Administrator
codemiles.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.my.ben.logBean"%>
<% 
response.setHeader("cache-Control", "no-store,must-revalidate");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", -1);
new java.util.Date();
if(session.getAttribute("currentSessionrbean")!=null){
%>    

<!DOCTYPE html>
<html>
    <head>
        <title>Mail Area</title>
        <script type="text/javascript">
            function noBack(){
                window.history.forward();
            }
        </script>
        
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="css/st1.css" type="text/css"/>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <link rel="stylesheet" href="css/style_1.css" type="text/css"/>
      

    </head>
    <body onload="noBack();">
        <div id="header">
            <table width="100%" border="0" bgcolor="#0063A6" cellpadding="0" cellspacing="0">
            <tr><td>
            <div class="link-logout">
                <% logBean currentflag = (logBean)
                 (session.getAttribute("currentSessionrbean"));%>
                 Welcome, <%= currentflag.getUname()
                   %>
            </div></td></tr>
            <div class="acsetting"><a href="registration.jsp">
                        <a href="#"><b>Account Setting | </b></a>
                                   
  
            </div>
                <img src="image/logo.jpg" width="500" height="55" border="0"></a>
                <a href="logoutServlet"><div class="logout" ><b>Logout </b></div></a>
             </table> 
        </div>
                       
         <div class="section group">
         <div class="col span_1_of_4">
            <input type="search">
            <input type="submit" value="Search Mail">
        </div>
	</div>
        <div  style="width:1351PX; border: none;  background-color: #999; float: top;"> <!-- Main Div -->
            <form>
                <a href="compose.jsp" target="mailframe"><input type="button" class="composebtn" value="Compose Mail"></a>
            </form>
            
         <div id="leftpanal">
             <a href="inbox.jsp" target="mailframe" >Inbox</a><br><br>
         <a href="">Sent Mail</a><br><br>
         <a href="">Draft</a><br><br>
         <a href="">All mail</a><br><br>
    
         <strong id="createlable">Create Lable</strong>
    
         <!-- Set Div As your requirement -->
         </div>
         <div style="float:right; position: static;  border:none; width:1210px; margin-top:5px; margin-left:10px;">
    
         <iframe class="mail" name="mailframe"  >
         </div>
         </div>
                
</form>  
</body>
</html>
        <%}
        else
        response.sendRedirect("index.jsp");%>