<?php
include("conexion.php");
session_start();

if (isset($_POST['name']) and isset($_POST['canal_reglas']) and isset($_POST['canal_actualizaciones'])){
    /***********CANALES***********/

    /*CATEGORIA*/

    $queryCategoria = "INSERT INTO categoria(Cant_canales, nombre) VALUES (2,'normales')"or
    die("Error 1" . mysqli_error($link));
    $resultCategoria = $link->query($queryCategoria);

    $queryBuscarCategoria = "SELECT MAX(ID) AS ID FROM categoria"or
    die("Error 2" . mysqli_error($link));
    $resultBuscarCategoria = $link->query($queryBuscarCategoria);
    $intBuscarCategoria = mysqli_fetch_array($resultBuscarCategoria);
    /*REGLAS*/

    $queryCanalReglas = "INSERT INTO canal(tiempo_pausado_seg, categoria, descripcion, nombre, tipo_de_canal) VALUES (0, ".$intBuscarCategoria['ID'].", 'reglas','".$_POST['canal_reglas']."','chat')"or
    die("Error 3" . mysqli_error($link));
    $resultCanalReglas = $link->query($queryCanalReglas);

    $querySelectReglas = "SELECT MAX(ID) AS ID FROM canal"or
    die("Error 4" . mysqli_error($link));
    $resultSelectReglas = $link->query($querySelectReglas);
    $intBuscarReglas = mysqli_fetch_array($resultSelectReglas);

    /*ACTUALIZACIONES*/

    $queryCanalesActualizaciones = "INSERT INTO canal(categoria, descripcion, nombre, tipo_de_canal, tiempo_pausado_seg) VALUES (".$intBuscarCategoria['ID'].", 'actualizaciones','".$_POST['canal_actualizaciones']."','chat','0')"or
    die("Error 5" . mysqli_error($link));
    $resultCanalesActualizaciones = $link->query($queryCanalesActualizaciones);

    $querySelectActualizaciones = "SELECT MAX(ID) AS ID FROM canal"or
    die("Error 6" . mysqli_error($link));
    $resultSelectActualizaciones = $link->query($querySelectActualizaciones);
    $intBuscarActualizaciones = mysqli_fetch_array($resultSelectActualizaciones);

    /*********SERVER**********/

    /*CONFIG*/

    $queryConfig = "INSERT INTO configuraciones_server(canal_reglas, canal_actualizaciones) VALUES (".$intBuscarReglas['ID'].",".$intBuscarActualizaciones['ID'].")"or
    die("Error 8" . mysqli_error($link));
    $resultConfig = $link->query($queryConfig);

    $querySelectConfig = "SELECT MAX(ID) AS ID FROM configuraciones_server"or
    die("Error 9" . mysqli_error($link));
    $resultSelectConfig = $link->query($querySelectConfig);
    $intBuscarConfig = mysqli_fetch_array($resultSelectConfig);

    /*SERVIDOR*/

    $queryServer = "INSERT INTO servidor(nombre, configuraciones) VALUES ('".$_POST['name']."', ".$intBuscarConfig['ID'].")"or
    die("Error 10" . mysqli_error($link));
    $resultServer = $link->query($queryServer);
    

    $querySelectServidor = "SELECT MAX(ID) AS ID FROM servidor"or
    die("Error 11" . mysqli_error($link));
    $resultSelectServidor = $link->query($querySelectServidor);
    $intBuscarServidor = mysqli_fetch_array($resultSelectServidor);

    /********MIEMBROS********/

    /*ROLES*/

    $queryRol = "INSERT INTO roles(color, configuracion_server, descripcion_roles, nombre_roles) VALUES ('grey',".$intBuscarConfig['ID'].",'Miembros','Miembros')"or
    die("Error 12" . mysqli_error($link));
    $resultRol = $link->query($queryRol);

    $querySelectRol = "SELECT MAX(ID) AS ID FROM roles"or
    die("Error 13" . mysqli_error($link));
    $resultSelectRol = $link->query($querySelectRol);
    $intBuscarRol = mysqli_fetch_array($resultSelectRol);

    /*MIEMBROS*/

    $queryMiembros = "INSERT INTO miembros(dia_inicio, server) VALUES (curdate(), ".$intBuscarServidor['ID'].")"or
    die("Error 14" . mysqli_error($link));
    $resultMiembros = $link->query($queryMiembros);

    $querySelectMiembros = "SELECT MAX(ID) AS ID FROM miembros"or
    die("Error 15" . mysqli_error($link));
    $resultSelectMiembros = $link->query($querySelectMiembros);
    $intBuscarMiembros = mysqli_fetch_array($resultSelectMiembros);

    $queryLogear = "INSERT INTO logear(miembros, usuario) VALUES ('".$intBuscarMiembros['ID']."', ".$_SESSION['usuario'].")"or
    die("Error 16" . mysqli_error($link));
    $resultLogear = $link->query($queryLogear);

    $queryAsignar = "INSERT INTO asignar(usuario, rol) VALUES ('".$intBuscarMiembros['ID']."', ".$intBuscarRol['ID'].")"or
    die("Error 17" . mysqli_error($link));
    $resultAsignar = $link->query($queryAsignar);

    /************AGREGADOS************/

    $queryAgregarConfig = "UPDATE configuraciones_server
    SET servidor = ".$intBuscarServidor['ID']."
    WHERE ID=".$intBuscarConfig['ID'].""or
    die("Error " . mysqli_error($link));
    $resultAgregarConfig = $link->query($queryAgregarConfig);

    $queryAgregarConfig = "UPDATE configuraciones_server
    SET creador = ".$intBuscarMiembros['ID']."
    WHERE ID=".$intBuscarConfig['ID'].""or
    die("Error " . mysqli_error($link));
    $resultAgregarConfig = $link->query($queryAgregarConfig);

    $queryAgregarCategoria = "UPDATE categoria
    SET servidor = ".$intBuscarServidor['ID']."
    WHERE ID=".$intBuscarCategoria['ID'].""or
    die("Error " . mysqli_error($link));
    $resultAgregarCategoria = $link->query($queryAgregarCategoria);

    $queryAgregarReglas = "UPDATE canal
    SET servidor = ".$intBuscarServidor['ID']."
    WHERE ID=".$intBuscarReglas['ID'].""or
    die("Error " . mysqli_error($link));
    $resultAgregarReglas = $link->query($queryAgregarReglas);

    $queryAgregarActualizaciones = "UPDATE canal
    SET servidor = ".$intBuscarServidor['ID']."
    WHERE ID=".$intBuscarActualizaciones['ID'].""or
    die("Error " . mysqli_error($link));
    $resultAgregarActualizaciones = $link->query($queryAgregarActualizaciones);

    if (($resultCategoria!="") and ($resultBuscarCategoria!="") and ($resultCanalReglas!="") and ($resultSelectReglas!="") and ($resultCanalesActualizaciones!="") and ($resultSelectConfig!="") and ($resultConfig!="") and ($resultSelectServidor!="") and ($resultServer!="") and ($resultRol!="") and ($resultSelectRol!="") and ($resultMiembros!="") and ($resultSelectMiembros!="") and ($resultLogear!="") and ($resultAsignar!="") and ($resultAgregarConfig!="") and ($resultAgregarCategoria!="") and ($resultAgregarReglas!="") and ($resultAgregarActualizaciones!="")){
    echo "<h3 style='margin: 10px 10px 10px 10px; text-shadow: black solid 1px; color: white;'>Se a registrado Correctamente!</h3><BR>";
    header("location: http://localhost/Pagina_concor/index.php");
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
    <title>Concord Crear Servidor</title>
    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body class="login">
    <div class="txt_login_center">
    <h1>Crear Servidor</h1>
    <form method="post" enctype="multipart/form-data">
        <div class="txt_campo_login">
            <input type="text" name="name" placeholder="Nombre">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="canal_reglas" placeholder="Canal de Reglas">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <input type="text" name="canal_actualizaciones" placeholder="Canal de Actualizaciones">
            <span></span>
        </div>
        <div class="txt_campo_login">
            <label for="myfile">Seleccione una imagen para el canal</label>
            <input type="file" name="fileToUpload" id="fileToUpload">
            <input type="submit" value="Upload Image" name="submit">
        </div>
        <input type="hidden" name="nombre_tabla" value="canal">
        <input type="submit" value="Crear Servidor">
        <input type="">
     </form>   
    </div>
</body>
</html>