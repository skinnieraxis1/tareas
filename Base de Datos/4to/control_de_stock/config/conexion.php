<?php
    $myhost="localhost";
    $myuser="root";
    $mypassw="";
    $mybd="control_de_stock";
    $link = mysqli_connect($myhost, $myuser, $mypassw, $mybd)
    or die("Error " .mysqli_error($link));
?>