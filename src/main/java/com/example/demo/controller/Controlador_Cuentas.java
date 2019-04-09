package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Categoria;
import com.example.demo.beans.Cuenta;
import com.example.demo.interfaces.ICategoriaSERVICE;
import com.example.demo.interfaces.ICuentaSERVICE;

@Controller
@RequestMapping("/cuentas")
public class Controlador_Cuentas {
	
	@Autowired
	ICuentaSERVICE cuservice;
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		request.setAttribute("cuentas", cuservice.listarcuenta());
		return "cuentas";
		
	}
	
	@RequestMapping("/movimientos")
	public String movimientos(HttpServletRequest request) {
		String titular = request.getParameter("titular");
		Cuenta cuenta = cuservice.buscarportitular(titular);
		request.setAttribute("movimientos", cuservice.listarmovimientos(cuenta , cuenta.getNum_cuenta()));
		return "movimientos";
	}
	

}
