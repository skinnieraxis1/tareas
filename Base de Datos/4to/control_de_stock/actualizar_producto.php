<?php
require('config/conexion.php');
if(isset($_POST['id'])){

    
    
    $sql="update producto set descripcion='".$_POST['descripcion']."', alta='".$_POST['alta']."' where id=".$_POST['id'].";";
    echo $sql;
    $result = $link->query($sql);
    if ($result==1){
    echo "<h3>Datos modificado correctamente!</h3><BR>";
    header('Location: http://localhost/cuarto/control_de_stock/stock.php');
    }
    else {
    echo "<h3>No es posible ingresar la informacion!</h3><BR>";
    }

}
if(isset($_GET['id'])){
    $sql="SELECT * FROM producto Where id=".$_GET['id'].";";
    $resultado = $link->query($sql);
    while($row = mysqli_fetch_array($resultado)){
        $descrip=$row['descripcion'];
        $alta=$row['alta'];
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
            <label for="descripcion">Descripción</label>
            <input type="text" name="descripcion" value="<?php echo $descrip; ?>">
        </div>
        <div class="form-group">
            <label for="alta">Alta</label>
            <input type="date" name="alta" value="<?php echo $alta;?>">
        </div>
        <button type="submit" name="id" value="<?php echo $_GET['id'];?>">Actualizar</button>
        <button type="reset">Vaciar</button>
    </form>
</body>
</html>


