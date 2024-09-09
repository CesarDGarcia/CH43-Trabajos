package org.generation.figuras;

//Para aplicar abstracción desde una clase, la definimos como clase abstract y podemos implementar esta clase en las subclases.

public abstract class Figura {
	// Método abstracto, sin cuerpo (solamente firma), ya que el cuerpo se definirá en las diferentes subclases (abtracción y polimorfismo).
	public abstract double calcularArea();
}