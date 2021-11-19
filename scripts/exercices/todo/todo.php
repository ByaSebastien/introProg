<?php 
require_once('./fonctions/param.func.php');

$todos=[];

$item_intitule = isset($_POST['todo_item'])? $_POST['todo_item'] : [];
$item_complete = isset($_POST['complete'])? $_POST['complete'] : [];

foreach ($item_intitule as $index => $intitule) {$todos[$index]=["complete" => ($item_complete[$index]==="true")?true:false,"intitule"=> $intitule];}

$action=isset($_POST['action'])? $_POST['action'] : "";
$newtodo=isset($_POST['newtodo'])? $_POST['newtodo']: "";

$index= getIndex($action);
$action= getAction($action);

switch ($action) {
	case 'ajouter':
		$todos[]=["complete" => false, "intitule" => $newtodo];
		break;
	case 'reset':
		$todos=[];
		break;
	case 'delete':
		unset($todos[$index]);
		$todos=array_values($todos);
		break;
	case 'toggle':
		$todos[$index]['complete']= !$todos[$index]['complete'];
		break;
	default:
		break;
}

require_once('./template/todo.template.php');