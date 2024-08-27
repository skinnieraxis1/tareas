
document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.fixed-action-btn');
    var instances = M.FloatingActionButton.init(elems, {
        direction: 'left',
        hoverEnabled: false
    });
});
function ponerCategorias(num){
    var x=document.getElementById("zonaCategorias");
    x.write('<'+'?php $a=' + num + ';' + 
            'if($a!=0){' +
                '$queryCategoria="' +
                'SELECT ca.ID, ca.nombre' +
                'FROM categoria as ca' +
                'JOIN servidor as s ON ca.servidor = s.ID' +
                'JOIN configuraciones_server as c ON s.ID = c.servidor' +
                'JOIN miembros as m ON c.ID = m.server' +
                'JOIN logear as l ON m.ID = l.miembros' +
                'JOIN usuarios as u ON l.usuario = u.ID' +
                'WHERE u.ID = ".$_SESSION[´usuario´]." and s.ID = ".$a."' +
                '";' +
                '$resultCategoria=$link->query($queryCategoria);' +
                'while ($arrayCategoria=mysqli_fetch_array($resultCategoria)){' +
                    'echo ´<div class="fixed-action-btn">´;' +
                    'echo ´<a class="btn-floating btn-large red">´;' +
                    'echo ´<li class="large material-icons">´.$arrayCategoria["nombre"].´</li>´;' +
                    'echo ´</a>´;' +     
                    '$queryCanal="' +
                        'SELECT can.ID, can.nombre, can.tipo_de_canal' +
                        'FROM canal as can' +
                        'JOIN categoria as ca ON can.categoria = ca.ID' +
                        'JOIN servidor as s ON ca.servidor = s.ID' +
                        'JOIN configuraciones_server as c ON s.ID = c.servidor' +
                        'JOIN miembros as m ON c.ID = m.server' +
                        'JOIN logear as l ON m.ID = l.miembros' +
                        'JOIN usuarios as u ON l.usuario = u.ID' +
                        'WHERE u.ID = ".$_SESSION[´usuario´]." and ca.ID = ".$arrayCategoria["ID"]."' +
                        '";' +
                    '$resultCanal=$link->query($queryCanal);' +
                    'echo ´<ul>´;' +
                    'while ($arrayCanal=mysqli_fetch_array($resultCanal)){  ' +  
                        'echo ´<li class=´.$arrayCanal["tipo_de_canal"].´><a class="btn-floating red">´.$arrayCanal["nombre"].´</a></li>´;' +
                    '}' + 
                    'echo ´</ul>´;' +
                    'echo ´</div>´;' +
                '}'  +
            '}' +
            '?>')
    x.innerHTML = a;
}