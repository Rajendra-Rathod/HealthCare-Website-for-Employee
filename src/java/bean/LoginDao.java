package bean;  
import java.sql.*;  
public class LoginDao {  
  
public static boolean validate(LoginBean bean){  
boolean status=false;  
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement("select * from emp_info where username=? and password=?"); 

System.out.println("Database name :"+bean.getUsername()+bean.getPassword());
  
ps.setString(1,bean.getUsername());  
ps.setString(2, bean.getPassword());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
              
}catch(Exception e){}  
  
return status;  
  
}  
}  