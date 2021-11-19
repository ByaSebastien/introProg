<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>Recoit</title>
</head>
<body>
	<?php
	if (isset($_POST['envoi']) || isset($_POST['envoi_x'])) {
		echo "Nombre de parametre : ".count($_POST);
		echo "<ul>";
		foreach ($_POST as $key => $value) {
			if (is_array($value)) {
				echo "<li>$key : </li>";
				echo "<ul>";
				foreach($value as $key2 => $value2){
					echo "<li>$key2 : $value2</li>";
				}
				echo "</ul>";
			}else{
				echo "<li>$key : $value";
			}
		}
		echo "</ul>";
	}
	?>
</body>
</html>