<!DOCTYPE html>
<html>
<head lang="fr">
	<meta charset="utf-8">
	<title>Formulaire</title>
</head>
<body>
	<?php
	$nb=0;
	if (isset($_POST['plus'])) {
		$nb=++$_POST['nb'];
	}
	if (isset($_POST['moin'])) {
		$nb=--$_POST['nb'];
	}
	?>
	<form action="index.php" method="POST">
		<button type="submit" name="moin">-</button>
		<input type="number" name="nb" value="<?php echo $nb?>" readonly/>
		<button type="submit" name="plus">+</button>
	</form>
</body>
</html>