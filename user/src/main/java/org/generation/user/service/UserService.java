package org.generation.user.service;

import java.util.ArrayList;

import org.generation.user.model.User;
import org.springframework.stereotype.Service;

// A toda clase service le tengo que agregar una anotacion que actuara como servicio
@Service
public class UserService {
	// Vamos a instanciar un ArrayList de tipo User para simular una base de datos.
	
	public final ArrayList<User> usuarios = new ArrayList<User>();
	
	public UserService() {
		// Instanciar objetos
		
	}
}
