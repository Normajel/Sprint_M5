<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  	<meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta name="description" content="Empresa especializada en asesoría y consultoría en prevención de riesgos laborales.">
  	<meta name="keywords" content="prevención de riesgos, seguridad laboral, consultoría, capacitaciones">
  	<meta http-equiv="refresh" content="0; URL=${pageContext.request.contextPath}/inicio">
  	<title>Asesoría de Prevención de Riesgos</title>
  	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  	<link href="pagina.css" rel="stylesheet">
</head>
<body>

<%@ include file="navbar.jsp" %>

<div class="container mt-4">
  <h1>Asesoría de Prevención de Riesgos</h1>
  <p>
    En nuestra empresa nos especializamos en proporcionar servicios de asesoría y consultoría en prevención de riesgos laborales.
    Trabajamos para garantizar la seguridad y el bienestar del personal en las empresas, identificando riesgos potenciales y ofreciendo 
    soluciones efectivas.
  </p>
  <p>
    Nuestros servicios incluyen la realización de capacitaciones, evaluaciones de riesgos, elaboración de planes de prevención y mucho más.
  </p>

  <!-- Enlace para redirigir al servlet Inicio -->
  <a href="${pageContext.request.contextPath}/inicio" class="btn btn-primary">Ir a Inicio</a>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<%@ include file='footer.jsp'%>
</body>
</html>


