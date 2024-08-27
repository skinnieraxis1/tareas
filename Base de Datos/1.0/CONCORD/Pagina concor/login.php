<?php
include("conexion.php");

$query = "SELECT * FROM usuarios WHERE gmail='".$_POST['email']."' and contraseña='".$_POST['password']."'"or
die("Error " . mysqli_error($link));

$result = $link->query($query);

if ($result==1){
echo "<h3>Se a logeado Correctamente!</h3><BR>";

}
else {
echo "<h3>No se a encontrado el usuario indicado por favor intentelo de nuevo!</h3><BR>";
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Concord login</title>
    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body class="login">
    <div class="txt_login_center">
    <h1>Iniciar sesion</h1>
    <form method="post">
    <div class="txt_campo_login">
            <input type="text" name="email" placeholder="Correo electrónico">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="password" placeholder="Contraseña">
            <span></span>
        </div>
        <div class="recuperacion">¿Has olvidado tu contraseña?</div>
        <input type="submit" value="Iniciar sesion">
        <div class="login_registrase">
        ¿no te has registrado? <a href="registrarse.php"> registrarse</a>
        </div>
     </form>   
    </div>
    
</body>
</html>