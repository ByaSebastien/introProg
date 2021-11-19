<?php
function connection(){
	$dbh = new PDO(
		"mysql:dbname=intro_2019;host=localhost;port=3308",
		"root",
		"",
		array(
			PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES \'UTF8\'',
			PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
		)
	);
	return $dbh;
}
function delete($dbh,$index){
	$sql="delete from user where use_id=:id";
    $stmt = $dbh -> prepare($sql);
    $stmt -> bindParam('id', $index);
    $stmt->execute();
}
function ajouter($dbh,$nom,$prenom,$date,$sexe,$pwd){
    $sql="insert into user (use_id,use_nom,use_prenom,use_ddn,use_sexe,use_pwd) values (default,:nom,:prenom,:ddn,:sexe,md5(:mdp))";
    $stmt = $dbh -> prepare($sql);
    $stmt -> bindParam('nom', $nom);
    $stmt -> bindParam('prenom', $prenom);
    $stmt -> bindParam('ddn', $date);
    $stmt -> bindParam('sexe', $sexe);
    $stmt -> bindParam('mdp', $pwd);
    $stmt->execute();
}
function modifier($dbh,$nom,$prenom,$date,$sexe,$pwd,$index){
	$sql="update user SET use_nom=:nom,use_prenom=:prenom,use_ddn=:ddn,use_sexe=:sexe,use_pwd=:mdp where use_id=:id";
    $stmt = $dbh -> prepare($sql);
    $stmt -> bindParam('nom', $nom);
    $stmt -> bindParam('prenom', $prenom);
    $stmt -> bindParam('ddn', $date);
    $stmt -> bindParam('sexe', $sexe);
    $stmt -> bindParam('mdp', $pwd);
    $stmt -> bindParam('id', $index);
    $stmt->execute();
}
?>