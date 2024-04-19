<?php
if (isset($_POST['email']) and isset($_POST['password'])){
    include("conexion.php");
    session_start();
    $query = "SELECT * FROM usuarios WHERE gmail='".$_POST['email']."' and contraseña='".$_POST['password']."'"or
    die("Error " . mysqli_error($link));
    $result = $link->query($query);
    $num_rows = mysqli_num_rows($result);
    $usuario = mysqli_fetch_array($result);
    if ($num_rows>0){
        echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: white;'>Se a logeado Correctamente!</h3><BR>";
        header("location: http://localhost/Pagina_concor/index.php");
        $_SESSION ["usuario"] = $usuario["ID"];
    }
    else {
        echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: white;'>No se a encontrado el usuario indicado por favor intentelo de nuevo!</h3><BR>";
        $query = "SELECT * FROM usuarios WHERE gmail='noInicio' and contraseña='noInicio'"or
        die("Error " . mysqli_error($link));
        $_SESSION ["usuario"] = $usuario["ID"];
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <div class="txt_login_center">
        <h1>Iniciar sesion</h1>
        <form method="post">
        <div class="txt_campo_login">
                <input type="text" name="nombre" placeholder="Nombre">
                <span></span>
            </div>
            <div class="txt_campo_login">
                <input type="password" name="password" placeholder="Contraseña">
                <span></span>
            </div>
            <div class="recuperacion">¿Has olvidado tu contraseña?</div>
            <input type="submit" value="Iniciar sesion">
            <div class="login_registrase">
            ¿no te has registrado? <a href="sign in.html"> registrarse</a>
            </div>
         </form>   
        </div>
</body>
</html>