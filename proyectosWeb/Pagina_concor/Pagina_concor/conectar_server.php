<?php
    include("conexion.php");
    session_start();
    if(isset($_POST["server_activo"])){
        header("location: http://localhost/Pagina_concor/index.php");
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        echo '<form action="./index.php" method="post" name="prueba">';
        echo '<input type="hidden" name="server_activo" value='.$_GET['server'].' />';
        if(isset($_GET["canal"])){
            echo '<input type="hidden" name="canal_activo" value='.$_GET['canal'].' />';
        }
        echo '<input type="submit" value="Buscar" />';
        echo '</form>';
    ?>
</body>
<script>
    document.prueba.submit();
</script>
</html>