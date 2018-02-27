package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Work_002dWith_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>jQuery UI Datepicker - Display month &amp; year menus</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<script>\n");
      out.write("  $( function() {\n");
      out.write("    $( \"#datepicker\" ).datepicker({\n");
      out.write("      \n");
      out.write("      changeYear: true,\n");
      out.write("      yearRange:\"2017:2035\",\n");
      out.write("      minDate:-3,\n");
      out.write("      dateFormat:\"dd-mm-yy\",\n");
      out.write("      duration:\"slow\",\n");
      out.write("      maxDate:0,\n");
      out.write("      changeMonth: true,\n");
      out.write("    });\n");
      out.write("  } );\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<center>\n");
      out.write(" \t<br><br><br><br>\n");
      out.write("\t\t\t\t \t  <div class=\"w3-card-4 \" style=\"width:40%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    <header class=\"w3-container w3-light-grey\">\n");
      out.write("\t\t\t\t\t\t\t\t\t      <h3 class=\"w3-center\"> Daily-Work</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t    </header>\n");
      out.write("\t\t\t\t    <div class=\"w3-container\"><br><br>\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t   \t\t <label  class=\"w3-left\"><i class=\"material-icons\">supervisor_account</i> Work With:</label>\n");
      out.write("\t\t\t\t   \t\t <input class=\"w3-input\" type=\"text\" placeholder=\"Username\" style=\"width: 70%;\">\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t      \n");
      out.write("\t\t\t\t       <br><br>\n");
      out.write("\t\t\t\t      \t<label  class=\"w3-left\"><i class=\"glyphicon glyphicon-calendar\"></i> Date:</label>\n");
      out.write("\t\t\t\t   \t\t <input class=\"w3-input \" type=\"text\" id=\"datepicker\" placeholder=\"dd-mm-yy\" style=\"width: 50%;\">\n");
      out.write("\t\t\t\t   \t\t \n");
      out.write("\t\t\t\t   \t\t \n");
      out.write("\t\t\t\t      <br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t      <p><button type=\"submit\" class=\"w3-btn w3-round-xxlarge w3-large w3-teal\">Submit </button></p>\n");
      out.write("\t\t\t\t     <br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t   \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <br><br>\n");
      out.write("\t\t\t\t \t\n");
      out.write(" \t</center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
