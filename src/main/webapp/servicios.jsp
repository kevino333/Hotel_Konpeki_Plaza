<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servicios</title>
<link rel="stylesheet" href="styles/style.css">
<link rel="stylesheet" href="styles/styleContenido.css">
</head>
<body>

<%@include file="includes/cabecera.jsp"%>
	<%@include file="includes/menu.jsp"%>

	<main>
		<section class="cuadricula">

			<h2 class="subtituloCuadricula">Servicios</h2>
			
			<section class="cuadriculaContenido">
				<div>
					<img alt="" src="imagenes/konpekiExterior.webp" height="300px" width="auto">
				</div>
				<div class="descripcionServicios">
				<h2>Experimenta la perfección Arasaka</h2>
					Situado en el corazón del Distrito Corporativo de Night City, Konpeki Plaza 
					no es solo un hotel: es una declaración. Un templo de mármol, vidrio 
					reforzado y acero inteligente que desafía la gravedad y redefine el 
					significado de exclusividad.
				</div>
			</section>


			<section class="cuadriculaContenido">
				<div class="descripcionServicios">
					<h2>Skyline Lounge</h2>
					En lo más alto del Konpeki Plaza, flotando entre los zigurats corporativos 
					como un templo de cristal suspendido en el aire, Skyline Lounge es más que 
					un bar: es el santuario donde los poderosos se relajan y conspiran.
				</div>
				<div>
					<img alt="" src="imagenes/konpekiLobby.webp" height="auto" width="550px">
				</div>
			</section>


			<section class="cuadriculaContenido">
				<div>
					<img alt="" src="imagenes/konpekiBar.webp" height="auto" width="550px">
				</div>
				<div class="descripcionServicios">
				<h2>Lobby Imperial</h2>
					Bienvenido al vestíbulo más exclusivo de Night City, donde la primera impresión 
					no es cortesía, es una declaración de poder. Aquí no entras: eres procesado, 
					observado, y—si eres digno—admitido.
				</div>
			</section>


		</section>
	</main>

	<%@include file="includes/pie.jsp"%>

</body>
</html>