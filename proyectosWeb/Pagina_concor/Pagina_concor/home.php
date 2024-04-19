<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Condor</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body>

<div class="header">
    <nav>
        <div class="nav-wrapper">
        <a href="home.php" class="brand-logo">Condor</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="help.php">Ayuda</a></li>
            <li><a href="./registrarse.php">Sign in</a></li>
            <li><a href="login.php">Log In</a></li>
        </ul>
        </div>
    </nav>
</div>
<div class="bodier">
    <h1 class="titulo">Bienvenido a</h1>
    <h1 class="titulo-concord">Condor</h1>
</div>
<div class="bajo-bodier">
    <h1>Habla con tus amigos</h1>
</div>
</body>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.sidenav');
        var instances = M.Sidenav.init(elems, options);
    });
</script>
</html>