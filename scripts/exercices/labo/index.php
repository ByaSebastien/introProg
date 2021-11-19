<?php 

$page=1;
$action="";
$search="%%";

require_once('./fonctions/index.func.php');

try{
	$dbh=connection();

	//$action=isset($_POST['action'])?$_POST['action']:"";
	if(isset($_GET['search'])){
		$search=$_GET['search'];
		$action="search";
	}
	if(isset($_POST['search'])){
		$search="%".$_POST['search']."%";
	}	
	if(isset($_GET['pageS'])){
		$page=$_GET['pageS']+1;
	}
	if(isset($_GET['pageP'])){
		$page=$_GET['pageP']-1;
	}
	$nbPage=isset($_GET['nbpage'])?$_GET['nbpage']:7;

	$nbPage=(compte($dbh,$search)/10)+1;
	$nbPage=(int)$nbPage;
	$tab=recherche($dbh,$search,$page);
	/*switch ($action) {

		case 'search':
			if (!isset($_GET['nbpage'])) {
				$nbPage=(compte($dbh,$search)/10)+1;
				$nbPage=(int)$nbPage;
			}
			$tab=recherche($dbh,$search,$page);
			break;
		
		default:
			if (!isset($_GET['nbpage'])) {
				$nbPage=(compteListe($dbh)/10)+1;
				$nbPage=(int)$nbPage;
			}
			$tab=liste($dbh,$page);
			break;
	}*/

}catch (Exception $ex) {
	die("ERREUR FATALE : ". $ex->getMessage().'<form><input type="button" value="Retour" onclick="history.go(-1)"></form>');
}

require_once('./template/template.index.php');

?>