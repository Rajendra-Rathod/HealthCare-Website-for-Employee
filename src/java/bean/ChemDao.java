
package bean;
import java.sql.*;  
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bean.ChemistBean;


public class ChemDao
{
    public static void Insert(ChemBean chem)
    {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        con=ConnectionProvider.getCon();
        String sql="insert into chem_info(name, contact_person, area, mobile, chem_email)"+
                "values(?, ?, ?, ?, ?)";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, chem.getName());
            ps.setString(2, chem.getContact_person());
            ps.setString(3, chem.getArea());
            ps.setString(4, chem.getMobile());
            ps.setString(5, chem.getChem_email());
            
            ps.execute();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ChemDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
