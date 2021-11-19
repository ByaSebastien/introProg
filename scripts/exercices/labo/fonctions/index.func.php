<?php

function connection(){
	$dbh = new PDO(
		"mysql:dbname=mediatheque;host=localhost;port=3308",
		"root",
		"",
		array(
			PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES \'UTF8\'',
			PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
		)
	);
	return $dbh;
}

function compteListe($dbh){
	$sql="SELECT COUNT(DISTINCT(films_titre)) AS nb FROM films";
	$stmt = $dbh -> prepare($sql);
    $stmt->execute();
    $tab = $stmt->fetchAll();
    return $tab[0]['nb'];
}

function liste($dbh,$page){
	$sql="SELECT films_titre,films_resume,films_annee,films_affiche,films_duree,GROUP_CONCAT(DISTINCT(acteurs_nom) SEPARATOR ', ') AS acteur,GROUP_CONCAT(DISTINCT(genres_nom) SEPARATOR ' | ') AS genre,real_nom FROM films LEFT JOIN films_acteurs ON films_id=fa_films_id LEFT JOIN acteurs on fa_acteurs_id=acteurs_id LEFT JOIN films_genres ON films_id=fg_films_id LEFT JOIN genres ON fg_genres_id=genres_id LEFT JOIN realisateurs ON real_id=films_real_id GROUP BY films_titre,films_resume,films_annee,films_affiche,films_duree,real_nom ORDER BY films_titre LIMIT :min,10 ";
    $stmt = $dbh -> prepare($sql);
    $min=10*($page-1);
    $stmt -> bindParam('min',$min, PDO::PARAM_INT);
    $stmt->execute();
	$tab = $stmt->fetchAll();
	return $tab;
}

function compte($dbh,$search){
	$sql="SELECT COUNT(DISTINCT(films_titre)) AS nb FROM films LEFT JOIN films_acteurs ON films_id=fa_films_id LEFT JOIN acteurs on fa_acteurs_id=acteurs_id LEFT JOIN films_genres ON films_id=fg_films_id LEFT JOIN genres ON fg_genres_id=genres_id LEFT JOIN realisateurs ON real_id=films_real_id WHERE films_titre LIKE :search OR films_resume LIKE :search OR films_annee LIKE :search OR films_duree LIKE :search OR acteurs_nom LIKE :search OR genres_nom LIKE :search OR real_nom LIKE :search";
	$stmt = $dbh -> prepare($sql);
	$stmt -> bindParam('search',$search, PDO::PARAM_STR);
	$stmt->execute();
	$tab = $stmt->fetchAll();
    return $tab[0]['nb'];
}

function recherche($dbh,$search,$page){
	$sql="SELECT films_titre,films_resume,films_annee,films_affiche,films_duree,GROUP_CONCAT(DISTINCT(acteurs_nom) SEPARATOR ', ') AS acteur,GROUP_CONCAT(DISTINCT(genres_nom) SEPARATOR ' | ') AS genre,real_nom FROM films LEFT JOIN films_acteurs ON films_id=fa_films_id LEFT JOIN acteurs on fa_acteurs_id=acteurs_id LEFT JOIN films_genres ON films_id=fg_films_id LEFT JOIN genres ON fg_genres_id=genres_id LEFT JOIN realisateurs ON real_id=films_real_id WHERE films_titre LIKE :search OR films_resume LIKE :search OR films_annee LIKE :search OR films_duree LIKE :search OR acteurs_nom LIKE :search OR genres_nom LIKE :search OR real_nom LIKE :search GROUP BY films_titre,films_resume,films_annee,films_affiche,films_duree,real_nom ORDER BY films_titre LIMIT :min,10";
	$stmt = $dbh -> prepare($sql);
	$stmt -> bindParam('search',$search, PDO::PARAM_STR);
    $min=10*($page-1);
    $stmt -> bindParam('min',$min, PDO::PARAM_INT);
    $stmt->execute();
	$tab = $stmt->fetchAll();
	return $tab;
}


?>