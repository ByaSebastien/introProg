<?php
require_once('./fonctions/template.func.php');
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Base de données</title>
	<style type="text/css">
		th,td{
			padding: 5px 10px;
		}
		table{
			border-collapse: collapse;
			text-align: center;
		}
		.button{
			margin: 0px 5px;
		}
	</style>
</head>
<body>
	<table>
		<tr>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Date de naissance</th>
			<th>Genre</th>
			<th>Mot de passe</th>
			<th>Action</th>
		</tr>
		<?php
		echo write($index,$modifier,$tab);
		?>
	</table>
</body>
</html>