<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="ISO-8859-1">
<title>Listado de cuentas</title>
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
<h2>Tabla de Cuentas</h2>
<table class="table table-striped">
	
  	<thead>
  	<tr>
      <th><h2>Cuentas</h2></th>
   </tr>
   
	<c:forEach var="cuenta" items="${cuentas}"> 
	<tr>
		
	  <td><h2><a  href="movimientos?titular=${cuenta.getTitular()}">${cuenta.titular}</a></h2></td>
	  
	</tr>
	</c:forEach>
	
	</table><br>

</div>
</body>
</html>