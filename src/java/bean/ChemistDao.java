package bean;  
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bean.ChemistBean;
public class ChemistDao 
{  
  
public  static List<ChemistBean>  Retrive(){  
 
 Connection con=null;
 PreparedStatement ps=null;
 ResultSet rs=null;
 con=ConnectionProvider.getCon();
 
 List<ChemistBean>chemist=new ArrayList<ChemistBean>();
 
    try {
        ps=con.prepareStatement("SELECT name, area From doctor");
        rs=ps.executeQuery();
        
        
        while(rs.next())
        {
            ChemistBean chemist1=new ChemistBean();
            chemist1.setName(rs.getString("name"));
            chemist1.setArea(rs.getString("area"));
           
            chemist.add(chemist1);
            
        }
        
    } catch (SQLException ex) {ex.getMessage();}
    
  return chemist;
  
  }  
}  