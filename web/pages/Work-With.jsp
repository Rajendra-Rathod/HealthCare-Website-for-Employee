

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Display month &amp; year menus</title>
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script>
  $( function() {
    $( "#datepicker" ).datepicker({
      
      changeYear: true,
      yearRange:"2017:2035",
      minDate:-3,
      dateFormat:"dd-mm-yy",
      duration:"slow",
      maxDate:0,
      changeMonth: true,
    });
  } );
  </script>

</head>
<body>
	
	<center>
 	<br><br><br><br>
				 	  <div class="w3-card-4 " style="width:40%">
									    <header class="w3-container w3-light-grey">
									      <h3 class="w3-center"> Daily-Work</h3>
									    </header>
				    <div class="w3-container"><br><br>
				   
				    
				    
				   		 <label  class="w3-left"><i class="material-icons">supervisor_account</i> Work With:</label>
				   		 <input class="w3-input" type="text" placeholder="Username" style="width: 70%;">
				    
				  
				      
				       <br><br>
				      	<label  class="w3-left"><i class="glyphicon glyphicon-calendar"></i> Date:</label>
				   		 <input class="w3-input " type="text" id="datepicker" placeholder="dd-mm-yy" style="width: 50%;">
				   		 
				   		 
				      <br><br>

				      <p><button type="submit" class="w3-btn w3-round-xxlarge w3-large w3-teal">Submit </button></p>
				     <br><br>

				    </div>
				   


				  </div>
				  <br><br>
				 	
 	</center>
</body>

</html>