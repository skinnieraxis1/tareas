<?php
include("conexion.php");

if (isset($_POST['email']) and isset($_POST['password']) and isset($_POST['nombre']) and isset($_POST['apellido']) and isset($_POST['name'])){
    /***********CANALES***********/
    /*REGLAS*/
    $queryCanalesReglas = "INSERT INTO usuarios(descripcion, nombre, tipo_de_canal, tiempo_pausado_seg) VALUES ('reglas','".$_POST['canal_reglas']."','chat','0')"or
    die("Error " . mysqli_error($link));
    /*ACTUALIZACIONES*/
    $queryCanalesActualizaciones = "INSERT INTO usuarios(descripcion, nombre, tipo_de_canal, tiempo_pausado_seg) VALUES ('actualizaciones','".$_POST['canal_actualizaciones']."','chat','0')"or
    die("Error " . mysqli_error($link));
    /*BANEOS*/
    $queryListaBaneos = "INSERT INTO usuarios(descripcion, nombre, tipo_de_canal, tiempo_pausado_seg) VALUES ('actualizaciones','".$_POST['canal_actualizaciones']."','chat','0')"or
    die("Error " . mysqli_error($link));
    /*********SERVER**********/
    /*CONFIG*/
    $queryConfig = "INSERT INTO usuarios(canal_reglas, canal_actualizacion, gmail) VALUES ('".$_POST['nombre']."','".$_POST['apellido']."','".$_POST['password']."','".$_POST['name']."','".$_POST['email']."')"or
    die("Error " . mysqli_error($link));
    /*SERVIDOR*/
    $queryServer = "INSERT INTO servidor(nombre, configuracion) VALUES ('".$_POST['name']."', )"or
    die("Error " . mysqli_error($link));

    /********MIEMBROS********/
    /*MIEMBROS*/
    $queryMiembros = "INSERT INTO usuarios(dia_inicio, roles_usuarios, server) VALUES ('actualizaciones','".$_POST['canal_actualizaciones']."','chat','0')"or
    die("Error " . mysqli_error($link));
    /*ROLES*/
    $queryCanalesRoles = "INSERT INTO usuarios(color, descripcion_roles, nombre_roles) VALUES ('actualizaciones','".$_POST['canal_actualizaciones']."','chat','0')"or
    die("Error " . mysqli_error($link));

    $result = $link->query($queryConfig);
    $result = $link->query($queryServer);

    if (($result==1) and ($resultConfig==1)){
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
            <input type="text" name="name" placeholder="Nombre">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="canal_reglas" placeholder="Canal de Reglas">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="canal_actualizaciones" placeholder="Apellido">
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