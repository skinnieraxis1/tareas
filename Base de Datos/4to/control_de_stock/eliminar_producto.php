<?php
if(isset($_GET['id'])){

    require('config/conexion.php');
    
    $sql="delete from producto where id=".$_GET['id'].";";
    echo $sql;
    $result = $link->query($sql);
    if ($result==1){
    echo "<h3>Datos modificado correctamente!</h3><BR>";
    }
    else {
    echo "<h3>No es posible ingresar la informacion!</h3><BR>";
    }
    header('Location: http://localhost/cuarto/control_de_stock/stock.php');
}




?>


