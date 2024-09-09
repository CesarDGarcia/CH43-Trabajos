package org.generation.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SortMethod {
	public static void main(String[] args) {
		/*--- Método Sort ---*/
		// Permite ordenar los elementos de una colección
		ArrayList<Integer> edades = new ArrayList<Integer>();
		
		edades.addAll(Arrays.asList(23,25,37,23,26,28,26));
		System.out.println(edades);
		
		// Ordenar elementos de Collections tomando como referencia la tabla ASCII
		Collections.sort(edades);
		Collections.reverse(edades);
		System.out.println(edades); // Muestra todos los elementos ordenados
		
		// ----- No podemos ordenar un HashSet. Si queremos mostrar los elementos ordenados de un Set utilizamos TreeSet, que nos muestra los elementos ordenados y omite los repetidos
				TreeSet<Integer> salarios = new TreeSet<Integer>(); 
				
				salarios.addAll(Arrays.asList(12000, 14000, 29000, 14000, 22000));
				
				System.out.println(salarios); // Output: [12000, 14000, 22000, 29000]
		
		
	
	
	
	
	
	}

}
