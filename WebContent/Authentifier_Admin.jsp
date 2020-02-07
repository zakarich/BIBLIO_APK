
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bibliotheque</title>
<meta charset="utf-8">
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/slider.css">




<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/superfish.js"></script>
<script src="js/sForm.js"></script>
<script src="js/jquery.jqtransform.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/tms-0.4.1.js"></script>
<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script>
$(window).load(function () {
    $('.slider')._TMS({
        show: 0,
        pauseOnHover: false,
        prevBu: '.prev',
        nextBu: '.next',
        playBu: false,
        duration: 800,
        preset: 'random',
        pagination: false, //'.pagination',true,'<ul></ul>'
        pagNums: false,
        slideshow: 8000,
        numStatus: false,
        banners: true,
        waitBannerAnimation: false,
        progressBar: false
    });
    $("#tabs").tabs();
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
    overflow: visible;
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
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
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
opacity:0.9;
}
#zak{
    width: 80% ;
    

}
</style>



</head>
<body class="page1">
<header>
<div class="container_12">
    <div class="grid_12">
      <h1><img src="images1/logo.png" alt=""></h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav>
        <ul class="sf-menu">
          <li class="current"><a href="index1.jsp">Home</a></li>
          <li class="with_ul"><a href="index1.jsp">Chercher</a></li>
          <li><a href="index1.jsp">Filiere</a></li>
          <li><a href="index1.jsp">Ouvrages</a></li>
          <li><a href="enregistrement.jsp">Connecter-vous</a></li>
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
<div id="zak">
<form method="get">
  <div class="container">
  <center><h2><b>interface d'Authentification Admin</b></h2></center>
    <label><b>identifiant</b></label>
    <input type="text" placeholder="Enter login" name="login">

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="mdp">

    <button type="submit" formaction ="AuthentificationAdmin">Valider</button>
    <label>
      <input type="checkbox"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
  </div>
</form>
</center>
</body>
</html>