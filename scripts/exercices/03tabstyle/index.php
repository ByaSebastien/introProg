<?php
$ligne=5;
$colone=6;
$nb=0;
$nb0=0;
?>

<!DOCTYPE html>
	<html lang="fr">
	<head>
		<meta charset="utf-8">
		<title>Tab Style</title>
		<style type="text/css">
		table{border-style: solid;border-width:1px;}
		td{
			border-style: solid;
			border-width:3px;
			padding: 10px;
			 }
		<?php
		for($nb0=0;$nb0<($colone*$ligne);$nb0++){
			$nb1=rand(0,255);
			$nb2=rand(0,255);
			$nb3=rand(0,255);
			?>
			.s<?php echo "$nb0";?>{ background-color: rgb(<?php echo "$nb1"; ?>, <?php echo "$nb2"; ?>, <?php echo "$nb3"; ?>)}
		<?php
		}
		?>
	</style>
</head>
<body>
	<table>
		<?php
		for ($i=0; $i <$ligne ; $i++) { 
			?>
			<tr>
				<?php	
				for($j=0;$j<$colone;$j++){
					$nombre=rand(0,99);
						?>
						<td class="s<?php echo "$nb"; ?>"><?php echo "$nombre";?></td>
						<?php
					$nb++;
				}
				?>
			</tr>
			<?php
		}
		?>
	</table>
</body>
</html>