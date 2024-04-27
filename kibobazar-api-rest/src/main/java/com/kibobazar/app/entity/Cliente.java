package com.kibobazar.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clientes")
	private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "correo", nullable = false, length = 100, unique = true)
    private String correo;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "contraseña", nullable = false, length = 100)
    private String contraseña;
	
    private Boolean active;
    
    @ManyToOne
    private Privilegio privilegio;
    
	// Creando constructor vacio
    public Cliente(){
    	
    }

    // Creando getters y setters
    public Long getId() {
		return id;
	}

	public void setId(Long idClientes) {
		this.id = idClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Privilegio getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(Privilegio privilegio) {
		this.privilegio = privilegio;
	}

	//Creando toString con
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idClientes=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", correo=");
		builder.append(correo);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", contraseña=");
		builder.append(contraseña);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
    
	
	
	

}
