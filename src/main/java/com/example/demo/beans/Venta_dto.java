package com.example.demo.beans;

public class Venta_dto {
	
	private String producto;
	private int cantidad;
	private Double importe;
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Venta_dto(String producto, int cantidad, Double importe) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.importe = importe;
	}
	public Venta_dto() {
		super();
	}

	
	
}
