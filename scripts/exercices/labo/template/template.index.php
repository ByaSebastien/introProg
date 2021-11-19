<?php
require_once('./fonctions/template.func.php');
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Vidéothèque</title>
	<link rel="stylesheet" type="text/css" href="styles/normalize.css">
	<link rel="stylesheet" type="text/css" href="styles/main.css?v=<?php echo time(); ?>">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Cinzel:wght@400;500;600;700;800;900&family=Lemonada:wght@300;400;500;600;700&family=Nunito:ital,wght@0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
	<script src="https://use.fontawesome.com/releases/v5.11.2/js/all.js"></script>
</head>
<body>
	<header>
		<h1>Vidéothèque</h1>
		<form action='index.php' method='post'>
			<input class="search" type="text" name="search" placeholder="      Rechercher">
			<input class="button" type="image" alt="Rechercher" src="images/loupe1.png">
			<!--<input type="image" name="action" alt="Rechercher" src="" value="search">-->
		</form>
	</header>
	<?php
	echo navigation($page,$nbPage,$search);
	echo affichage($tab);
	echo navigationb($page,$nbPage,$search);
	?>	
	<footer>
		<hr>
		<p class="footer"><i class="far fa-copyright"></i> Vidéothèque</p>
	</footer>
</body>
</html>