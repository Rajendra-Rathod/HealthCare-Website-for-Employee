<%-- 
    Document   : doctor
    Created on : 21 Dec, 2017, 10:31:46 AM
    Author     : rajendra
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
            
            
            
            String samplesprovided= request.getParameter("samplesprovided");
            String giftsprovided=request.getParameter("giftsprovided");
            String status="Visited";
             //String name="Visited";
              String specialization="Visited";
               String area="Visited";
               String name="haha";
            Statement st1=null;
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
            
            
           
            ps=con.prepareStatement("select * from doc_info");
           rs=ps.executeQuery();
            while(rs.next())
            {
                 name=rs.getString("name");
                 area=rs.getString("area");
                 specialization=rs.getString("specialization");
            
            
            }
           
            
            /*
            String specialization=rs.getString("specialization");
            String area=rs.getString("area");*/
            
            
            
            
            Statement st=con.createStatement();
             st.executeQuery("select name from doctor");
       
       st.executeUpdate("insert into doctor(name, specialization, area, samplesprovided, giftsprovided,status)"
               + "values('"+name+"','"+specialization+"', '"+area +"','"+samplesprovided+"', '"+giftsprovided+"','"+status+"' )");
           
          System.out.println("Data inserted Successfully");
            
            
        } catch (SQLException ex) {
            
             System.out.println("Data not inserted" );
            System.out.println("Sql Exception "+ex.getMessage());
        }
     
       
        %>
        
    </body>
</html>
