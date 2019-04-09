package com.example.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="cuentas")
public class Cuenta {
	
	@Id
	@Column(name="num_cuenta")
	private int num_cuenta;
	
	@Column(name="titular")
	private String titular;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="num_cuenta")
	private List<Movimiento> movimientos;

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	@Override
	public String toString() {
		return "Cuentas [num_cuenta=" + num_cuenta + ", titular=" + titular + "]";
	}
	
	
	

}
