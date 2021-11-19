<?php

$nom=null;
$nom_valide=false;

$prenom=null;
$prenom_valide=false;

$password=null;
$password_valide=false;

$sexe=null;
$sexe_valide=false;

$pays=null;
$pays_valide=false;

$permis=[];
//$permis_valide=false;

$commentaire=null;
//$commentaire_valide=false;

if (isset ($_POST['nom'])) {
	$nom=$_POST['nom'];
}
if (isset ($_POST['prenom'])) {
	$prenom=$_POST['prenom'];
}
if (isset ($_POST['password'])) {
	$password=$_POST['password'];
}
if (isset ($_POST['sexe'])) {
	$sexe=$_POST['sexe'];
}
if (isset ($_POST['pays'])) {
	$pays=$_POST['pays'];
}
if (isset ($_POST['permis'])) {
	$permis=$_POST['permis'];
}
if (isset ($_POST['commentaire'])) {
	$commentaire=$_POST['commentaire'];
}
if (isset($_POST['reset'])) {
	$nom=null;
	$nom_valide=false;

	$prenom=null;
	$prenom_valide=false;

	$password=null;
	$password_valide=false;

	$sexe=null;
	$sexe_valide=false;

	$pays=null;
	$pays_valide=false;

	$permis=[];
	//$permis_valide=false;

	$commentaire=null;
	//$commentaire_valide=false;
}

//validation
//nom
if (!is_null($nom)) $nom=trim($nom);
$nom_requis= ($nom !=="");
$nom_max=strlen($nom)<=6;
//$nom_first_letter= strpos("0123456789",substr($nom, 0,1))==false;
//faire chr() car si nom = "" ou null , strpos déconne
//echo strpos("ABCDEFGHIJKLMNOPQRSTUVW",chr(""));

$nom_first_letter= ($nom =='' or $nom===null) ? true : strpos("ABCDEFGHIJKLMNOPQRSTUVWXYZÀÁÂÃÄÅÇÈÉÊËÌÍÎÏÒÓÔÕÖÙÚÛÜÝ",substr(mb_strtoupper($nom,"UTF-8"), 0,1))!==false; // attention strtoupper avant trim car déconne quand vide => erreur de strpos.

$nom_valide= $nom_requis && $nom_max && $nom_first_letter;

$prenom_max=strlen(trim($prenom))<=6;

$prenom_valide=$prenom_max;

$password_requis=trim($password) !=="";

$password_valide=$password_requis;

$pays_requis=($pays !== 'none');

$pays_valide=$pays_requis;

$password_valide=$password_requis;

$valide=$nom_valide && $prenom_valide && $password_valide && $pays_valide;

//Doit être fait avant toute écriture!!!!
if ($valide) {
header("Location:ok.php");
}

?>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="UTF-8">

	<title>formulaire2</title>

	<style>.error{color:red;}</style>
</head>
<body>
	<form action="index.php" method="post">
		<label for="nomid">nom<span class="sup"></span>
			<input type="text" name="nom" id="nomid" value="<?php echo $nom ?>">
			<div class="contraintes">
				<!--span class=" item required error"> test </span--> <!-- un élé peut avoir plusieurs classes -->
				<span class=" item required <?php if(!is_null($nom)&&($nom_requis===false)) echo "error" ?>"> requis  </span>
				<span class=" item maxlength <?php if(!is_null($nom)&&($nom_max===false)) echo "error" ?>"> Max.6 caractères</span>
				<span class=" item firstletter <?php if(!is_null($nom)&&($nom_first_letter===false)) echo "error" ?>"> Le premier caractère doit être une lettre  </span>

			</div>
		</label>
		<br>
		<br>
		<label for="prenomid">prenom<span class="sup"></span>
			<input type="text" name="prenom" id="prenomid" value="<?php echo $prenom ?>">
			<div class="contraintes">
				<span class=" item maxlength <?php if(!is_null($prenom)&&($prenom_max===false)) echo "error" ?>"> Max.6 caractères</span>
			</div>
		</label>
		<br>
		<br>

		<label for="password">password<span class="sup"></span>
			<input type="password" name="password" id="passwordid" value="<?php echo $password ?>">
			<div class="contraintes">
				<span class="item required <?php if(!is_null($password)&&($password_requis===false)) echo "error" ?>"> requis </span>
			</div>

		</label>
		<br>

		<br>

		<label for="sexeIdF">Femme</label> :
		<input type="radio" name="sexe" id="sexeIdF" value="F" <?php if(!is_null($sexe) && $sexe=='F'){ echo "checked";} ?>> 
		<label for="sexeIdH">Homme</label> :
		<input type="radio" name="sexe" id="sexeIdH" value="H" <?php if(is_null($sexe) || $sexe=='H'){ echo "checked";} ?>></label>

		<div class="contraintes">
			<span class="item required"> requis </span>
			<!-- avec un checked => toujours une réponse -->
		</div>
		
		<br>
		<br>

		<label for="permis"> A:</label> 
		<input type="checkbox" name="permis[]" id="permis" value="A" <?php if (array_search("A", $permis)!==false) {echo "checked";} ?>> 
		<label for="permis2"> B:</label> 
		<input type="checkbox" name="permis[]" id="permis2" value="B" <?php if (array_search("B", $permis)!==false) {echo "checked";} ?>>
		<label for="permis3"> C:</label> 
		<input type="checkbox" name="permis[]" id="permis3" value="C" <?php if (array_search("C", $permis)!==false) {echo "checked";} ?>>
		<br>
		<br>
		
		Pays:	<select name="pays">
			<option value="none" <?php if(is_null($pays)){ echo "selected";} ?>>Aucun</option>
			<option value="be" <?php if($pays=='be'){ echo "selected";} ?>>Belgique</option>
			<option value="fr" <?php if($pays=='fr'){ echo "selected";} ?>>France</option>
			<option value="de" <?php if($pays=='de'){ echo "selected";} ?>>Allemagne</option>
			
		</select>
		<div class="contraintes">
			<span class="item required <?php if(!is_null($pays)&&($pays_requis===false)) echo "error" ?>"> requis </span>
		</div>

		<br>
		<br>

		<textarea name="commentaire" cols=30 rows=10><?php echo $commentaire; ?></textarea>
		<br>
		<br>

		<br>

		<input type="submit" value="soumettre">	
		<input type="submit" value="reset" name="reset">
		<!-- reset remet les values de départ depuis chargement de la page => si il y a eu soumission, comme les valeurs sont écrites dans les champs, elles deviennent valeurs de départ--> 
	</form>
</body>
</html>