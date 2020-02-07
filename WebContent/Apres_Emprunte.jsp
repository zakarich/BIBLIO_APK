<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@page import="java.util.List"%>
     <%@page import="com.gestion.beans.Admin"%>
    <%  Admin admin=(Admin)request.getSession().getAttribute("Admin");%>
    <% String str=(String)request.getAttribute("Stri"); %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace_Admin</title>
 
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form.css">
<script src="js/jquery.js"></script>
<script src="js/forms.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script>
$(window).load(function () {
    $().UItoTop({
        easingType: 'easeOutQuart'
    });
});
</script>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<link rel="stylesheet" media="screen" href="css/ie.css">
<![endif]-->

<style type="text/css">
body {
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: 100% 100%;
    
}
form {
    border: 3px solid #f1f1f1;
    overflow: scroll;
    box-shadow: 15px 15px;
}
input[type=text], input[type=password] {
    width: 70%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}


.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
.titlecon{

padding: 16px;

}
.tik{
background-color:#f3f3f3;
opacity:0.8;
}
#zak{
width: 70%;
}
</style>


</head>
<body>
<div>
<h2>Utilisateur : <%=admin.getNom()%></h2>
</div>
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1><a href="index1.jsp"><img src="images1/logo.png" alt=""></a></h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav>
        <ul class="sf-menu">
          <li class="current"><a href="index1.jsp">Home</a></li>
          <li class="with_ul"><a href="ListOuvrage">Chercher</a></li>
          <li><a href="ListOuvrage">Filiere</a></li>
          <li><a href="ListOuvrage">Ouvrages</a>
           <ul>
              <li><a href="ListOuvrage">Lister</a></li>
              <li><a href="ListOuvrage">Chercher</a></li>
              <li><a href="AjouterOuvrage.jsp">Ajouter</a></li>
            </ul>
          </li>
          <li><a href="deconnecter">Deconnecter</a></li>
        </ul>
      </nav>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</header>
<center>
<div class="tik" id="zak">

  
 

<h3><%=str%></h3>

  
  
 
</div>

</center>

</body>
</html>