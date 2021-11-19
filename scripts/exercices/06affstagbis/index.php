<?php 
require_once("../../data_stagiaires.php");
function maj($nom,$sexe,$prenom,$key){
	$ret="";
	if ($sexe=='M') {
		$sexe='Monsieur';
	}else
	$sexe='Madame';

	$ret="$sexe <a href='page2.php?key1=$key'>".mb_strtoupper($nom)."</a> $prenom";

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
	foreach ($stagiaires as $key => $value) {
		echo "<ul><li> Personne n°: $key</li>";
		echo "<ul><li>".maj($value['nom'],$value['sexe'],$value['prenom'],$key)."</li>";
		echo "</ul>";
		echo "</ul>";
	}
	?>
</body>
</html>