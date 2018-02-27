<!DOCTYPE html>
<html lang="en">

<head>
<%   
  
//String name=(String)session.getAttribute("email");
//String date=(String)session.getAttribute("date");

String name="rajendrarathod100@gmail.com";
String date="25/06/1996";

%>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"> 
                <%
                out.print("Welcome "+name);
                %></a>
            </div>
            <!-- /.navbar-header -->

            
           <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        
                        
                          <li>
                            <a href="http://localhost:8080/ProIndia/jsp/index.jsp"><i class="fa fa-motorcycle fa-fw"></i> Field Work</a>
                        </li>
                        
                        <li>
                            <a href="http://localhost:8080/ProIndia/jsp/meeting.jsp"><i class="fa fa-user fa-fw"></i> Meeting</a>
                        </li>
                        <li>
                            <a href="transit.html"><i class="fa fa-arrow-up fa-fw"></i> Transit</a>
                        </li>
                        <li>
                            <a href="conference.html"><i class="fa fa-users fa-fw"></i> Conference</a>
                        </li>
                        <li>
                            <a href="leave.html"><i class="fa fa-cog fa-fw"></i>Leave</a>
                        </li>
                        <li>
                            <a href="holiday.html"><i class="fa fa-star fa-fw"></i>Holiday</a>
                        </li>
                 
                       
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Meeting</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Basic Form Elements
                        </div>
                        <div class="panel-body">
                  
                            
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                
                                    <h1></h1>
                                    <form id ="myForm"  action="newjsp.jsp" >
                                        <div class="form-group has-success">
                                            <label class="control-label" for="inputSuccess">Type Here</label>
                                            
                                            <input type="text" class="form-control" id="inputSuccess" name="msg" onclick="this.value=''">
                                             
                                       
                                        </div>
                                        <div class="button">
                                            <input type="submit" value="Submit"/>
                                             
                                            <input type="button" onclick="myFunction()" value="Reset">
                                        </div>
  
</div>
  

  
                                       
                                    </form>
                                 
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script>
function myFunction() {
    document.getElementById("myForm").reset();
}
</script> 
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>