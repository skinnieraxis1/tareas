<?php
    echo 'hello world';

    if (iseet($_GET['aux'])) {
        $var=$_GET['aux'];
    }else{
        $var=0;
    }

    if ($var>5) {
        $m = "var es mayor a 5";
    }else if ($var<5){
        $m = "var es menor a 5";
    }else{
        $m = "var es igual a 5";
    echo '<!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Pagina Lautaro</title>
            <link rel="stylesheet" href="styles/style1.css" type="text/css">
        </head>
        <body>
            <div id="introduccion">
                <h1 id="titulo">YO</h1>
            </div>
            <div id="gustos">
                <h2 id="titulosGustos">Gustos</h2>
                <div class="juegos">
                    <h3 id="tituloPilar">VideoJuegos</h3>
                    <p>Una de las principales cosas que siempre me han gustado son <br> los Videojuegos, es un pilar de mi dia a dia y la razon por la <br> que empeze con la programacion</p>
                </div>
                <div class="musica">
                    <h3 id="tituloPilar">Musica</h3>
                    <p>Otro factor que siento yo pilar es la musica todo el tiempo <br> suelo estar escuchando musica, tanto de videojuegos como en el <br> dia a dia </p>
                </div>
                <div class="arte">
                    <h3 id="tituloPilar" style="text-shadow: -2px 0 black, 0 2px black, 2px 0 black, 0 -2px black;">"Arte"</h3>
                    <p class="parrafoArte">Las cosas artisticas suelen ser de mi agrado, tocar un instrumento, <br> leer o dibujar</p>
                </div>
                <div class="computacion">
                    <h3 id="tituloPilar">La Computadora</h3>
                    <p>Este es un pilar bastante extenso pero lo resumo en las cosas <br> de la computadora entre el internet, los componentes, la programacion, <br> los programas en el, todo eso me rodea dia a dia <br> y es de lo que me gustaria llegar a vivir</p>
                </div>
            </div>
        </body>
        <footer>
            <p>';
            echo $m .'</p>
            <p id="pie">Aca agregare datos mas "formales"<br>
            Nombre: Lautaro <br>
            Apellido: Feruglio <br>
            Nacimiento:27/04/2006 <br>
            Hermanos: 2 una hermana y un hermano <br>
            Animales: 1 perra </p>
            <form action="" method="post">
                <input type="text" name="aux" id="aux">
                <button type="submit">Enviar</button>
            </form>
        </footer>
        </html>';
?>