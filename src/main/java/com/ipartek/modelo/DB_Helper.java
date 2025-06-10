package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.impartek.menu.Constantes;

public class DB_Helper implements Constantes{

	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}

		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}

	public List<Habitacion> obtenerHabitaciones(Connection con) {
		List<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		try {
			CallableStatement cs = con.prepareCall(SP_OBTENER_HABITACIONES);
			cs.execute();
			
			ResultSet rs = cs.getResultSet();
			while (rs.next()) {
				Habitacion hab = new Habitacion();
				hab.setId(rs.getInt(HABITACIONES_ID));
				hab.setNumero_habitacion(rs.getInt(HABITACIONES_NUMERO_HABITACION));
				hab.setMetros_cuadrados(rs.getDouble(HABITACIONES_METROS_CUADRADOS));
				hab.setPrecio(rs.getDouble(HABITACIONES_PRECIO));
				hab.setNumero_camas(rs.getInt(HABITACIONES_NUMERO_CAMAS));
				hab.setExterior(rs.getBoolean(HABITACIONES_EXTERIOR));
				listaHabitaciones.add(hab);
			}
			return listaHabitaciones;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
