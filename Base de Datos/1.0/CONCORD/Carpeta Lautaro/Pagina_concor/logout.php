<?php
session_start();
session_unset();
session_destroy();
header("location: http://localhost/Pagina_concor/index.php")
?>