package org.generation.colecciones;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollections {
	public static void main(String[] args) {
		/*---- HashSet ---*/
		// En los HashSet cada elemento es unico, no existen duplicados
		HashSet<String> animales = new HashSet<String>();
		
		// Agregar elementos al HashSet
		animales.addAll(Arrays.asList("Perro","Gato","gato","Perro","Conejo","Mariposa", "Lechuza", "Rana" ));
		
		System.out.println(animales); // No muestra los elementos dupkicados
		
		// Conocer si un elemento existe dentro del Set (.contains(value))
		System.out.println(animales.contains("gato"));
		
		// Tamaño del Set (.size())
		System.out.println(animales.size()); // output 7 no cuenta los duplicados
		
		
		// Eliminar elementos (.remove("elemento"))
		animales.remove("Rana");
		System.out.println(animales);
		
		// Limpiar mi HashSet para dejarlo vacio (.clear())
		animales.clear();
		System.out.println(animales);
		
		
		
	}
}
