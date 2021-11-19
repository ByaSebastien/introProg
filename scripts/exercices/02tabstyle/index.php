<?php
$ligne=5;
$colone=6;
?>

<!DOCTYPE html>
	<html>
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
	</style>
</head>
<body>
	<table>
		<?php
		for ($i=0; $i <$colone ; $i++) { 
			?>
			<tr>
				<?php	
				for($j=0;$j<$ligne;$j++){
					$nombre=rand(0,99);
					if ($nombre%2==0) {
						?>
						<td class="rose"><?php echo "$nombre";?></td>
						<?php
					}else{
						?>
						<td class="bleu"><?php echo "$nombre";?></td>
						<?php
					}
				}
				?>
			</tr>
			<?php
		}
		?>
	</table>
</body>
</html>