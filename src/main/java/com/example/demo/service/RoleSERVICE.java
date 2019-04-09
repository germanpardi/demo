package com.example.demo.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Role;
import com.example.demo.beans.User;
import com.example.demo.dao.RoleRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.interfaces.IRolesSERVICE;

@Service
public class RoleSERVICE implements IRolesSERVICE {
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Set<User> listarusersbyrole(String role) {
		Role role_aux = roleRepository.findByRole(role);
		Set<User> users = role_aux.getUsuarios();
		return users;
	}
}


