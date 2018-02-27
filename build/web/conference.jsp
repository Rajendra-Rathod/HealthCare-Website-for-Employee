<%-- 
    Document   : conference
    Created on : 23 Dec, 2017, 1:54:32 PM
    Author     : rajendra
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Holiday</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
            
            SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
            java.util.Date date=new java.util.Date();
               String date1= formatter.format(date);
            
            
            String email="rajendrarathod100@gmail.com";
            
           
               String msg = request.getParameter("msg");
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            Connection con=null;
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded Succefully");
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception "+ex.getMessage());
           }
        
     try {
           con= DriverManager.getConnection("jdbc:mysql://localhost/Doctor","root","rajendra123");
            System.out.println("Successfully Connected");
           
      
            
            
            
            
            Statement st=con.createStatement();
            
       
       st.executeUpdate("insert into conference(email, msg, date )"
               + "values('"+email+"','"+msg+"', '"+date+"' )");
           
          System.out.println("Data inserted Successfully");
            
            
        } catch (SQLException ex) {
            
             System.out.println("Data not inserted" );
            System.out.println("Sql Exception "+ex.getMessage());
        }
     
       
        %>
        
    </body>
</html>
