package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import bean.ChemistBean;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import bean.ConnectionProvider;
import java.sql.Connection;
import bean.ChemistDao;

public final class tableschem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SB Admin 2 - Bootstrap Admin Theme</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"../vendor/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables CSS -->\n");
      out.write("    <link href=\"../vendor/datatables-plugins/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables Responsive CSS -->\n");
      out.write("    <link href=\"../vendor/datatables-responsive/dataTables.responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"../dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"../vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">SB Admin v2.0</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong>John Smith</strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong>John Smith</strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong>John Smith</strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>Read All Messages</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-messages -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-tasks fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 1</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">40% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 2</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">20% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                            <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 3</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 4</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">80% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                            <span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>See All Tasks</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-tasks -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-bell fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i> New Comment\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\n");
      out.write("                                    <span class=\"pull-right text-muted small\">12 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-tasks fa-fw\"></i> New Task\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>See All Alerts</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-alerts -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-user -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("            </ul>\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("<div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <li>\n");
      out.write("                            <a href=\"index.html\"><i class=\"fa fa-motorcycle fa-fw\"></i> Field Work</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"meeting.html\"><i class=\"fa fa-user fa-fw\"></i> Meeting</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"transit.html\"><i class=\"fa fa-arrow-up fa-fw\"></i> Transit</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"conference.html\"><i class=\"fa fa-users fa-fw\"></i> Conference</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"leave.html\"><i class=\"fa fa-cog fa-fw\"></i>Leave</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"holiday.html\"><i class=\"fa fa-star fa-fw\"></i>Holiday</a>\n");
      out.write("                        </li>\n");
      out.write("                 \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-static-side -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Chemists</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            DataTables Advanced Tables\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-heading -->\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                         <th>Name</th>\n");
      out.write("                                         <th>Area</th>\n");
      out.write("                                         \n");
      out.write("                                         <th>Gifts Provided</th>\n");
      out.write("                                         <th>Status</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    \n");
      out.write("           ");
 
                List chemist=ChemistDao.Retrive();
               Iterator<ChemistBean> it = chemist.iterator();       
            
             while(it.hasNext())
             {
               ChemistBean chemistbean=it.next();
            
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <tr class=\"odd gradeX\">\n");
      out.write("                                       <td>");
      out.print( chemistbean.getName()  );
      out.write("</td>\n");
      out.write("                                       <td>");
      out.print( chemistbean.getArea() );
      out.write("</td>\n");
      out.write("                                        <td ><input type=\"text\" id=\"myText\"></td>\n");
      out.write("                                        <td  class=\"center\"><button onclick=\"myFunction()\" >Visited</button><button>Not-Visited</button></td>\n");
      out.write("                                       \n");
      out.write("                                    </tr>\n");
      out.write("                                  ");
 } 
      out.write("  \n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            <!-- /.table-responsive -->\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <h4>DataTables Usage Information</h4>\n");
      out.write("                                <p>If the Chemist you are searching for is not in our records you can add the new entry.</p>\n");
      out.write("                                 <a class=\"btn btn-default btn-lg btn-block\"  href=\"chemist.html\">ADD</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("             </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../vendor/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- DataTables JavaScript -->\n");
      out.write("    <script src=\"../vendor/datatables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"../vendor/datatables-plugins/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../vendor/datatables-responsive/dataTables.responsive.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../dist/js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("    <script>\n");
      out.write("function myFunction() {\n");
      out.write("    document.getElementById(\"myText\").readOnly = true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#dataTables-example').DataTable({\n");
      out.write("            responsive: true\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
