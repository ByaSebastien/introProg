<?php 
    // VUE
    // Fonctions sur de la vue writeForm(), writeSummary()...
    require_once('./fonctions/template.func.php');
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Todo List</title>
    <style type="text/css">
        .buttong{
            margin: 5px 10px 5px 0px;
        }
        .buttond{
            margin: 5px 0px 5px 10px;
        }
        body{
            background-image: url("./images/kevin.jpg");
            background-size: cover;
            background-position: center;
            font-size: 2em;
        }
    </style>
</head>
<body>
    <h1>Todo List</h1>
        <?php
            echo writeForm($todos);
        ?>
        <hr>
        <?php
            echo writeSumary($todos);
        ?>
        <hr>
    <form action="todo.php" method="POST">
        <input type="submit" name="action" value="reset">
    </form>
</body>
</html>