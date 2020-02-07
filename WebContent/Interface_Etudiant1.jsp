
      <%@page import="java.util.*"%>
     <%@page import="com.gestion.beans.Etudiant"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <% Etudiant clt=(Etudiant)request.getSession().getAttribute("Etudiant"); %>
    <% String str=(String)request.getSession().getAttribute("str"); %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace_Etudiant</title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    margin:10px;
}

li a:hover {
    background-color: #111;
}
.wlc{
margin-top:200px;
}
input[type=text]:disabled {
    background: #fff;
    color:black;
    border:none;
    font:  bold 20px arial, sans-serif;
}
</style>
</head>
<body>
<div>
<h2>Utilisateur : <%=clt.getNom()%></h2>
</div>
<ul>
  <li><a href="#">Home</a></li>
  <li><a href="Listcommande">Mes Commandes</a></li>
  <li><a href="article">Articles</a></li>
  <li><a href="#about">Mon panier</a></li>
  <li><a href="deconnecter">D�connecter</a></li>
</ul>
<div class="wlc">
<center><h1><%=str%></h1></center>


</body>
</html>