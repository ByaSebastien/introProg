<?php
function rigolo($chaine){
	$ret="";
	for($i=0;$i<strlen($chaine);$i++){
		if($i%2==0)
			$ret.=strtoupper(substr($chaine, $i,1));
		else
			$ret.=strtolower(substr($chaine, $i,1));
	}
	return $ret;
}

?>


<!doctype html>
<html lang="fr">
	<head>
		<title>Titre de l'exercice</title>
		<meta charset="utf-8">
	</head>
	<body>
			<?php
 			if(isset($_GET["nom"])){
				echo "nom : ".rigolo($_GET["nom"]);
			}
			?> <br/> <?php
			if(isset($_GET["prenom"])){
				echo "prénom : ".$_GET["prenom"];
			}
			?>
			<br/>
			<a href='5_get_theorie_et_fct.php?nom=Albert&prenom=Séb'>Passage de param</a>
	</body>
</html>