<%-- 
    Document   : compose
    Created on : Feb 25, 2015, 6:11:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/compose.css" type="text/css"/>
        
    </head>
    <body>
        <form method="post">
        <div id="header">
            <input type="submit" value="Send" action="EmailSendingServlet">
            
            <input type="button" value="Save Draft">
                       <input type="button" value="Discard">
               </div>
            <ul class="combody">
            
                <li><label class="ab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <strong>To:</strong></label>
                    <textarea name="to" rows="3" cols="70" required>
                    </textarea></li></br>
                    <li><label class="bb">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <strong> Cc:</strong></label>
                    <input type="email"  placeholder="Add Cc"  name="cc"/></li></br>
                    <li><label><strong style="font-size: 13.5px; margin-left: 4px;">&nbsp;&nbsp;&nbsp;&nbsp;Subject:</strong></label>
                    <input type="text" placeholder="Add your Subject" name="sub"> </li></br>
                    <li style="background-color: #0063A6; color:  #fff; "> <strong>Attachments:</strong></li></br>
                    <li><input type="file" name="fupload"> </li></br>
                    <li><input type="button" value="Add More Files" name="uploadmore"></li></br>
                <li> <textarea name="txtbody" rows="13" cols="70" >
                    </textarea> </li>
                    
            </div></ul> 
         
            <div id="footer">
                <input type="submit" action="EmailSendingServlet" value="Send">
             <input type="button" value="Save Draft">
              <input type="button" value="Discard">
            
        </div>    
    </form>
        </body>
</html>
