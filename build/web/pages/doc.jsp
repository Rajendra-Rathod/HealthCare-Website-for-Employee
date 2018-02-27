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
<%@page import="bean.DocDao"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doc</title>
    </head>
    <body>
        <h1>Successfully Inserted...!</h1
        
        <jsp:useBean id="doc" class="bean.DocBean"/>  
        <jsp:setProperty property="*" name="doc"/>  
        
        
        <% 
           //.print("hello");
            DocDao.Insert(doc);
           
        %>
        
    </body>
</html>
