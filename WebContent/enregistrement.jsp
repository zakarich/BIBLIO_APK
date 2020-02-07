<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>S'inscrire</title>
 
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
    width: 100%;
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
          <li class="with_ul">Ouvrage</li>
          <li>Filiere</li>
          <li>Emprunt</li>
          <li>Reservation</li>
          <li><a href="Authentifier.jsp">Connectez-vous</a>
          <ul>
              <li><a href="Authentifier_Admin.jsp">Admin</a></li>
              <li><a href="Authentifier.jsp">Etudiant</a></li>
            </ul>
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
<form action="AddEtudiant" method="post">
  <div class>
  <center><h2><b>S'enregistrer</b></h2></center>
    <label><b>prenom:</b></label>
    <input type="text" placeholder="Enter le prenom" name="prenom" required>

    <label><b>Nom:</b></label>
    <input type="text" placeholder="Enter Le Nom" name="nom" required>
    <label><b>CNE:</b></label>
    <input type="number" placeholder="Enter le CNE" name="CNE" required>
    
    <label > <span>Filiere</span>
            <select name="select" required>
              <option value="SMI">SMI</option>
              <option value="SMA">SMA</option>
              <option value="SMP">SMP</option>
              <option value="BG">BG</option>
              <option value="ECO">ECO</option>
              <option value="Droit">Droit</option>
              </select>    
    </label>
    
    
    <label > <span>Semestre</span>
            <select name="select2" required>
              <option value="S1">S1</option>
              <option value="S1">S2</option>
              <option value="S3">S3</option>
              <option value="S4">S4</option>
              <option value="S5">S5</option>
              <option value="S6">S6</option>
              </select>    
    </label></br>
     <label><b>Login:</b></label>
    <input type="text" placeholder="Enter Login" name="login" required>
    
    
    <label><b>Password:</b></label>
    <input type="password" placeholder="Enter mot de passe" name="mdp" required>
   
    <button type="submit">S'enregistrer</button>
    <button type=reset" >Effacer</button>
  </div>
  </div>
</form>
  
  
  
  
  
 
</div>
</center>

</body>
</html>
</html>