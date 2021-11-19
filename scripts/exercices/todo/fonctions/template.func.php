<?php
function writeForm($todos){
$ret='<form action="todo.php" method="post"><input type="text" name="newtodo" value=""><input type="submit" name="action" value="ajouter"><hr><ul>';

foreach ($todos as $index => $intitule) {
    $ret=$ret."<li><input class='buttong' type='submit' name='action' value='toggle_$index'>".$todos[$index]['intitule'];


    if($todos[$index]['complete']===true){
        $ret=$ret."-done";
        $bool="true";
    }else{
        $ret=$ret."-todo";
        $bool="false";
    }
    $ret=$ret."<input class='buttond' type='submit' name='action' value='delete_$index'></li>";
    $ret=$ret."<input type='hidden' name='complete[]' value='".$bool."'><input type='hidden' name='todo_item[]' value='".$todos[$index]['intitule']."'></form>";
     
}
$ret=$ret."</ul>";
return $ret;
}
function writeSumary($todos){
    $ret="";
    $cpt=0;
    foreach ($todos as $key => $value) {
        if ($value["complete"]===true) {
            $cpt++;
        }
    }
    $ret="Todo: ".(count($todos)-$cpt)."</p>";
    $ret=$ret."Complete: ".$cpt."</p>";
    $ret=$ret."<p>Total: ".count($todos)."</p>";
    return $ret;
}
?>