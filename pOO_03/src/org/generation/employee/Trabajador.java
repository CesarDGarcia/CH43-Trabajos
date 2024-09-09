package org.generation.employee;


//Las interfaces son contratos que las clases deben cumplir, lo que significa que cualquier clase que ´implemente´ una interfaz debe proporcionar una implementación para todos sus métodos

//Las interfaces se deben implementar en las clases donde utilizaremos los métodos usando la palabra implements seguido del nombre de la interfaz
public interface Trabajador {

	void trabajar();
	void calcularSalario();

}


