<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css">
	<div class="container">
		
		<form class= "form-signin" id="altacategoria" name="altacategoria" method="post" action= "grabar_categoria">
		<h2>Alta Categoria</h2>
		idcategorias:<input type="text"class="form-control" placeholder="idcategorias" id="idcategorias" name="idcategorias" value= "${categoria.idcategorias}"><br>
		descripcion:<input type="text" class="form-control" placeholder="descripcion" id="descripcion" name="descripcion" value= "${categoria.descripcion}"><br>
		<input type="submit" class="btn btn-lg btn-primary btn-block" name= "añadir" value="AÑADIR">


		</form>
		${mensaje}
	</div>
</body>
</html>