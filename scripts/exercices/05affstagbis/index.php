<?php 
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
	echo "<ul>";
	echo $stagiaires[0]["nom"];
	foreach ($stagiaires as $key => $value) {
		echo "<ul><li> ID: $key</li>";
		echo "<ul><li>".maj($value['nom'],$value['sexe'],$value['prenom'])."</li>";
		echo "<li>DDN: ".$value['ddn']."</li>";
		echo "<li> Nombre d'enfants: ".$value['enfants']."</li>";
		echo "<li>Hobbies :</li>";
		if (is_array($value) ){
			foreach($value as $key2 =>$value2){
				if (is_array($value2) ){
					echo "<ul>";
					foreach ($value2 as $key3 =>$value3){
						echo "<li>$key3 : $hobbies[$value3] </li>";
					}
					echo "</ul>";
				}
			}
			echo "</ul>";
		}
		echo "</ul></br>";
	}
	echo "</ul>";
	?>
</body>
</html>