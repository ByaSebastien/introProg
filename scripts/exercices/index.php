<?php
$nombre=rand(0,99);
?>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>Exe table</title>
	<link rel="stylesheet" type="text/css" href="../styles/normalize.css">
	<link rel="stylesheet" type="text/css" href="../styles/main.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Cinzel:wght@400;500;600;700;800;900&display=swap" rel="stylesheet"> 
	<style type="text/css">
	<?php
	if($nombre<50){
		?>
		table{
			background-image: url('../images/chien.jpg');
		}
		<?php
	}else{
		?>
		table{
			background-image: url(../images/chat.png);
		}
		<?php
	}
	?>
	</style>
</head>
<body>
	<div>
		<h1>Données sur les planètes du système solaire</h1>
		<table>
			<tr>
				<th colspan="2"> </th>
				<th>Nom</th>
				<th>Durée du jour(hours)</th>
				<th>Distance du soleil (10²km)</th>
				<th>Température moyenne (°C)</th>
				<th>Nombre de lunes</th>
				<th>Notes</th>
				<th>Représentation</th>
			</tr>
			<tr>
				<th colspan="2" rowspan="4">Planètes tellurique</th>
				<th>Mercure</th>
				<td>4222.6</td>
				<td>57.9</td>
				<td>167</td>
				<td>0</td>
				<td>La plus proche du Soleil</td>
				<td class="mercure img"> </td>
			</tr>
			<tr>
				<th>Venus</th>
				<td>2802.0</td>
				<td>108.2</td>
				<td>464</td>
				<td>0</td>
				<td> </td>
				<td class="venus img"> </td>
			</tr>
			<tr>
				<th>Terre</th>
				<td>24.0</td>
				<td>149.6</td>
				<td>15</td>
				<td>1</td>
				<td>Notre monde</td>
				<td class="terre img"> </td>
			</tr>
			<tr>
				<th>Mars</th>
				<td>24.7</td>
				<td>227.9</td>
				<td>-65</td>
				<td>2</td>
				<td>La planète rouge</td>
				<td class="mars img"> </td>
			</tr>
			<tr>
				<th rowspan="4">Planètes oviennes</th>
				<th rowspan="2">Géantes gazeuses</th>
				<th>Jupiter</th>
				<td>9.9</td>
				<td>778.6</td>
				<td>-110</td>
				<td>67</td>
				<td>La plus grosse planète</td>
				<td class="jupiter img"> </td>
			</tr>
			<tr>
				<th>Saturne</th>
				<td>10.7</td>
				<td>1433.5</td>
				<td>-140</td>
				<td>62</td>
				<td> </td>
				<td class="saturne img"> </td>
			</tr>
			<tr>
				<th rowspan="2">Géantes glacées</th>
				<th>Uranus</th>
				<td>17.2</td>
				<td>2872.5</td>
				<td>-195</td>
				<td>27</td>
				<td> </td>
				<td class="uranus img"> </td>
			</tr>
			<tr>
				<th>Neptune</th>
				<td>102</td>
				<td>4495.1</td>
				<td>-200</td>
				<td>14</td>
				<td> </td>
				<td class="neptune img"> </td>
			</tr>
			<tr>
				<th colspan="2">Planètes naines</th>
				<th>Pluton</th>
				<td>153.3</td>
				<td>5906.4</td>
				<td>-225</td>
				<td>5</td>
				<td>Déclassée en tant que planète en 2006 mais décision controversée</td>
				<td class="pluton img"> </td>
			</tr>
		</table>
	</div>
</body>
</html>