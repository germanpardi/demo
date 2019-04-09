package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.hibernate.annotations.Tables;


public class Producto_Cantidad extends Producto {
	
	
	protected int cantidad;
	
	protected double importe;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double totalPrecio(int cantidad, double precio) {
		return cantidad*precio;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}
