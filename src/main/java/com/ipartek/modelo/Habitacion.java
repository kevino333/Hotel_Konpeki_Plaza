package com.ipartek.modelo;

public class Habitacion {

	private int id;
	private int numero_habitacion;
	private double metros_cuadrados;
	private double precio;
	private int numero_camas;
	private boolean exterior;
	public Habitacion(int id, int numero_habitacion, double metros_cuadrados, double precio, int numero_camas,
			boolean exterior) {
		super();
		this.id = id;
		this.numero_habitacion = numero_habitacion;
		this.metros_cuadrados = metros_cuadrados;
		this.precio = precio;
		this.numero_camas = numero_camas;
		this.exterior = exterior;
	}
	public Habitacion() {
		super();
		this.id = 0;
		this.numero_habitacion = 0;
		this.metros_cuadrados = 0;
		this.precio = 0;
		this.numero_camas = 0;
		this.exterior = false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero_habitacion() {
		return numero_habitacion;
	}
	public void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
	}
	public double getMetros_cuadrados() {
		return metros_cuadrados;
	}
	public void setMetros_cuadrados(double metros_cuadrados) {
		this.metros_cuadrados = metros_cuadrados;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getNumero_camas() {
		return numero_camas;
	}
	public void setNumero_camas(int numero_camas) {
		this.numero_camas = numero_camas;
	}
	public boolean isExterior() {
		return exterior;
	}
	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}
	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero_habitacion=" + numero_habitacion + ", metros_cuadrados="
				+ metros_cuadrados + ", precio=" + precio + ", numero_camas=" + numero_camas + ", exterior=" + exterior
				+ "]";
	}
	
	
	
}
