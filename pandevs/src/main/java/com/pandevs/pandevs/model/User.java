package com.pandevs.pandevs.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Para convertir mi Java en una Entidad, necesito las anotaciones de JPA
/*
 * Anotaciones de JPA
 * - @Entity para indicar que dicha clase es una entidad OMR
 * - @Table(name = "tableName") para indicar el nombre que llevara mi tabla en 
 * - @Id para indicar una llave primaria (PK)
 * - @GeneratedValue nos permite crear una estrategia para la generacion de (PK)
 * - @Column me permite configurar cada atributo como una calumna de la tabla
 * 
 * */

@Entity
@Table(name = "user") // Es el nombre de la tabla de la base de datos
public class User {
	// id, username, email, password
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id;
	@Column(name = "username", length = 60, nullable = false, unique = true)
	private String username;
	@Column(name = "email", length = 120, nullable = false, unique = true)
	private String email;
	@Column(name = "password", length = 24, nullable = false, unique = false)
	private String password;
	
	// Definir 
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders;
	
	// Constructor vacio para JPA
	public User() {
		
	}
	
	// Constructor
	public User(Long id, String username, String email, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

	

}
