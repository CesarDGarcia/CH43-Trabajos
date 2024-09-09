package org.generation.user.model;

// Creamos el objeto con atributos y metodos
public class User {
	// id, nombre, email, contraseña
	private Long id;
	private String nombre;
	private String email;
	private String password;
	
	// Constructor
	public User(Long id, String nombre, String email, String password) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}
	
	
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
