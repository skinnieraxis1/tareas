<?php
include("conexion.php");
session_start();
$queryMiembros = "INSERT INTO miembros(dia_inicio, server) VALUES (curdate(), ".$_GET['server'].")"or
die("Error 14" . mysqli_error($link));
$resultMiembros = $link->query($queryMiembros);
$querySelectMiembros = "SELECT MAX(ID) AS ID FROM miembros"or
die("Error 15" . mysqli_error($link));
$resultSelectMiembros = $link->query($querySelectMiembros);
$intBuscarMiembros = mysqli_fetch_array($resultSelectMiembros);
$queryLogear = "INSERT INTO logear(miembros, usuario) VALUES ('".$intBuscarMiembros['ID']."', ".$_SESSION['usuario'].")"or
die("Error 16" . mysqli_error($link));
$resultLogear = $link->query($queryLogear);
header("location: http://localhost/Pagina_concor/home.php");
?>