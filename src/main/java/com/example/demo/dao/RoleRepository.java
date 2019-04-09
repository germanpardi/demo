package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	Role findByRole(String role);

}
