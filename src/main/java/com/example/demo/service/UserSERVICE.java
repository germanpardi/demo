package com.example.demo.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Role;
import com.example.demo.beans.User;
import com.example.demo.dao.UserRepository;
import com.example.demo.interfaces.IUserSERVICE;

@Service
public class UserSERVICE implements IUserSERVICE {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Set<Role> listarrolesbyuser(int user_id) {
		Optional<User> user = userRepository.findById(user_id);
		User user_aux = null;
		if(user.isPresent()) {
			user_aux = user.get();
		}
		Set<Role> roles = user_aux.getRoles(); 
		return roles;
	}

}
