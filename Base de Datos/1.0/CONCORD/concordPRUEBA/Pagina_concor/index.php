<?php
    session_start();
    if($_SESSION["usuario"]==""){
        header("location: http://localhost/Pagina_concor/home.php");
    }
    $query = "SELECT * FROM usuarios WHERE gmail='".$_POST['email']."' and contraseña='".$_POST['password']."'"or
    die("Error " . mysqli_error($link));
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Concord</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <link rel="stylesheet" href="../Pagina_concor/assets/css/styleIndex.css">
</head>
<body>
    <div class="cuerpo-index">
        <div class="navbar-amigos-izq"></div>
        <div class="cuerpo">
            <div class="navbar-servidores">
                <nav>
                    <div class="nav-wrapper">
                    <ul>
                        <li><a class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">add</i></a></li>
                    </ul>
                    <ul class="pagination">
                        <li class="disabled"><a href="#!"><i class="material-icons">chevron_left</i></a></li>
                        <li><img class="img_server" src="./assets/img/jordiENP.jpg" alt=""></li>
                        <li><img class="img_server" src="./assets/img/jordiENP.jpg" alt=""></li>
                        <li><img class="img_server" src="./assets/img/jordiENP.jpg" alt=""></li>
                        <li><img class="img_server" src="./assets/img/jordiENP.jpg" alt=""></li>
                        <li><img class="img_server" src="./assets/img/jordiENP.jpg" alt=""></li>
                        <li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
                    </ul>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="../Pagina_concor/registrarse.php">Register</a></li>
                        <li><a href="../Pagina_concor/login.php">Login</a></li>
                        <li><a href="../Pagina_concor/logout.php">Logout</a></li>
                    </ul>
                    </div>
                </nav>
            </div>
            <div class="canal">
                <div class="barra-canales"></div>
                <div class="zona-texto">
                    <div class="texto">
                    
                    </div>
                    <div class="zona-escrita"></div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>