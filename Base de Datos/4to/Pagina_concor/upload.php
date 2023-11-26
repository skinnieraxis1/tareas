<?php
$target_dir = "./assets/img";
$target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
$uploadOk = 1;
$imageFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
// Check if image file is a actual image or fake image
if(isset($_POST["submit"])) {
  $check = getimagesize($_FILES["fileToUpload"]["tmp_name"]);
  if($check !== false) {
    echo "File is an image - " . $check["mime"] . ".";
    $uploadOk = 1;
  } else {
    echo "File is not an image.";
    $uploadOk = 0;
  }
  $querySelect = "SELECT MAX(ID) AS ID FROM ".$_POST["nombre_tabla"].""or
  die("Error 15" . mysqli_error($link));
  $resultSelectMiembros = $link->query($querySelectMiembros);
  $intBuscarMiembros = mysqli_fetch_array($resultSelectMiembros);
  $query = "UPDATE ".$_POST["nombre_tabla"]." SET IMAGEN='".$_FILES["fileToUpload"]["tmp_name"]."' WHERE ID=".$intBuscarMiembros["ID"]."";
  $result=$link->query($query)
}
?>