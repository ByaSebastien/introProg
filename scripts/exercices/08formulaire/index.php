<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Formulaire</title>
	<style type="text/css">
		body{
			background-image: url(image.jpg);
			background-repeat: no-repeat;
			background-size: cover;
		}
		label{
			color: white;
			font-weight: 900;
		}
		input,textarea{
			background-color: black;
			color: white;
		}
		div{
			max-width: 700px;
			margin: auto;
			text-align: left;
		}
		h1{
			font-weight: 900;
			font-size: 5em;
			color: white;
		}
		form{
			text-align: left;
		}
	</style>
</head>
<body>
	<?php
	$liste="";
	$somme=0;
	if (isset($_POST['soumettre'])) {
		$liste=$_POST['list'];
		if ($liste=="") {
		$liste=$_POST['nb'];
		}else{
			$liste=$liste.",".$_POST['nb'];
		}
		$tab=explode(",", $liste);
		//explode
		if (isset($tab)) {
		foreach ($tab as $key => $value) {
			$somme=$somme+(integer)$value;
		}
		$refP=$tab[0];
		$refG=$tab[0];
		foreach ($tab as $key2 => $value2){
			if($value2<$refP){
				$refP=$value2;
			}
			if ($value2>$refG) {
				$refG=$value2;
			}
		}
		}
	}
	?>
	<div>
	<h1>Test des nombres</h1>
	<form action="index.php" method="POST">
		<input type="number" name="nb" value=''/>
		<button type="submit" name="soumettre">soumettre</button>
		<button type="submit" name="initialiser">initialiser</button>
		<br/><br/><br/>
		<label for="nombreDeNombresId">Nombre de nombres</label>
		<input type="number" name="nombreDeNombres" value="<?php if(isset($tab)){echo count($tab);}?>" id="nombreDeNombresId" readonly="readonly"/>
		<br/><br/><br/>
		<label for="sommeDesNombresId">Somme des nombres</label>
		<input type="number" name="sommeDesNombres" value="<?php if(isset($tab)){echo $somme;}?>" id="sommeDesNombresId" readonly/>
		<br/><br/><br/>
		<label for="moyenneDesNombresId">Moyenne des nombres</label>
		<input type="number" name="moyenneDesNombres" value="<?php if(isset($tab)){echo $somme/count($tab);}?>" id="moyenneDesNombresId" readonly/>
		<br/><br/><br/>
		<label for="plusGrandId">Plus grand</label>
		<input type="number" name="plusGrand" value="<?php if(isset($tab)){echo $refG;} ?>" id="plusGrandId" readonly/>
		<br/><br/><br/>
		<label for="plusPetitId">Plus petit</label>
		<input type="number" name="plusPetit" value="<?php if(isset($tab)){echo $refP;} ?>" id="plusPetitId" readonly/>
		<br/><br/><br/>
		<label for="listId">Liste des nombres</label>
		<textarea name="list" id="listeDesNombresId" cols=30 rows=10 readonly><?php 
		echo $liste;
	?></textarea>
	</form>
	</div>
</body>
</html>