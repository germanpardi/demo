package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.beans.Categoria;
import com.example.demo.beans.Usuario;
import com.example.demo.dao.UsuariosRepository;

import com.example.demo.dto.Usuario_dto;
import com.example.demo.interfaces.IUsuarioSERVICE;


@Service
public class UsuarioSERVICE implements IUsuarioSERVICE {
	
	@Autowired
	UsuariosRepository usuariosRepository;

	@Override
	public List<Usuario_dto> listarusuarios() {
		List<Usuario_dto> usuarios_salida_dto = new ArrayList<Usuario_dto>();
		Iterable<Usuario> usuarios = usuariosRepository.findAll();
		for (Usuario usuario : usuarios) {
			Usuario_dto usuario_dto = new Usuario_dto(usuario.getId_usuario(),usuario.getPassword(), usuario.getEmail());
			usuarios_salida_dto.add(usuario_dto);
		}
		return usuarios_salida_dto;
	}

	@Override
	public void borrarusuario(String id_usuario) {
		// TODO Auto-generated method stub
		usuariosRepository.deleteById(id_usuario);
	}

	@Override
	public void addusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuariosRepository.save(usuario);

	}

	@Override
	public Usuario_dto buscar_id(String id_usuario) {
		Optional<Usuario> usuario = usuariosRepository.findById(id_usuario);
		if(usuario.isPresent()) {
			Usuario uaux = usuario.get();
			Usuario_dto usuario_dto = new Usuario_dto(uaux.getId_usuario(),uaux.getPassword(),uaux.getEmail());
			return usuario_dto;
		}
		return null;
	}


	

}
