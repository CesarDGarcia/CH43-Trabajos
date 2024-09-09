package org.generation.figuras;

public class Circulo extends Figura {
	// Atributo
	private double radio;

	// Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	// Métodos propios o heredados (método abstracto)
	@Override
	public double calcularArea() {
		//Pi * r2
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	// Getters y setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}

