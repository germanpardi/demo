package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Categoria;

public interface ICategoriaSERVICE {
	
	public List<Categoria> listarcategorias();
	public void borrarcategoria(int idcategorias);
	public void addcategoria(Categoria categoria);
	public Categoria buscar_id(int idcategorias);
	public void addcategoriaRARA(Categoria categoria);
}