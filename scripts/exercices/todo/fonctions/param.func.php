<?php 
	function getIndex($action){

		$tabIndex=explode("_", $action);
		return (count($tabIndex)>1)?$tabIndex[1]:-1;
	}
	function getAction($action){

		$tabAction=explode("_", $action);
		return $tabAction[0];
	}
 ?>