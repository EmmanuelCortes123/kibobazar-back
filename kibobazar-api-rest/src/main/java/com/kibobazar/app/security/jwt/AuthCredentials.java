package com.kibobazar.app.security.jwt;

public class AuthCredentials {
	private String correo;
	private String contraseña;
	
	
	public AuthCredentials() {
		
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
