
package bean;

import java.io.*;
import java.sql.Connection;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;


public class CreateWorkBook 
{
    private  String Date1;
    private String Date2;
    
   public CreateWorkBook(String Date1, String Date2)
    {
        this.Date1=Date1;
        this.Date2=Date2;
        
    }
    
   
   
   public void Retrive()throws ParseException
   {
       
         
      String filename="/home/rajendra/Desktop/raj2.xls";
    HSSFWorkbook hwb=new HSSFWorkbook();
    HSSFSheet sheet =  hwb.createSheet("newsheet");
    HSSFRow rowhead=sheet.createRow(0);
    
    
HSSFRow row1=   sheet.createRow((short)1);
//rowhead.createCell((short) 8).setCellValue("Login Cred");
rowhead.createCell((short) 0).setCellValue("date");
rowhead.createCell((short) 1).setCellValue("email");
rowhead.createCell((short) 2).setCellValue("workwith");
rowhead.createCell((short) 3).setCellValue("area");
rowhead.createCell((short) 4).setCellValue("msg_type");
rowhead.createCell((short) 5).setCellValue("msg");

Connection con=ConnectionProvider.getCon();

Statement st;
        try {
            st = con.createStatement();
       
ResultSet rs=st.executeQuery("Select * from employeeinsertiondata");
int i=1;
while(rs.next()){


String Date11=rs.getString("date");
SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
Date date1=(Date) sdf.parse(Date1);
Date date2=(Date) sdf.parse(Date2);
Date date11 =(Date) sdf.parse(Date11);

System.out.println("Date 1 : "+date1);
        
System.out.println("Date 2 : "+date11);


if(date1.compareTo(date11) <= 0 && date2.compareTo(date11)>=0 )
{
    System.out.println("if loop date is less than Date1 :"+date11);
    HSSFRow row=   sheet.createRow((short)i);
    row.createCell((short) 0).setCellValue(rs.getString("date"));
    row.createCell((short) 1).setCellValue(rs.getString("email"));
    row.createCell((short) 2).setCellValue(rs.getString("workwith"));
    row.createCell((short) 3).setCellValue(rs.getString("area"));
    row.createCell((short) 4).setCellValue(rs.getString("msg_type"));
    row.createCell((short) 5).setCellValue(rs.getString("msg"));
    i++;   
    
}

}

 } catch (SQLException ex) {
            Logger.getLogger(CreateWorkBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    

FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateWorkBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            hwb.write(fileOut);
        } catch (IOException ex) {
            Logger.getLogger(CreateWorkBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileOut.close();
        } catch (IOException ex) {
            Logger.getLogger(CreateWorkBook.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println("Your excel file has been generated!");


    
       
      }
   
   
  
    
}
