<%-- 
    Document   : doctor
    Created on : 23 Dec, 2017, 10:31:46 AM
    Author     : rajendra
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.awt.image.BufferedImage" %>
<%@page  import="java.io.File" %>
<%@page import="java.io.FilenameFilter"%>
<%@page import="java.io.IOException"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="bean.ReadImage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image Retrieval</title>
    </head>
    <body>
        <h1>Your Image Retrieved...!</h1>
        
        <table>
        <% 
            List img=ReadImage.Retrive();
               Iterator<File> it = img.iterator();       
            
             while(it.hasNext())
             {
                 
             File imgnext=it.next();
     
        %>
        
        
                                  <tr >
                                      
                                      <td> <img src="/home/rajendra/Desktop/Planets/15.jpg" alt="hey"></td>
                                       
                                    </tr>
                                    
                                    <% } %> 
        
        
        </table
        
        <action path="/image" ... scope="request" validate="false"/>
       <img src=" /image?"+path=' + imagePath + "' alt='" + imagePath + "' height='42' width='42'>";
        
        
    </body>
</html>
