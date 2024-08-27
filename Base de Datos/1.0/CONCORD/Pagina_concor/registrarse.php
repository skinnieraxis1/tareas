<?php
include("conexion.php");

if (isset($_POST['email']) and isset($_POST['password']) and isset($_POST['nombre']) and isset($_POST['apellido']) and isset($_POST['name'])){
    $query = "INSERT INTO usuarios(nombre, apellido, contraseña, nombre_usuario, gmail) VALUES ('".$_POST['nombre']."', '".$_POST['apellido']."','".$_POST['password']."','".$_POST['name']."','".$_POST['email']."')"or
    die("Error " . mysqli_error($link));

    $result = $link->query($query);

    if ($result==1){
    echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: white;'>Se a registrado Correctamente!</h3><BR>";

    }
    else {
    echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: white;'>No es posible ingresar la informacion!</h3><BR>";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Concord registrarse</title>
    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body class="login">
    <div class="txt_login_center">
    <h1>Registrarse</h1>
    <form method="post">
        <div class="txt_campo_login">
            <input type="text" name="email" placeholder="Correo electrónico">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="name" placeholder="Nombre de Usuario">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="nombre" placeholder="Nombre">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="apellido" placeholder="Apellido">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="password" name="password" placeholder="Contraseña">
            <span></span>
        </div>
        <input type="submit" value="Iniciar sesion">
        <div class="login_registrase">
        ¿Ya tienes cuenta? <a href="login.php"> logueate</a>
        </div>
     </form>   
    </div>
</body>
</html>