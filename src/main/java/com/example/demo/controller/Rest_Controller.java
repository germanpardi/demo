package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.beans.Posicion;
import com.example.demo.beans.Producto;
import com.example.demo.beans.Producto_Cantidad;
import com.example.demo.beans.Venta_dto;
import com.example.demo.dto.Localidad_DTO;
import com.example.demo.dto.Usuario_dto;
import com.example.demo.interfaces.ICuentaSERVICE;
import com.example.demo.interfaces.IPosicionSERVICE;
import com.example.demo.interfaces.IProducto_cSERVICE;
import com.example.demo.interfaces.IUsuarioSERVICE;
import com.example.demo.util.Alumno;

@Controller
public class Rest_Controller {
	
	@Autowired
	IProducto_cSERVICE proservice;
	
	@Autowired
	IPosicionSERVICE posservice;
	@Autowired
	IUsuarioSERVICE uservice;
	
	@RequestMapping("/devolveralumno/{nombrealumno}")
	public @ResponseBody ArrayList<Alumno> devolveralumnos(@PathVariable String nombrealumno){
		
		ArrayList<Alumno> alumnos = new ArrayList();
		ArrayList<Alumno> salida = new ArrayList();
		
		Alumno a1 = new Alumno("ana",1,10);
		Alumno a2 = new Alumno("pepe",2,11);
		Alumno a3= new Alumno("luis",2,12);
	
	alumnos.add(a1);
	alumnos.add(a2);
	alumnos.add(a3);
		for (Alumno alumno : alumnos) {
			if(alumno.getNombre().equals(nombrealumno)) {
				salida.add(alumno);
			}
		
		
		
		}
		return salida;

	}
	
	
	@RequestMapping("/ventas")
	public @ResponseBody ArrayList<Venta_dto> ventas(){
		
		ArrayList<Posicion> posiciones =  posservice.listarposiciones();
		ArrayList<Venta_dto> salida = new ArrayList<Venta_dto>();
		
		for (Posicion posicion : posiciones) {
			Venta_dto venta_dto	= new Venta_dto(proservice.buscar_id(posicion.getId_producto()).getDescripcion(),posicion.getCantidad(),proservice.buscar_id(posicion.getId_producto()).getPrecio()*posicion.getCantidad());
			salida.add(venta_dto);
		}
		
		
		return salida;
	}
	
	@RequestMapping("/localidades/{codigoprovincia}")
	public @ResponseBody ArrayList<Localidad_DTO> devolverlocalidades(@RequestParam("codigoprovincia") int codigoprovincia){
		
		ArrayList<Localidad_DTO> localidades = new ArrayList();
		System.out.println("devolver localidades"+codigoprovincia);
		if(codigoprovincia==28) {
			Localidad_DTO l1 = new Localidad_DTO(01,"pozuelo");
			Localidad_DTO l2 = new Localidad_DTO(02,"alcobendas");
			localidades.add(l1);
			localidades.add(l2);
		}
		if(codigoprovincia==29) {
			Localidad_DTO l1 = new Localidad_DTO(01,"marbella");
			Localidad_DTO l2 = new Localidad_DTO(02,"torremolinos");
			localidades.add(l1);
			localidades.add(l2);
		}
		
		return localidades;

	}
	
	@RequestMapping("/usuario")
	public String usuario() {
		
		return "usuario";
	}
	
	@RequestMapping("/password/{id_usuario}")
	public @ResponseBody String devolverpassword(@RequestParam("id_usuario") String id_usuario){              
		System.out.println(id_usuario);
		Usuario_dto usuario = uservice.buscar_id(id_usuario);
		System.out.println("ento pw");
		String password = usuario.getPassword();
		System.out.println("devolver usuario");
		
		return password;

	}
	@RequestMapping("/email/{id_usuario}")
	public @ResponseBody String devolveremail(@RequestParam("id_usuario") String id_usuario){              
		
		Usuario_dto usuario = uservice.buscar_id(id_usuario);
		if(usuario==null)System.out.println("no encontré una mierda");
		System.out.println("entro email");
		String email = usuario.getEmail();
		System.out.println("devolver usuario");
		
		return email;

	}
	
}