<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Jeu</title>
</head>
<body>
	<?php
	session_start();
	if (isset($_POST['jouer'])) {
		unset($_SESSION['nb']);
	}
	if (isset($_POST['soumettre'])) {
		$_SESSION['cpt']++;
		if ($_SESSION['cpt']%5==0) {
			session_regenerate_id();
		}
		if ($_POST['nb']==$_SESSION['nb']) {
			$eval="Bravo tu as trouvé le bon nombre en ".$_SESSION['cpt']." coup !!!";
		}else{
			if ($_POST['nb']>$_SESSION['nb']) {
				$eval="Pas de chance, le nombre recherché est plus petit.";
			}else{
				$eval="Pas de chance, le nombre recherché est plus grand.";
			}
		}
	}else{
		$_SESSION['nb']=rand(1,100);
		$_SESSION['cpt']=0;
	}
	//session_destroy();
	?>
	<div>
		<h1>Trouve le nombre (compris entre 1 et 100)</h1>
		<form action="index.php" method="POST">
			<label for="nbId">Entrez un nombre</label>
			<input type="number" name="nb">
			<button type="submit" name="soumettre">Soumettre</button>
			<button type="submit" name="jouer">Rejouer</button>
			<br>
		</form>
		<p><?php if (isset($eval)) {echo $eval;} ?></p>
	</div>
</body>
</html>