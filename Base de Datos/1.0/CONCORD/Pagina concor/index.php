<?php
//echo "Bienvenidos a Concord"
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Concord</title>
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
    <div class="cuerpo-index">
        <div class="navbar-amigos-izq"></div>
        <div class="cuerpo">
            <div class="navbar-servidores">
                <a class="nav-link" href="registrarse.php">Inicio</a>
                <a class="nav-link" href="login.php">login</a>  
            </div>
            <div class="canal">
                <div class="barra-canales"></div>
                <div class="zona-texto">
                    <div class="texto"></div>
                    <div class="zona-escrita"></div>
                </div>
            </div>
        </div>
    </div>
</body>
<style>
    *{
        padding: 0px;
        margin: 0px;
    }

    .cuerpo-index{
        margin: 0;
        padding: 0;
        font-family: monospace;
        place-content: center;
        background-image: linear-gradient(120deg, #8ab3af, #164e6e);
        height: 100vh;
    }
    
    .navbar-amigos-izq{
        width: 15%;
        height: 100vh;
        background-color: #73807f;
    }

    .cuerpo{
        width: 85%;
        height: 100vh;
        background-color: #185274;
        float:right;
        position: absolute;
        left: 15%;
        top: 0px;
    }

    .navbar-servidores{
        width: 100%;
        height: 15%;
    }

</style>
</html>