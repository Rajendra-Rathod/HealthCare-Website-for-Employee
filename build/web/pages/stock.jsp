<%-- 
    Document   : doc
    Created on : 24 Dec, 2017, 4:09:36 PM
    Author     : rajendra
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="bean.StockDao"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doc</title>
    </head>
    <body>
        <h1>Successfully inserted...!</h1>
        
         <jsp:useBean id="stock" class="bean.StockBean"/>  
        <jsp:setProperty property="*" name="stock"/>  
        
        <% 
            
           StockDao.Insert(stock);
        %>
        
    </body>
</html>
