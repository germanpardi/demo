package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.beans.Categoria;

public interface CategoriasRepository extends CrudRepository<Categoria, Integer>{
	
	Categoria findByDescripcion(String descripcion); 
	@Query(value="select* from categorias where idcategorias > :idcategorias", nativeQuery=true)
	public Optional<List<Categoria>> findcategoriasmayor(@Param("idcategorias") int idcategorias);
	
}
