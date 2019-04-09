package com.example.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="user_id")
	private int user_id;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="email")
	private String email;
	
	public int getUser_id() {
		return user_id;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", nombre=" + nombre + ", email=" + email + "]";
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
