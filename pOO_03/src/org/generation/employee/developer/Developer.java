package org.generation.employee.developer;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

public class Developer extends Employee implements Trabajador{
	// Atributos: nivel(junior, middle, senior). tipoLenguaje (java, js, python, SQL, cobol
	private NivelDominio nivel;
	private LenguajesProgramacion  tipoLenguaje;
	
	public Developer(String nombre, String apellido, int edad, float salario, String puesto, NivelDominio nivel,
			LenguajesProgramacion tipolenguaje) {
		super(nombre, apellido, edad, salario, puesto);
		this.nivel = nivel;
		this.tipoLenguaje = tipolenguaje;
	}
	
	
	// Metodos propios de Developer
	@Override
	public void trabajar() {
		System.out.println("El " + this.getPuesto() + " que trabaja con" + this.tipoLenguaje);
	}

	// Getters y Setters
	public NivelDominio getNivel() {
		return nivel;
	}


	public void setNivel(NivelDominio nivel) {
		this.nivel = nivel;
	}


	public LenguajesProgramacion getTipoLenguaje() {
		return tipoLenguaje;
	}


	public void setTipoLenguaje(LenguajesProgramacion tipoLenguaje) {
		this.tipoLenguaje = tipoLenguaje;
	}


	@Override
	public String toString() {
		return "Developer = Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Edad: " + getEdad() + ", Salario: $" + getSalario() + ", Puesto: " + getPuesto() + ", Nivel: " + nivel 	+ ", Tipo de Lenguaje: " + tipoLenguaje;
	
	}
	
	
	
	
	

}
