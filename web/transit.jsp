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
            
            String msg="hello";
           
               String from_place = request.getParameter("from_place");
               String to_place = request.getParameter("to_place");
            
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
            
       
       st.executeUpdate("insert into transit(email, msg, date, from_place, to_place )"
               + "values('"+email+"','"+msg+"', '"+date+"', '"+from_place+"', '"+to_place+"' )");
           
          System.out.println("Data inserted Successfully");
            
            
        } catch (SQLException ex) {
            
             System.out.println("Data not inserted" );
            System.out.println("Sql Exception "+ex.getMessage());
        }
     
       
        %>
        
    </body>
</html>
