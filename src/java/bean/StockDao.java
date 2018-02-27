
package bean;

/**
 *
 * @author rajendra
 */

import java.sql.*;  
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bean.StockBean;

public class StockDao 
{
   
    public static void Insert(StockBean stock)
    {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        con=ConnectionProvider.getCon();
        String sql="insert into stock_info(name, email, mobile, area)"+
                "values(?, ?, ?, ?)";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, stock.getName());
            ps.setString(2, stock.getEmail());
            ps.setString(3, stock.getMobile());
            ps.setString(4, stock.getArea());
            
            ps.execute();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ChemDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
     
    
    
}
