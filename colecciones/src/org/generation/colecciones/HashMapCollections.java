package org.generation.colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollections {
	public static void main(String[] args) {
		/*--- HashMap ---*/
		// Almacena elementos en pares (key/value) y se puede acceder a ellos mediante index. No ordenado y no permite datos duplicados
			HashMap<Long, String> estudiantes = new HashMap<Long, String>();
			// Agregar elementos en pares (.put())
			estudiantes.put(20240001L, "Daniel Maldonado");
			estudiantes.put(20240002L, "Josue Hernandez");
			estudiantes.put(20240003L, "Emily Memije");
			estudiantes.put(20240004L, "Cintia Odeth");
			estudiantes.put(20240004L, "Joel Herrera");
			estudiantes.put(20240005L, "Cesar Diaz");
			
			System.out.println(estudiantes);
			
			// Recorrer un HashMap, vamos a implementar un método de la interfaz Map que se llama Entry (Map.Entry<>) dentro de un ciclo forEach
			for (Map.Entry<Long, String> estudiante : estudiantes.entrySet()) {
				System.out.println("Matricula " + estudiante.getKey() + ", Estudiante: " + estudiante.getValue());
			}
			
	}

}
