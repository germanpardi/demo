package com.example.demo.dto;


import java.util.List;



public class Usuario_dto {
	
	private String id_usuario;
	private String password;
	private String email;
	
	

	public Usuario_dto(String id_usuario, String password, String email) {
		super();
		this.id_usuario = id_usuario;
		this.password = password;
		this.email = email;
		
	
	}

	

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		
		this.id_usuario= id_usuario;
		
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		this.password= password;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
			this.email = email;	
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", password=" + password + ", email=" + email + "]";
	}
	
	

}
