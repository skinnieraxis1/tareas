<?php
    include("conexion.php");
    session_start();
    if($_SESSION["usuario"]==""){
        header("location: http://localhost/Pagina_concor/home.php");
    }
    $a=0;
    if(isset($_POST['server_activo'])){
        $_SESSION['server_activo'] = $_POST["server_activo"];
    }
    $queryServer="
    SELECT s.ID, s.nombre
    FROM servidor as s
    JOIN configuraciones_server as c ON s.id = c.servidor
    JOIN miembros as m ON c.ID = m.server
    JOIN logear as l ON m.ID = l.miembros
    JOIN usuarios as u ON l.usuario = u.ID
    WHERE u.ID = ".$_SESSION['usuario']."
    ";
    $resultServer=$link->query($queryServer);
    if(isset($_POST['mensaje-propio'])){
        $queryInsertMensaje = "INSERT INTO chat(dia_ingreso, canal, creador, mensaje) VALUES (curdate(), '".$_POST['canal_activo']."','".$_SESSION['usuario']."','".$_POST['mensaje-propio']."')"or
        die("Error " . mysqli_error($link));
        $resultInsertMensaje = $link->query($queryInsertMensaje);
    }
    if(isset($_POST['nombre_categoria']) and isset($_SESSION['server_activo'])){
        $queryInsertCategoria = "INSERT INTO categoria(servidor, nombre) VALUES (".$_SESSION['server_activo'].", '".$_POST['nombre_categoria']."')"or
        die("Error " . mysqli_error($link));
        $resultInsertCategoria = $link->query($queryInsertCategoria);
    }
    if(isset($_POST['nombre_canal']) and isset($_POST['categoria_new_canal']) and isset($_POST['descripcion_canal'])){
        $queryInsertCanal = "INSERT INTO canal(servidor, categoria, tipo_de_canal, nombre, descripcion) VALUES (".$_POST['server_activo'].", '".$_POST['categoria_new_canal']."', 'chat', '".$_POST['nombre_canal']."', '".$_POST['descripcion_canal']."')"or
        die("Error " . mysqli_error($link));
        echo $queryInsertServer;
        $resultInsertCanal = $link->query($queryInsertCanal);
    }
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
    <link rel="stylesheet" href="../Pagina_concor/assets/css/styleInd.css">
</head>
<body>
    <div class="cuerpo-index">
        <div class="navbar-amigos-izq"></div>
        <div class="cuerpo">
            <div class="navbar-servidores">
                <nav>
                    <div class="nav-wrapper">
                    <ul>
                        <li><a href="../Pagina_concor/creador_servidores.php" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">add</i></a></li>
                    </ul>
                    <ul class="pagination">
                        <li class="disabled"><a href="#!"><i class="material-icons">chevron_left</i></a></li>
                        <?php
                        while($arrayServerA=mysqli_fetch_array($resultServer))
                        {
                            echo '<li><a href="conectar_server.php?server='.$arrayServerA["ID"].'"><img class="img_server" src="./assets/img/jordiENP.jpg" alt="">'.$arrayServerA["nombre"].'</a></li>';
                        }
                        ?>
                        <li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
                    </ul>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="../Pagina_concor/registrarse.php">Sign In</a></li>
                        <li><a href="../Pagina_concor/login.php">Login</a></li>
                        <li><a href="../Pagina_concor/logout.php">Logout</a></li>
                    </ul>
                    </div>
                </nav>
            </div>
            <div class="canal">
                <div class="barra-canales">
                    <div class="zona-canales">
                            <?php
                            if(isset($_POST['server_activo'])){
                                $queryCategoria="
                                SELECT ca.ID, ca.nombre
                                FROM categoria as ca
                                JOIN servidor as s ON ca.servidor = s.ID
                                JOIN configuraciones_server as c ON s.ID = c.servidor
                                JOIN miembros as m ON c.ID = m.server
                                JOIN logear as l ON m.ID = l.miembros
                                JOIN usuarios as u ON l.usuario = u.ID
                                WHERE u.ID = ".$_SESSION['usuario']." and s.ID = ".$_POST['server_activo']."
                                ";
                                $resultCategoria=$link->query($queryCategoria);
                                while ($arrayCategoria=mysqli_fetch_array($resultCategoria)){
                                    echo '<div id="fab" class="fixed-action-btn">';
                                    echo '<a class="btn-floating btn-large red">';
                                    echo '<li class="large material-icons">'.$arrayCategoria["nombre"].'</li>';
                                    echo '</a>';     
                                    $queryCanal="
                                        SELECT can.ID, can.nombre, can.tipo_de_canal
                                        FROM canal as can
                                        JOIN categoria as ca ON can.categoria = ca.ID
                                        JOIN servidor as s ON ca.servidor = s.ID
                                        JOIN configuraciones_server as c ON s.ID = c.servidor
                                        JOIN miembros as m ON c.ID = m.server
                                        JOIN logear as l ON m.ID = l.miembros
                                        JOIN usuarios as u ON l.usuario = u.ID
                                        WHERE u.ID = ".$_SESSION['usuario']." and ca.ID = ".$arrayCategoria["ID"]."
                                        ";
                                    $resultCanal=$link->query($queryCanal);
                                    echo '<ul>';
                                    while ($arrayCanal=mysqli_fetch_array($resultCanal)){   
                                        echo '<li><a href="conectar_server.php?canal='.$arrayCanal["ID"].'&server='.$_POST["server_activo"].'" class="btn-floating red"><i class="material-icons">'.$arrayCanal["nombre"].'</i></a></li>';
                                    } 
                                    echo '<li><a onclick="crear_canal('.$arrayCategoria["ID"].')" class="btn-floating yellow darken-1"><i class="material-icons">add</i></a></li>';
                                    echo '</ul>';
                                    echo '</div>';
                                }  
                            }
                            ?> 
                        <div class="fixed-action-btn" id="a">
                            <a id="position_conf" class="btn-floating btn-large red">
                                <i  class="large material-icons">mode_edit</i>
                            </a>
                            <ul id="position_conf_ul">
                                <li><a onclick="crear_link()" class="btn-floating red"><i class="material-icons">group_add</i></a></li>
                                <li><a onclick="crear_categoria()" class="btn-floating green"><i class="material-icons">add_box</i></a></li>
                            </ul>
                        </div>  
                    </div>               
                </div>
                <div class="zona-texto"> 
                    <div class="texto">
                        <form method="post"></form>
                        <div class="form-chat">
                            <div class="form-mens-chat">
                                <div class="mens">
                                    <input type="text" name="mensaje-propio" placeholder="Escriba su mensaje...">
                                    <span></span>
                                </div>
                            </div>
                            <input type="submit" value="">
                        </div>
                        <div class="zona-mensajes">
                            <?php
                                if(isset($_POST["canal_activo"])){
                                    $queryMensaje="SELECT ID, mensaje FROM chat WHERE canal = ".$_POST["canal_activo"];
                                    $resultMensaje=$link->query($queryMensaje);
                                    while ($arrayMensaje=mysqli_fetch_array($resultMensaje)){   
                                        echo '<div class="zona-mensaje-indv">';
                                        echo '<div class="ej-ft-perfil"><img src="./assets/img/quagsire.png" alt=""></div>';
                                        echo '<div class="ej-mensaje"><p>'.$arrayMensaje["mensaje"].'</p></div>';
                                        echo '</div>';
                                    }
                                }
                            ?>
                            
                        </div>
                    </div>
                    <div class="zona-escrita"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="cat" id="crear_categoria">
        <div class="int_cat">
            <form method="post">
                <div class="txt_campo_login">
                    <input type="text" name="nombre_categoria" placeholder="Nombre categoria">
                    <span></span>
                </div>
                <div class="txt_campo_login">
                    <label for="myfile">Seleccione una imagen para la categoria</label>
                    <input type="file" id="myfile" name="Imagen_categoria">
                </div>
                <input type="submit" value="Crear">
            </form>   
            <a onclick="cerrar_categoria()" class="large material-icons" id="cerrar">clear</a>
        </div>
    </div>
    
    <div class="cat" id="crear_link">
        <div class="int_cat">
            <?php
            echo '<h3>enviale esto a tu amigo: localhost/Pagina_concor/ingresar_server.php?server='.$_POST["server_activo"].'</h3>';
            ?>
            <a onclick="cerrar_link()" class="large material-icons" id="cerrar">clear</a>
        </div>
    </div>

    <div class="cat" id="crear_canal">
        <div class="int_cat">
            <form method="post">

                <div class="txt_campo_login">
                    <input type="text" name="nombre_canal" placeholder="Nombre Canal">
                    <span></span>
                </div>

                <div class="txt_campo_login">
                    <input type="text" name="descripcion_canal" placeholder="Descripcion">
                    <span></span>
                </div>

                <div class="txt_campo_login">
                    <label for="Imagen_canal">Seleccione una imagen para el canal</label>
                    <input type="file" id="myfile" name="Imagen_canal">
                </div>

                <div class="txt_campo_login">
                    <input type="hidden" id="categoria_hidden" name="descripcion_canal" value="" placeholder="Descripcion">
                </div>
                <input type="submit" value="Crear">
            </form>
            <a onclick="cerrar_canal()" class="large material-icons" id="cerrar">clear</a>
        </div>
    </div>
</body>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.fixed-action-btn');
        var instances = M.FloatingActionButton.init(elems, {
            direction: 'left',
            hoverEnabled: false
        });
    });
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('#a');
        var instances = M.FloatingActionButton.init(elems, {
            direction: 'top',
            hoverEnabled: false
        });
    });

    function crear_categoria(){
        document.getElementById("crear_categoria").style.display="block";
    }
    function cerrar_categoria(){
        document.getElementById("crear_categoria").style.display="none";
    }
    function crear_canal(num){
        document.getElementById("crear_canal").style.display="block";
        document.getElementById("categoria_hidden").value=num;
    }
    function cerrar_canal(){
        document.getElementById("crear_canal").style.display="none";
    }
    function crear_link(){
        document.getElementById("crear_link").style.display="block";
    }
    function cerrar_link(){
        document.getElementById("crear_link").style.display="none";
    }

</script>
</html>