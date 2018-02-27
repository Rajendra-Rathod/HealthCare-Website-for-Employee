package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public final class doctor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
 
            String name="Trident";
            String specialization="Internet Explorer 4.0";
            String area="Trident";
            String samplesprovided= request.getParameter("samplesprovided");
            String giftsprovided=request.getParameter("giftsprovided");
            String status="Visited";
            
            
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
       
       st.executeUpdate("insert into doctor(name, specialization, area, samplesprovided, giftsprovided,status)"
               + "values('"+name+"','"+specialization+"', '"+area +"','"+samplesprovided+"', '"+giftsprovided+"','"+status+"' )");
           
          System.out.println("Data inserted Successfully");
            
            
        } catch (SQLException ex) {
            
             System.out.println("Data not inserted" );
            System.out.println("Sql Exception "+ex.getMessage());
        }
     
       
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
