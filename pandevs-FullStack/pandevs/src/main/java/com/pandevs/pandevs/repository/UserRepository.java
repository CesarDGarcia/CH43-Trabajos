package com.pandevs.pandevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pandevs.pandevs.model.User;

// Esta interfaz hereda los metodos de JpaRepository y toma dos parametros, el objeto del model y  el tipo de dato de Pk 
public interface UserRepository extends JpaRepository<User, Long>{

	// Mas adelante aqui podremos realizar consultas (query): JPQL
	@Query("SELECT u FROM User u WHERE u.email = ?1 ")
	User findByEmail(String email);
}
