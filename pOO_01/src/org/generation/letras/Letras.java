package org.generation.letras;

import java.util.Scanner;

//En letras vamos a crear un metodo que sirven para interactuar con el usuario

public class Letras {

	// Definir Scanner para recibir información del usuario
		Scanner scanner = new Scanner(System.in);
		
		// Método 1 para retornar el Scanner y utilizarlo las veces que quiera en cualquier clase
		public String leerEntrada() {
			return scanner.nextLine();	
			}
		
		// Método 2 para dar contexto al usuario
		public void contexto(String mensaje) {
			System.out.println(mensaje);
		}
}
