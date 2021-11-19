<?php
function write($index,$modifier,$tab){

	$ret="";

	foreach ($tab as $key) {
		if ($modifier && $key['use_id']===$index) {
			$ret=$ret."<form action='index.php' method='post'><tr>";
			$ret=$ret."<td><input type='text' name='nom' value='".$key['use_nom']."'></td><td><input type='text' name='prenom' value='".$key['use_prenom']."'></td><td><input type='date' name='ddn' value='".$key['use_ddn']."'></td><td><select name='sexe'><option value='m' ".(($key['use_sexe']=='m')?"selected":"").">Homme</option><option value='f' ".(($key['use_sexe']=='f')?"selected":"").">Femme</option></select></td><td><input type='text' name='mdp' value='".$key['use_pwd']."'></td><td><input class='button' type='submit' name='action' value='modifier'></tr><input type='hidden' name='index' value='".$key['use_id']."'></form>";
		}else{
			$ret=$ret."<tr><td>".$key['use_nom']."</td><td>".$key['use_prenom']."</td><td>".$key['use_ddn']."</td>";
			if ($key['use_sexe']==='m') {
				$ret=$ret."<td>Homme</td>";
			}else{
				$ret=$ret."<td>Femme</td>";
			}
			$ret=$ret."<td>".$key['use_pwd']."</td>";
			$ret=$ret."<form action='index.php' method='post'>";
			$ret=$ret."<td><input class='button' type='submit' name='action' value='modify'>";
			$ret=$ret."<input class='button' type='submit' name='action' value='delete'></td></tr>";
			$ret=$ret."<input type='hidden' name='index' value='".$key['use_id']."'>";
			$ret=$ret."</form>";

		}
	}
	$ret=$ret."<form action='index.php' method='post'><tr>";
	$ret=$ret."<td><input type='text' name='nom'></td><td><input type='text' name='prenom'></td><td><input type='date' name='ddn'></td><td><select name='sexe'><option value='h'>Homme</option><option value='f'>Femme</option></select></td><td><input type='text' name='mdp'></td><td><input class='button' type='submit' name='action' value='ajouter'></tr></form>";

	return $ret;
}
?>