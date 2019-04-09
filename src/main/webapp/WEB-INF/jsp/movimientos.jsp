<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="ISO-8859-1">
<title>Listado de movimientos</title>
</head>
<body>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css">



<div class="container">
<h2>Tabla de Movimientos</h2>
<table class="table table-striped">
	
  	<thead>
  	<tr>
      <th><h2>Id</h2></th>
      <th><h2>Numero de Cuenta</h2></th> 
      <th><h2>Tipo</h2></th>
      <th><h2>Importe</h2></th>
      <th><h2>Fecha</h2></th> 
      <th><h2>Descripcion</h2></th>
   </tr>
   
	<c:forEach var="mov" items="${movimientos}"> 
	<tr>
	  <td><h3>${mov.id_movimiento}</h3></td>
	  <td><h3>${mov.num_cuenta}</h3></td>
	  <td><h3>${mov.tipo}</h3></td>
	  <td><h3>${mov.importe}</h3></td>
	  <td><h3>${mov.fecha}</h3></td>
	  <td><h3>${mov.descripcion}</h3></td>
	  
	</tr>
	</c:forEach>
	
	</table><br>

</div>
</body>
</html>