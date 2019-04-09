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
@Table(name="roles")
public class Role {
	
	@Id
	@Column(name="role_id")
	private int role_id;

	@Column(name="role")
	private String role;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role=" + role + "]";
	}
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_role", joinColumns=@JoinColumn(name="role_id"), inverseJoinColumns=@JoinColumn(name="user_id"))
	private Set<User> usuarios;

	public Set<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<User> usuarios) {
		this.usuarios = usuarios;
	}

}
