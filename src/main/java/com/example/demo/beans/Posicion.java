package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pos_facturas")
public class Posicion {
	
	@Id
	@Column(name="id_factura")
	private int id_factura;
	
	
	@Column(name="pos_factura")
	private int pos_factura;
	
	@Column(name="id_producto")
	private int id_producto;
	
	@Column(name="cantidad")
	private int cantidad;
	
	
	@Override
	public String toString() {
		return "Pocision [id_factura=" + id_factura + ", pos_factura=" + pos_factura + ", id_producto=" + id_producto
				+ ", cantidad=" + cantidad + "]";
	}
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getPos_factura() {
		return pos_factura;
	}
	public void setPos_factura(int pos_factura) {
		this.pos_factura = pos_factura;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
