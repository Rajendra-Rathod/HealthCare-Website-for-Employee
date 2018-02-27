<%-- 
    Document   : Select
    Created on : 22 Jan, 2018, 12:58:56 PM
    Author     : rajendra
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="bean.ChemistBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ChemistDao"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
             <select name="carlist" form="carform">
           <% 
                List chemist=ChemistDao.Retrive();
               Iterator<ChemistBean> it = chemist.iterator();       
            
             while(it.hasNext())
             {
               ChemistBean chemistbean=it.next();
            %>
            <option> <%= chemistbean.getName()  %> </option>
           
          <%}%>
          </select> 
            
        </form>
    </body>
</html>
