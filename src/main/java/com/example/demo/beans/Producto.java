package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@Column(name="id_producto")
	protected int id_producto;
	
	@Column(name="idcategorias")
	protected int idcategorias;
	
	@Column(name="descripcion")
	protected String descripcion;
	
	@Column(name="precio")
	protected double precio;
	
	@Column(name="stock")
	protected int stock;
	
	@ManyToOne
	@JoinColumn(name="idcategorias",insertable = false, updatable = false)
	protected Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", idcategorias=" + idcategorias + ", descripcion="
				+ descripcion + ", precio=" + precio + ", stock=" + stock + "]";
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
