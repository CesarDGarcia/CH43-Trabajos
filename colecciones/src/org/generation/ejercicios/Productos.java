package org.generation.ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Productos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Long, String> productos = new HashMap<Long, String>();
		System.out.println("Si desea salir ingrese 0000");
		long id = 0;
 		
		do {
		System.out.println("Escribe el ID");
		
		id = scanner.nextInt();
		
		System.out.println("Escribe el nombre del producto");
		
		String producto = scanner.next();
		
		productos.put(id,producto);
		} while (id != 0000);
		
		System.out.println(productos);

}
}