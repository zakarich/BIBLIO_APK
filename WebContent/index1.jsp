<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
#id_div{
	display:block;
	float:left;
	border-style: solid;
	border-color: grey;
	width:100%;
	height:100%;
}
 
img {
	max-width:100%;
	max-height:100%;
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
          <li class="with_ul"><a href="Authentifier.jsp">Chercher</a></li>
          <li><a href="Authentifier.jsp">Filieres</a></li>
          <li><a href="Authentifier.jsp">Ouvrages</a></li>
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
<div class="main">
  <div class="container_12">
    <div class="grid_12">
      <div class="slider-relative">
        <div class="slider-block">
          <div class="slider"> <a href="#" class="prev"></a><a href="#" class="next"></a>
            <ul class="items">
              <li><img src="images1/slide.jpg" alt="">
                <div class="banner">
                  <div>Ideas Worth Spreading</div>
                  <br>
                  <span> that are worth reading</span> </div>
              </li>
              <li><img src="images1/slide1.jpg" alt=""></li>
              <li><img src="images1/slide2.jpg" alt=""></li>
              <li><img src="images1/slide3.jpg" alt=""></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="content">
    <div class="container_12">
      <div class="grid_12">
        <h3>Top Destinations</h3>
      </div>
      <div class="clear"></div>
      <div class="boxes">
        <div class="grid_4">
          <figure>
            <div ><img src="images1/page1_img1.jpg" alt=""></div>
            <figcaption>
              <h4>Informatique</h4>
              L'informatique est un domaine d'activité scientifique, technique et industriel concernant le traitement automatique de l'information par l'exécution de programmes informatiques par des machines : des systèmes embarqués, des ordinateurs, des robots, ...
              <a href="#" class="btn">Details</a>
            </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images1/page1_img2.jpg" alt=""></div>
            <figcaption>
              <h4>Maths</h4>
              Les mathématiques (ou la mathématique) sont un ensemble de connaissances abstraites résultant de raisonnements logiques appliqués à des objets divers tels que les nombres, les formes, les structures et les transformations. <a href="#" class="btn">Details</a>
            </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images1/page1_img3.jpg" alt=""></div>
            <figcaption>
              <h4>Biologie</h4>
              Science qui a pour objet l'étude de la matière vivante et ds êtres vivants : reproduction (embryologie, génétique), habitat, environnement (écologie), comportement (éthologie).Biologie animale (zoologie), végétale (botanique) ; cellulaire (cytologie, histologie). <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="clear"></div><br/>
        <div class="grid_4">
          <figure>
            <div><img src="images1/page1_img4.jpg" alt=""></div>
            <figcaption>
              <h4>Economy</h4>
              Economy is an area of the production, distribution, or trade, and consumption of goods and services by different agents. Understood in its broadest sense, 'The economy is defined as a social domain that emphasizes the practices, discourses, and material expressions associated  <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images1/page1_img5.jpg" alt=""></div>
            <figcaption>
              <h4>Art</h4>
              L'art est une activité humaine, le produit de cette activité ou l'idée que l'on s'en fait s'adressant délibérément aux sens, aux émotions, aux intuitions et à l'intellect. On peut dire que l'art est le propre de l'humain. On considère le terme « art » par opposition à la nature ... <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images1/page1_img6.png" alt=""></div>
            <figcaption>
              <h3>History</h3>
              L'histoire, souvent écrit avec la première lettre majuscule, est à la fois l'étude et l'écriture des faits et des événements passés quelles que soient leur variété et leur complexité <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>