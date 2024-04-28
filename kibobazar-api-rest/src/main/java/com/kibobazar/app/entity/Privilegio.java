package com.kibobazar.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "privilegios")
public class Privilegio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPrivilegios")
    private Long id;

    @Column(name = "privilegios", nullable = false, length = 20)
    private String privilegios;

	// Creando constructor vacio
    public Privilegio(){
    	
    }
    
    
    // Creando getters y setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(String privilegios) {
		this.privilegios = privilegios;
	}

	// Creando metodo toString con StringBuilder
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Privilegios [idPrivilegios=");
		builder.append(id);
		builder.append(", privilegios=");
		builder.append(privilegios);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
