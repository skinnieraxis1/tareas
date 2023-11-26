<?php
include("conexion.php");
session_start();

/***********CANALES***********/

/*CATEGORIA*/

$queryCategoria = "INSERT INTO categoria(Cant_canales, nombre) VALUES ('2','normales')"or
die("Error " . mysqli_error($link));
$resultCategoria = $link->query($queryCategoria);

$queryBuscarCategoria = "SELECT ID FROM categoria WHERE max(ID)"or
die("Error " . mysqli_error($link));
$resultBuscarCategoria = $link->query($queryBuscarCategoria);

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
    
</body>
</html>