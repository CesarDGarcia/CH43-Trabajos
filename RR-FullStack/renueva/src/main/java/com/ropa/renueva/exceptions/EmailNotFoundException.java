package com.ropa.renueva.exceptions;

public class EmailNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// Método constructor con un mensaje en super
	public EmailNotFoundException(String correo) {
	    super("El usuario con el email " + correo + " no existe");
	}
	
	

}
