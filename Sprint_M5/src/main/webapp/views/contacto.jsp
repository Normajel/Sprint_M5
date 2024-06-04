<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Contacto</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="pagina.css" rel="stylesheet">
    
    <style>
        /* Estilos para centrar el formulario */
        .centered-form {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Ajusta la altura según sea necesario */
        }
        .centered-form form {
            width: 50%; /* Ancho del formulario */
            max-width: 500px; /* Ancho máximo del formulario */
        }
    </style>
</head>
<body>

<%@ include file="navbar.jsp" %>

<div class="centered-form">
    <form action="Contacto" method="post">
        <h1 class="text-center">Formulario de Contacto</h1>
        <div class="form-group">
            <label for="nombre">Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" required>
        </div>
        <div class="form-group">
            <label for="email">Correo Electrónico:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="consulta">Consulta:</label>
            <textarea class="form-control" id="consulta" name="consulta" rows="5" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Enviar</button>
    </form>
</div>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<%@ include file='footer.jsp'%>
</body>
</html>

