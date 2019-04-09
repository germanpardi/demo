package com.example.demo.controller;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Role;
import com.example.demo.beans.User;
import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.IRolesSERVICE;
import com.example.demo.interfaces.IUserSERVICE;



@Controller
//@RequestMapping("/clientes")
public class Controlador {
	
	@Autowired
	ICategoriaSERVICE catservice;
	
	@Autowired
	IUserSERVICE userSERVICE;
	
	@Autowired
	IRolesSERVICE roleSERVICE;
	
	@RequestMapping("/")
	public String inicio(HttpServletRequest request) {
		request.setAttribute("categorias", catservice.listarcategorias());
		return "index";
	}
	
	@RequestMapping("/deletecategoria")
	public String inicio2(HttpServletRequest request) {
		int idcategorias = Integer.parseInt(request.getParameter("idcategorias"));
		catservice.borrarcategoria(idcategorias);
		return inicio(request);
	}
	@RequestMapping("/altacategoria")
	public String altacategoria() {
		return "altacategoria";
	}
	@RequestMapping("/grabar_categoria")
	public String grabar_categoria(HttpServletRequest request, @ModelAttribute Categoria categoria) {
		System.out.println(categoria);
		if(catservice.buscar_id(categoria.getIdcategorias())==null) {
			catservice.addcategoriaRARA(categoria);
			request.setAttribute("mensaje", "Alta realizada correctamente");
			categoria.setIdcategorias(0);
			categoria.setDescripcion("");
			
		}else {
			request.setAttribute("mensaje", "La categoria ya existe");
		}
		
		return "altacategoria";
	}
	
	@RequestMapping("/verroles")
	public String verroles() {
		Set<Role> roles = userSERVICE.listarrolesbyuser(1);
		Iterator iter = roles.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		return "altacategoria";
	}
	
	@RequestMapping("/verusuarios")
	public String verusuarios() {
		Set<User> users = roleSERVICE.listarusersbyrole("ADMIN");
		Iterator iter = users.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		return "altacategoria";
	}
	
}
