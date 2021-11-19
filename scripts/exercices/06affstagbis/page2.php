<?php 
$key1;
require_once("../../data_stagiaires.php");
function maj($nom,$sexe,$prenom){
	$ret="";
	if ($sexe=='M') {
		$sexe='Monsieur';
	}else
	$sexe='Madame';

	$ret="$sexe ".mb_strtoupper($nom)." ".$prenom;

	return $ret;
}
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
</head>
<body>
	<?php
	/*var_dump($stagiaires); echo 'Résultat du count($stagiaires) : ',count($stagiaires),"<br/>";*/

	echo "<ul><li> Personne n°: ".$_GET["key1"]."</li>";
			echo "<ul><li>".maj($stagiaires[$_GET["key1"]]['nom'],$stagiaires[$_GET["key1"]]['sexe'],$stagiaires[$_GET["key1"]]['prenom'])."</li>";
			echo "<li>DDN: ".$stagiaires[$_GET["key1"]]['ddn']."</li>";
			echo "<li> Nombre d'enfants: ".$stagiaires[$_GET["key1"]]['enfants']."</li>";
			echo "<li>Hobbies :</li><ul>";
			sort($stagiaires[$_GET["key1"]]['hobbies']);
			foreach($stagiaires[$_GET["key1"]]['hobbies'] as $key2 =>$value2){
				echo "<li>$key2 : $hobbies[$value2] </li>";			
			}
			echo "</ul>";
			echo "</ul>";
			echo "</ul>";
			echo "</br>";
		/*if($key==$_GET["key1"]){
			echo "<ul><li> Personne n°: $key</li>";
			echo "<ul><li>".maj($value['nom'],$value['sexe'],$value['prenom'])."</li>";
			echo "<li>DDN: ".$value['ddn']."</li>";
			echo "<li> Nombre d'enfants: ".$value['enfants']."</li>";
			echo "<li>Hobbies :</li><ul>";
			sort($value['hobbies']);
			foreach($value['hobbies'] as $key2 =>$value2){
				echo "<li>$key2 : $hobbies[$value2] </li>";			
			}
			echo "</ul>";
			echo "</ul>";
			echo "</ul>";
		}*/	
	?>
	<a href="index.php">Retour</a>
</body>
</html>