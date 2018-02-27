
package bean;

import java.sql.*;  
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bean.DocBean;

public class DocDao 
{
    
    public static void Insert(DocBean doc)
    {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        con=ConnectionProvider.getCon();
        String sql="insert into doc_info(name, speciality, area, mobile, doc_email)"+
                "values(?, ?, ?, ?, ?)";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, doc.getName());
            ps.setString(2, doc.getSpeciality());
            ps.setString(3, doc.getArea());
            ps.setString(4, doc.getMobile());
            ps.setString(5, doc.getDoc_email());
            
            ps.execute();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ChemDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
