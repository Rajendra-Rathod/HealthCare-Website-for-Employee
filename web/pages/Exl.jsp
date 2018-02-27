<%-- 
    Document   : Exl
    Created on : 5 Jan, 2018, 3:20:29 PM
    Author     : rajendra
--%>



<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%@page import="org.apache.poi.hssf.usermodel.HSSFRow"%>
<%@page import="org.apache.poi.hssf.usermodel.HSSFSheet"%>
<%@page import="org.apache.poi.hssf.usermodel.HSSFWorkbook"%>

<%@page import="bean.CreateWorkBook"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        
        <%
            String date1=request.getParameter("date1");
            String date2=request.getParameter("date2");
            
              //Date sm = new SimpleDateFormat("dd-mm-yyyy").parse(date1);
              
              CreateWorkBook cwb=new CreateWorkBook(date1, date2);
           cwb.Retrive();
              /*
            //Date startdate=sm.parse(date1);
            //Date enddate=sm.parse(date2);
              //date2=sm.format(date2);
            //CreateWorkBook cwb=new CreateWorkBook(date1, date2);
            //cwb.Retrive();
            
           
            if(date1.compareTo(date2)>0 )
            {
                out.print("date1 is after date2 : Date 1: "+startdate);
            }
            
            else if(date1.compareTo(date2)<0)
            {
                out.print("date2 is after date1 Date 2 : "+enddate);
            }
            
            else if(date1.compareTo(date2)==0)
            {
                out.print("date1 and date2 is equal  Date 1:"+startdate);
            }
            
            else
            {
                out.println("Something is wrong");
            }
            //out.print(request.getParameter("date1")) ;
        
        
        */
        %>
        
        
    </body>
</html>
