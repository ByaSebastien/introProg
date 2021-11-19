
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Utilisateurs</title>
</head>

<body>
    <?php
    try{

    $dbh = new PDO(
        "mysql:dbname=intro_2019;host=localhost;port=3308",
        "root",
        "",
        array(
            PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES \'UTF8\'',
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
        )
    );

    $sql = "SELECT * FROM USER";
    $stmt = $dbh -> prepare($sql);

    //3. Exécution de la requête
    $stmt->execute(); 
    $stmt->setFetchMode(PDO::FETCH_ASSOC);
    $tab=$stmt->fetchAll();
    foreach($tab as $row) {
        echo $row["use_id"]," ",$row["use_nom"]," ",$row["use_prenom"]," ",$row["use_ddn"]," ",$row["use_sexe"]," ",$row["use_pwd"],"<br>";
    }

    $stmt = $dbh ->query($sql);
    $tab = $stmt->fetchAll();
    foreach($tab as $row) {
        echo $row["use_id"]," ",$row["use_nom"]," ",$row["use_prenom"]," ",$row["use_ddn"]," ",$row["use_sexe"]," ",$row["use_pwd"],"<br>";
    }

    $sql = "insert into user (use_id,use_nom,use_prenom,use_ddn,use_sexe,use_pwd) values (
        default, 
        :nom,
        :prenom,
        :ddn,
        :sexe,
        md5(:mdp))"; // => pwd encrypté, pas possible de le décrypter mais si md5(pwd de connexion) == au pwd crypté dans db ok : avec md5 sur même mot on obtient la même chose
    $nom="albertine";
    $prenom="dede";
    $date="2020-05-20";
    $sexe="f";
    $pwd="mot";
    $stmt = $dbh -> prepare($sql);
    $stmt -> bindParam('nom', $nom);
    $stmt -> bindParam('prenom', $prenom);
    $stmt -> bindParam('ddn', $date);
    $stmt -> bindParam('sexe', $sexe);
    $stmt -> bindParam('mdp', $pwd);
    $stmt -> execute();

    //$sql = "delete from user where use_id=$id;";
    //$dbh->exec($sql);

    }catch (Exception $ex) {
    die("ERREUR FATALE : ". $ex->getMessage().'<form><input type="button" value="Retour" onclick="history.go(-1)"></form>');
    }
   ?>
</body>
</html>