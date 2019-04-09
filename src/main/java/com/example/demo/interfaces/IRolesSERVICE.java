package com.example.demo.interfaces;

import java.util.Set;

import com.example.demo.beans.Role;
import com.example.demo.beans.User;

public interface IRolesSERVICE {
	
	public Set<User> listarusersbyrole(String role);

}
