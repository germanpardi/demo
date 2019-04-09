package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Cuenta;

public interface ICuentaSERVICE {
	
	public List listarmovimientos(Cuenta cuenta, int num_cuenta);
	public Cuenta buscarnum_cuenta(int num_cuenta);
	public void addcuenta(Cuenta cuenta);
	public void borrarcuenta(int num_cuenta);
	public List listarcuenta();
	public Cuenta buscarportitular(String titular);
}
