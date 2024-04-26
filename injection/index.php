<?php
    include("conexion.php");
    if (isset($_POST['name']) and isset($_POST['password']) and isset($_POST['username']) and isset($_POST['surname']) and isset($_POST['mail'])){
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
    }else{

    }
    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body>
    <div class="navbar">
    </div>
    <div class="cuerpoG"></div>
    <form action="" method="post">
        <div class="cuerpoA">
            <label for="name">Name:</label>
            <input id="name" type="text" name="name" />

            <label for="surname">Surname:</label>
            <input id="surname" type="text" name="surname" />

            <label for="mail">Mail:</label>
            <input id="mail" type="text" name="mail" />

            <label for="username">Username:</label>
            <input id="username" type="text" name="username" />

            <label for="password">Password:</label>
            <input id="password" type="password" name="password" />


            <input type="submit" value="Save" class="submit" />
        </div>
        <div class="cuerpoB">

        </div>
    </form>
</body>
</html>