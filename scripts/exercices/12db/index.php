<?php
$action="";
$index=-1;
$modifier=false;
$sql = "select * from user";

require_once('./fonctions/param.func.php');

    $action=isset($_POST['action'])?$_POST['action']:"";
    $index=isset($_POST['index'])?$_POST['index']:"";
    $nom=isset($_POST['nom'])?$_POST['nom']:"";
    $prenom=isset($_POST['prenom'])?$_POST['prenom']:"";
    $date=isset($_POST['ddn'])?$_POST['ddn']:"";
    $sexe=isset($_POST['sexe'])?$_POST['sexe']:"";
    $pwd=isset($_POST['mdp'])?$_POST['mdp']:"";

try{
	$dbh=connection();
    
    switch ($action) {
        case 'delete':
            delete($dbh,$index);
        break;
        case 'modifier':
            modifier($dbh,$nom,$prenom,$date,$sexe,$pwd,$index);
        break;
        case 'ajouter':
            ajouter($dbh,$nom,$prenom,$date,$sexe,$pwd);
            break;
        case 'modify':
            $modifier=true;
            break;
        default:
            break;
    }
    $stmt = $dbh ->query($sql);
    $tab = $stmt->fetchAll();

}catch (Exception $ex) {
	die("ERREUR FATALE : ". $ex->getMessage().'<form><input type="button" value="Retour" onclick="history.go(-1)"></form>');
}
require_once('./template/index.template.php');
?>