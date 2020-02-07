<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<%@page import="com.gestion.beans.*"%> 
 <%  List<Emprunte> cmds=(List<Emprunte>)request.getAttribute("listEmp");
 request.setAttribute("cmds", cmds); %>
<% 	Admin admin=(Admin)request.getSession().getAttribute("Admin");
    request.getSession().setAttribute("Admin",admin);
%>
<% String str=(String)request.getAttribute("msg");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
 
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
<script>
function Reserver(tit,aut){
	   var table = document.getElementById("tab_zaki");
		var row0 = table.insertRow(0);
		var cell1 = row0.insertCell(0);
		var cell2 = row0.insertCell(1);
		var cell3 = row0.insertCell(2);
		
		
		
		var td2 = document.getElementById(tit);
	    var td3 = document.getElementById(aut);
		
		var text2=td2.firstChild.nodeValue;
        var text3=td3.firstChild.nodeValue;
		
		//var case1 = document.getElementById("titre");
		//var case2 = document.getElementById("auteur");
		//var case3 = document.getElementById("tc");
		
		
		
			 bouton = document.createElement("input");
			 bt = document.createElement("input");
			 bt.id="";
			 bt.type="button";
			 bt.value="Valider"
				 bt.onclick= function(){
				 var sm =document.getElementsByName("t")[0];
			      sm.setAttribute("value", text2);
			      
			      
			    }; 
			 
			  bouton.id = "bouton0";
			  bouton.type = "button";
			  bouton.value = "Supprimer";
			  bouton.onclick= function(){
				  var sm =document.getElementsByName("t")[0];
			      sm.setAttribute("value", null);
			    }; 
			    
			    cell1.innerHTML="<p> "+text2+"</p>";
				cell2.innerHTML="<p> "+text3+"</p>";
			    cell3.appendChild(bt);
			    cell3.appendChild(bouton);

};
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
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: BLUE;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border:solid buttonshadow;
    cursor: pointer;
    width: 50%;
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
width: 90%;
}

#tab_zak{
border-collapse: collapse;
width: 100%;
 border: 1px solid #ddd;
 text-align: center;
 border:double solid;
}
#tab_zaki{
border-collapse: collapse;
width: 100%;
 border: 1px solid #ddd;
 text-align: center;
 border:double solid;
}
#butt_zak{

background-color: #4CAF50;
    color: white;
    padding: 10px 16px;
    margin: 8px 5px;
    border: none;
    cursor: pointer;
    border-radius:8px;
    box-shadow: 0 9px #999;

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
      <h1><a href="index.html"><img src="images1/logo.png" alt=""></a></h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav>
        <ul class="sf-menu">
          <li class="current"><a href="index1.jsp">Home</a></li>
          <li class="with_ul"><a href="ListOuvrage">Chercher</a></li>
          <li><a href="ListeOuvrage.jsp">Emprunte</a>
           <ul>
              <li><a href="ListEmprunte">Lister</a></li>
              <li><a href="ListReservation">Reservtaion</a></li>
              <li><a href="ListeOuvrage.jsp">Ajouter</a></li>
            </ul>
          </li>
          <li><a href="ListOuvrage">Ouvrages</a>
          <ul>
              <li><a href="ListOuvrage">Lister</a></li>
              <li><a href="ListOuvrage">Chercher</a></li>
              <li><a href="AjouterOuvrage.jsp">Ajouter</a></li>
            </ul></li>
          <li><a href="deconnecter">Deconnecetr</a>
          
          </li>
        </ul>
      </nav>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</header>
<center>
<div class="tik" id="zak">
<div>
<h3><%=str%></h3>
</div>

 <table id="tab_zak">     
<tr>       
 <th>DateDebut</th>        
 <th>DateFin</th>        
 <th>Duree</th> 
 <th>Etudiant</th> 
 <th>Ouvrage</th>     
 </tr>
     
 <c:forEach var="user" items="${cmds}">       
 <tr>        
  <td id='${user.debut}'>${user.debut}</td>       
  <td id='${user.fin}'>${user.fin}</td>        
  <td>${user.duree}</td>
  <td>${user.etudiant.nom}</td>       
  <td>${user.ouvre.titre}</td>                 
  </tr>     
   </c:forEach>   
 </table>
</div>

</center>

</body>
</html>