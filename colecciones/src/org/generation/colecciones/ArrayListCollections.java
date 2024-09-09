package org.generation.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListCollections {

	public static void main(String[] args) {
		/*--- Arrays ---*/
	String[] nombres = {"Chris","Abraham","Erick"};
	int[] edades = {28,23,23};
	
	//Imprimir Arrays. Debemos utilizar un metodo de Arrays que nos permite convertir arrays en strings
	System.out.println(Arrays.toString(nombres));
	System.out.println(Arrays.toString(edades));
	
	//Acceder a un unico elemento
	String nombre1 = nombres[2];
	System.out.println(nombre1); //Output: Erick

	//Longitud del array
	System.out.println(edades.length); //Output: 3
	
	// Mostrar todos los elementos del Array en formas de lista (forEach)
	for (String nombre : nombres) {
		System.out.println(nombre);
	}
	
	/*--- Array.List ----*/
	//Es un Array que puede cambiar de tamaño y permite elementos duplicado
	
	List<Double> salarios = new ArrayList<Double>(); //Wrapper class
	
	
	ArrayList<String> peliculas = new ArrayList<String>();
	
	//Agregar valores a los ArrayList (.add)
	salarios.add(50000.00);
	salarios.add(40000.00);
	salarios.add(20000.00);
	
	peliculas.add("La vida es bella");
	peliculas.add("Transformers");
	peliculas.add("Duro de matar 4");
	
	System.out.println(salarios);
	System.out.println(peliculas);
	
	
	//Acceder a elementos espesificos del ArrayList (.get(index))
	double salario2 = salarios.get(1);
	System.out.println(salario2);
	
	// Modificar un elemento del ArrayList (.set(index, newValue))
	
	salarios.set(2, 41692.18);
	System.out.println(salarios);
	
	// Agregar un nuevo elemento a salarios
	salarios.add(11244.33);
	
	//Acceder al ultimo elemento del ArrayList (.size()-1)
	Double ultimoElemento = salarios.get(salarios.size()-1);
	System.out.println(ultimoElemento);
	
	//Eliminar un elemento (.remove(value))
	salarios.remove(3);
	System.out.println(salarios); 
	
	
	//Recorrer un ArrayList y mostrar los elementos como lista (ForEach)
	
	for (double salario : salarios) {
		   System.out.println(salario);
		   }
	
	
	
}

}
