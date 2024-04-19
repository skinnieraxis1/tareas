<?php

include("conexion.php");
session_start();
if($_SESSION["usuario"]==""){
    header("location: http://localhost/kiosco/login.php");
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stock</title>
    <link rel="stylesheet" href="./assets/css/styleI.css">
</head>
<body>
    <div class="top">
        <h1 class="title">STOCK</h1>
        <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
    </div>

    <div class="cuerpo">
        <table class="table">
            <thead>
                <th scope="col">Nombre</th>
                <th scope="col">Codigo</th>
                <th scope="col">Cantidad</th>
                <th scope="col">Precio</th>
            </thead>
            <tbody>
            <?php
                $queryProduct="
                Select *
                from producto
                order by nombre asc
                ";
                $resultProduct=$link->query($queryProduct);
                while ($arrayProduct=mysqli_fetch_array($resultProduct)){   
                    echo '<tr class="table-light">';
                    echo '<td>'.$arrayProduct["nombre"].'</td>';
                    echo '<td>'.$arrayProduct["codigo"].'</td>';
                    echo '<td>'.$arrayProduct["cantidad"].'</td>';
                    echo '<td>'.$arrayProduct["precio"].'</td>';
                    echo '</tr>';
                } 

            ?>
            </tbody>
        </table>
    </div>
    
</body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<script src="./assets/js/script.js"></script>
</html>