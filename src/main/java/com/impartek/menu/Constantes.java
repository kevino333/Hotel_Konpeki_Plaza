package com.impartek.menu;

public interface Constantes {

	String BD = "jsp_hotel_konpeki";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//Vistas
	String JSP_HABITACIONES ="habitaciones.jsp";
	String JSP_SERVICIOS="servicios.jsp";
	
	//listas de atributos
	String ATR_LISTA_HABITACIONES="atr_lista_habitaciones";
	
	//Tablas
	String TABLA_HABITACIONES="habitaciones";
		String HABITACIONES_ID="id";
		String HABITACIONES_NUMERO_HABITACION="numero_habitacion";
		String HABITACIONES_METROS_CUADRADOS="metros_cuadrados";
		String HABITACIONES_PRECIO="precio";
		String HABITACIONES_NUMERO_CAMAS="numero_camas";
		String HABITACIONES_EXTERIOR="exterior";
	
	//Procedimientos
	String SP_OBTENER_HABITACIONES="call sp_obtener_habitaciones";
	
}
