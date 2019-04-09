package com.example.demo.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="movimientos")
public class Movimiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_movimiento")
	private int id_movimiento;
	
	@Column(name="num_cuenta")
	private int num_cuenta;
	
	@Column(name="tipo")
	private char tipo;
	
	@Column(name="importe")
	private double importe;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="num_cuenta",insertable = false, updatable = false)
	private Cuenta cuenta;

	public int getId_movimiento() {
		return id_movimiento;
	}

	public void setId_movimiento(int id_movimiento) {
		this.id_movimiento = id_movimiento;
	}

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Movimiento [id_movimiento=" + id_movimiento + ", num_cuenta=" + num_cuenta + ", tipo=" + tipo
				+ ", importe=" + importe + ", fecha=" + fecha + ", descripcion=" + descripcion + ", cuenta=" + cuenta
				+ "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
}
