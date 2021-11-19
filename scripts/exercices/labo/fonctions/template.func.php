<?php
function navigation($page,$nbPage,$search){
	$ret="";
	$ret=$ret."<div class='navigation'>";
	if ($page>1) {
		$ret=$ret."<a class='prev lien' href='index.php?pageP=$page&search=$search'><img class='fleche' src='images/flecheg.png'></a>";
	}
	$ret=$ret."<h2 class ='pages'>Page $page sur $nbPage</h2>";
	if ($page<$nbPage) {
		$ret=$ret."<a class='next lien' href='index.php?pageS=$page&search=$search'><img class='fleche' src='images/fleched.png'></a>";
	}
	$ret=$ret."</div>";
	return $ret;
}
function navigationb($page,$nbPage,$search){
	$ret="";
	$ret=$ret."<div class='navigation nav'>";
	if ($page>1) {
		$ret=$ret."<a class='prev lien' href='index.php?pageP=$page&search=$search'><img class='fleche' src='images/flecheg.png'></a>";
	}
	$ret=$ret."<h2 class ='pages'>Page $page sur $nbPage</h2>";
	if ($page<$nbPage) {
		$ret=$ret."<a class='next lien' href='index.php?pageS=$page&search=$search'><img class='fleche' src='images/fleched.png'></a>";
	}
	$ret=$ret."</div>";
	return $ret;
}
function affichage($tab){
		$ret="";
	foreach ($tab as $key) {
		if ($key['films_duree']>=60) {
			$heure=$key['films_duree']/60;
			$minute=$key['films_duree']%60;
			$duree=(int)$heure."h".$minute;
		}
		$ret=$ret."<div class='film'>
		<img class='image' src='images/films/".$key['films_affiche']."'>
		<h3 class='titre'>".$key['films_titre']."</h3>
		<p class='annee'>".$key['films_annee']."</p>
		<div class='info'><p class='genres'>".$key['genre']."</p>
		<p class='real'><span class='infos'>Réalisateur : </span>".$key['real_nom']."</p>
        <p class='acteurs'><span class='infos'>Acteur : </span>".$key['acteur']."</p>
        <p class='duree'><span class='infos'>Durée : </span>".$duree."</p></div>
        <p class='resume'>".$key['films_resume']."</p></div>";
	}
	return $ret;
}
?>