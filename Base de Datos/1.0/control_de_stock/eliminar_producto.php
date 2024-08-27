<?php
if(isset($_POST['id'])){

    require('config/conexion.php');
    
    $sql="delete from producto where id='".$_POST['id']."';";
    $result = $link->query($sql);
    if ($result==1){
    echo "<h3>Datos modificado correctamente!</h3><BR>";
    }
    else {
    echo "<h3>No es posible ingresar la informacion!</h3><BR>";
    }

}
header('location: http://localhost/control_de_stock/stock.php');



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
        <button type="submit">Borrar</button>
        <button type="reset">Vaciar</button>
    </form>
</body>
</html>


