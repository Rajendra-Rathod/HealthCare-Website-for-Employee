package bean;


 import java.sql.*;
import java.sql.Connection;
 import java.util.*;
 import java.sql.DriverManager;



public class ConnectionProvider 
{
    
      
      private static Connection con=null;  
      
      
      static{
        try{  
Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded Succefully");  
con= DriverManager.getConnection("jdbc:mysql://localhost/Doctor","root","rajendra123");
            System.out.println("Successfully Connected");
}catch(Exception e){}  
        
        
  
}  
     
      
   public static Connection getCon(){  
    return con;  
}  

}

