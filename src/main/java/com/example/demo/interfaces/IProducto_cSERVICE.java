package com.example.demo.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Producto;
import com.example.demo.dao.ProductosRepository;

public interface IProducto_cSERVICE {
	
	
	
	public ArrayList listarventas();
	public Producto buscar_id(int id_producto);
	

}
