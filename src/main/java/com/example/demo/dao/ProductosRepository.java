package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Producto;
import com.example.demo.beans.Producto_Cantidad;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

}
