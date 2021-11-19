<?php require_once("../../data_stagiaires.php");?>
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
	foreach($stagiaires as $cle => $valeur){
		echo "<li>element $cle : </li>";
		if (is_array($valeur) ){
			//echo "<br/>";
			echo "<ul>";
			foreach($valeur as $cle2 => $valeur2){
				echo "<li>$cle2 : ";
				if (is_array($valeur2) ){
					//echo "<br/>";
					echo"<ul>";
					foreach($valeur2 as $cle3 => $valeur3){
						echo "<li>$cle3 : $hobbies[$valeur3] </li>";					
					}
					echo "</ul>";
				}else
				echo $valeur2."</li>"; 
			}
			echo"</ul>";	
		}else
		echo $valeur."</li>"; 	
	}
	echo "</ul>";
	?>
</body>
</html>