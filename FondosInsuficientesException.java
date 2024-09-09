package org.generation.exceptions;

// Clase de tipo Exception para crear mi excepción que se usará en el método de retirar();
public class FondosInsuficientesException extends Exception {

	private static final long serialVersionUID = 1L; // ID 1L por default
	
	// 1. Atributo
	private double fondos;
	
	// 2. Constructor
	public FondosInsuficientesException (double fondos) {
		this.fondos = fondos;
	}
	
	// 3. Getters y Setters
	public double getFondos() {
		return fondos;
	}
	
	public void setFondos(double fondos) {
		this.fondos = fondos;
	}
	
}
