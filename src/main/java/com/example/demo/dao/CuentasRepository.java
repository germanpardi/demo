package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Cuenta;

public interface CuentasRepository extends CrudRepository<Cuenta, Integer> {
	
	Cuenta findByTitular(String titular);

}
