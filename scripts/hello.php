<?php
$message="Hello World";
$nombre=rand(0,99);
?>
<!doctype html>
<html lang="fr">
	<head>
		<title><?php echo $message; ?></title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="styles/main.css">
	</head>
	<body>
		<h1>Bonjour</h1>
		<?php 
		if($nombre<50){
			//echo "<h2>",$message,"</h2>";
			echo '<img src="images/chien.jpg">';
		}else{
			echo'<img src="images/chat.jpg">';
		}
		 ?>

		 <?php
		 if($nombre<50){
		 ?>
			<img src="images/chien.jpg">
		<?php
		}else{
		?>
			<img src="images/chat.jpg">
		<?php
		}
		?>
	</body>
</html>