<%@page import="com.impartek.menu.Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<Habitacion> listaHabitaciones = new ArrayList<>();

if (request.getAttribute(Constantes.ATR_LISTA_HABITACIONES) != null) {
	listaHabitaciones = (List<Habitacion>) request.getAttribute((Constantes.ATR_LISTA_HABITACIONES));

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Habitacioes</title>
<link rel="stylesheet" href="styles/style.css">
<link rel="stylesheet" href="styles/styleContenido.css">
</head>
<body>

	<%@include file="includes/cabecera.jsp"%>
	<%@include file="includes/menu.jsp"%>

	<main>
		<section>
			<h2>Habitaciones</h2>
			<section class="cuadricula" id="descripcionHabitaciones">
			Estas son las habitaciones actualmente disponibles.
			</section>
		</section>


		<section class="cuadricula">
			<table>
				<thead>
					<th>id</th>
					<th>Numero de habitacion</th>
					<th>Metros cuadrados</th>
					<th>Precio</th>
					<th>Numero de camas</th>
					<th>Tiene exterior</th>
				</thead>
				<tbody>
					<%
					for (Habitacion i : listaHabitaciones) {
					%>
					<tr>
						<td id="tableId"><%=i.getId()%></td>
						<td id="tableNumHab"><%=i.getNumero_habitacion()%></td>
						<td id="tableMetros"><%=i.getMetros_cuadrados()%></td>
						<td id="tablePrecio"><%=i.getPrecio()%></td>
						<td id=tableCamas><%=i.getNumero_camas()%></td>
						<td id="tableExterior"><%=i.isExterior()  ? "sí" : "no" %></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</section>
	</main>

	<%@include file="includes/pie.jsp"%>

</body>
</html>