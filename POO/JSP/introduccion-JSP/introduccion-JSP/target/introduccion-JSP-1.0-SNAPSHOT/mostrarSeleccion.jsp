<% 
    String nombre =  request.getParameter("nombreYApellido");
    String curso = request.getParameter("curso");
    String formaPago = request.getParameter("formaPago");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./assets/css/style.css">
    </head>
    <body>
            <h1 class="title">Tu selección</h1>
            <div class="cont">
                <h2>NOMBRE: <%= nombre %></h2>
            </div>
            <div class="cont">
                <h2>CURSO: <%= curso %></h2>
            </div>
            <div class="cont">
                <h2>FORMA DE PAGO: <%= formaPago %></h2>
            </div>
        </div>
    </body>
</html>
