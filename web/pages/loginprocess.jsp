<%-- 
    Document   : loginprocess
    Created on : 27 Dec, 2017, 2:40:21 PM
    Author     : rajendra
--%>
<%@page import="bean.LoginDao"%>  
<jsp:useBean id="obj" class="bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
    
boolean status=LoginDao.validate(obj);
if(status){  
out.println("You r successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, username or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  