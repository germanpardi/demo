package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Producto;
import com.example.demo.beans.Producto_Cantidad;
import com.example.demo.dao.CuentasRepository;
import com.example.demo.dao.ProductosRepository;
import com.example.demo.interfaces.IProducto_cSERVICE;

@Service
public class ProductoSERVICE implements IProducto_cSERVICE {
	
	@Autowired
	ProductosRepository productosRepository;
	
	@Override
	public ArrayList listarventas() {
		ArrayList<Producto> ventas_salida = new ArrayList<Producto>();
		Iterable<Producto> ventas = productosRepository.findAll();
		for (Producto p : ventas) {
			
			ventas_salida.add(p);
		}
		return ventas_salida;
	}

	@Override
	public Producto buscar_id(int id_producto) {
		Optional<Producto> aux = productosRepository.findById(id_producto);
		if(aux.isPresent())return aux.get();
		return null;
	}

}
