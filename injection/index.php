<?php
    include("conexion.php");
    if (isset($_POST['name']) and isset($_POST['password'])){
        include("conexion.php");
        session_start();
        $nombre = $_POST['name'];
        $contra = $_POST['password'];
        $query = "SELECT * FROM usuario WHERE usuario='".$nombre."' and contraseña='".$contra."'"or
        die("Error " . mysqli_error($link));
        $result = $link->query($query);
        $num_rows = mysqli_num_rows($result);
        if ($num_rows>0){
            echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: black;'>Se a logeado Correctamente!</h3><BR>";
        }
        else {
            if(strlen($nombre)> 12 || strlen($contra)> 12){
                echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: black;'>Usuario o contraseña mayor a 12 caracteres!</h3><BR>";
            }else{
                echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: black;'>Se logeará el usuario!</h3><BR>";
                $queryElse = "INSERT INTO usuario (usuario, contraseña) VALUES ('".$nombre."', '".$contra."');"or
                die("Error " . mysqli_error($link));
                $result = $link->query($queryElse);
            }
            
        }
    }
    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <?php
    
    

    ?>
</head>
<body>
    <form action="" method="post">

        <label for="name">Nombre:</label>
        <input id="name" type="text" name="name" />

        <label for="password">Contraseña:</label>
        <input id="password" type="password" name="password" />


        <input type="submit" value="Save" />

    </form>
</body>
</html>