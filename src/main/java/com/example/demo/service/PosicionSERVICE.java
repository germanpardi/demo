package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Posicion;
import com.example.demo.beans.Producto;
import com.example.demo.dao.PosicionRepository;
import com.example.demo.dao.ProductosRepository;
import com.example.demo.interfaces.IPosicionSERVICE;

@Service
public class PosicionSERVICE implements IPosicionSERVICE{
	@Autowired
	PosicionRepository posicionRepository;
	
	@Override
	public ArrayList listarposiciones() {
		ArrayList<Posicion> ventas_salida = new ArrayList<Posicion>();
		Iterable<Posicion> posiciones = posicionRepository.findAll();
		
		for (Posicion p : posiciones) {
			
			ventas_salida.add(p);
		}
		return ventas_salida;
	}
	
	
	

}
