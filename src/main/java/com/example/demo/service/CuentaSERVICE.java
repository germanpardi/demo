package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Cuenta;
import com.example.demo.beans.Movimiento;
import com.example.demo.beans.Producto;
import com.example.demo.dao.CategoriasRepository;
import com.example.demo.dao.CuentasRepository;
import com.example.demo.interfaces.ICuentaSERVICE;




@Service
public class CuentaSERVICE implements ICuentaSERVICE {
	@Autowired
	CuentasRepository cuentasRepository;
	
	
	@Override
	public List listarmovimientos(Cuenta cuenta, int num_cuenta) {
		Optional<Cuenta> cuentas = cuentasRepository.findById(num_cuenta);
		if(cuentas.isPresent()) {
			Cuenta cuaux = cuentas.get();
			List<Movimiento> movimientos = cuaux.getMovimientos();
			
			for (Movimiento movimiento : movimientos) {
				System.out.println(movimiento);
			}
			return movimientos;
		}
		
		return null;
	}

	@Override
	public Cuenta buscarnum_cuenta(int num_cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addcuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrarcuenta(int num_cuenta) {
		// TODO Auto-generated method stub

	}

	@Override
	public List listarcuenta() {
		Iterable<Cuenta> ocuentas = cuentasRepository.findAll();
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		for (Cuenta cuenta : ocuentas) {
			cuentas.add(cuenta);
		}
		return cuentas;
	}

	@Override
	public Cuenta buscarportitular(String titular) {
		Cuenta cuenta = cuentasRepository.findByTitular(titular);
		return cuenta;
	}

}
