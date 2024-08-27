<?php
if(isset($_POST['id'])){

    require('config/conexion.php');
    
    $sql="insert into producto (id,descripcion,alta) values(".$_POST['id'].",'".$_POST['descripcion']."','".$_POST['alta']."')";

    $result = $link->query($sql);
    if ($result==1){
    echo "<h3>Datos cargados correctamente!</h3><BR>";
    }
    else {
    echo "<h3>No es posible ingresar la informacion!</h3><BR>";
    }

}




?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nuevo Producto</title>
</head>
<body>
    <form action="" method="POST">
        <div class="form-group">
            <label for="id">Id</label>
            <input type="number" name="id">
        </div>
        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <input type="text" name="descripcion">
        </div>
        <div class="form-group">
            <label for="alta">Alta</label>
            <input type="date" name="alta">
        </div>
        <button type="submit">Crear</button>
        <button type="reset">Vaciar</button>
    </form>
</body>
</html>


