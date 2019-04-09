package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Producto;
import com.example.demo.dao.CategoriasRepository;
import com.example.demo.interfaces.ICategoriaSERVICE;

@Service
public class CategoriaSERVICE implements ICategoriaSERVICE {
	
	@Autowired
	CategoriasRepository categoriasRepository;

	@Override
	public List<Categoria> listarcategorias() {
		List<Categoria> categorias_salida = new ArrayList<Categoria>();
		Iterable<Categoria> categorias = categoriasRepository.findAll();
		for (Categoria categoria : categorias) {
			System.out.println(categoria);
			categorias_salida.add(categoria);
		}
		return categorias_salida;
	}

	@Override
	public void borrarcategoria(int idcategorias) {
		categoriasRepository.deleteById(idcategorias);
		
	}

	@Override
	public void addcategoria(Categoria categoria) {
		categoriasRepository.save(categoria);
		
	}

	@Override
	public Categoria buscar_id(int idcategorias) {
		
		Optional<Categoria> categoria = categoriasRepository.findById(idcategorias);
		if(categoria.isPresent()) {
			return categoria.get();
		}
		return null;
	}

	@Override
	//ESTO NO AÑADE NADA... SOLO IMPREME PRODUCTOS DE UNA CATEGORIA
	
	public void addcategoriaRARA(Categoria categoria) {
		Optional<Categoria> categorias = categoriasRepository.findById(1);
		if(categorias.isPresent()) {
			Categoria cataux = categorias.get();
			List<Producto> productos = cataux.getProductos();
			for (Producto producto : productos) {
				System.out.println(producto);
			}
		}
		
	}

	
	

}
