<?php
require('config/conexion.php');

if(isset($_POST['id'])){

    $sql="update from producto set descripcion='".$_POST['descripcion']."', alta='".$_POST['alta']."' where id=".$_POST['id'].";";
    $result = $link->query($sql);
    if ($result==1){
        echo "<h3>Datos modificado correctamente!</h3><BR>";
        header('location: http://localhost/control_de_stock/stock.php');
    }
    else {
        echo "<h3>No es posible ingresar la informacion!</h3><BR>";
    }

}
if(isset($_GET['id'])){

    $info_producto="SELECT * FROM producto WHERE id=". $_GET['id'].";";
    $result = $link->query($info_producto);
    while($row = mysqli_fetch_array($result))
    {
        $descripcion_v = $row['descripcion'];
        $alta_v = $row['alta'];
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
            <input type="number" name="id" value="<?= $_GET['id'];?>">
        </div>
        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <input type="text" name="descripcion" value="<?= $descripcion_v;?>">
        </div>
        <div class="form-group">
            <label for="alta">Alta</label>
            <input type="date" name="alta" value="<?= $alta_v;?>">
        </div>
        <button type="submit">Actualizar</button>
        <button type="reset">Vaciar</button>
    </form>
</body>
</html>


