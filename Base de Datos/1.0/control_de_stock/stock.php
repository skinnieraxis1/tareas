<?php
require('config/conexion.php');

$sql="SELECT * FROM producto";

$resultado = $link->query($sql);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stock</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
    <a class="btn btn-info" href="http://localhost/control_de_stock/nuevo_producto.php">+</a>
    <table border="1" class="table">
        <tr>
            <th>Id</th>
            <th>Descricion</th>
            <th>Alta</th>
            <th></th>
        </tr>


    <?php
    while($row = mysqli_fetch_array($resultado))
    {
        echo "<tr>";
        echo "<td>".$row['id']."</td>";
        echo "<td>".$row['descripcion']."</td>";
        echo "<td>".$row['alta']."</td>";
        echo "<td><a href='eliminar_producto.php?id=".$row['id']."' class='btn btn-danger' >Eliminar</a></td>";
        echo "<td><a href='actualizar_producto.php?id=".$row['id']."' class='btn btn-warning' >Modificar</a></td>";
        echo "</tr> ";
    }

    ?>

    </table>

    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true" style="width: 1000px; height: 600px; margin-left: 20%;">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div class="carousel-inner">
        <div class="carousel-item active">
        <img src="assets/image/sv_1.jpg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
        <img src="assets/image/sv_2.jpg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
        <img src="assets/image/sv_3.jpg" class="d-block w-100" alt="...">
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
    </div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</html>