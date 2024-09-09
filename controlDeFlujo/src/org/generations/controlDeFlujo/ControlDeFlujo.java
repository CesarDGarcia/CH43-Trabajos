package org.generations.controlDeFlujo;
import java.util.Scanner;

public class ControlDeFlujo {		
	public static void main (String[] args) {
	/*
	 * Scanner. Método de java que me permite solicitar a un usuario cualquier tipo de dato 
	 * Tenemos que importar la clase Scanner en nuestra clase e instanciar un nuevo objeto de Scanner
	 * */
	
	try (// 1. Instanciar un objeto de tipo Scanner
	Scanner scanner = new Scanner(System.in)) {
		{
		
		// 2. Darle contexto al usuario
		System.out.println("Ingresa tu nombre");
		
		// 3. Guardar el objeto Scanner instanciado en una variable, según el tipo de datos que solicitamos
		String nombre = scanner.next();
		
		// 4. Imprimir el valor de la variable nombre
		System.out.println("Tu nombre es " + nombre);
		System.out.println("Ingresa tu edad:");
		
		int edad = scanner.nextInt();
		System.out.println("tu edad es de " + edad + " años");
		//por buena practica se debe cerrar el scanner
		scanner.close();
		
		/*
		 * Control de flujo. Sentencias condicionales.
		 * If, else, else if, switch, operador ternario 
		 * 
		 * */
		// if , else if, else
		if (edad >= 18) {
			if(edad < 60){
		
			System.out.println("Es un adulto");
		} else {
			System.out.println("Es un adulto mayor");
		
		}}
			else if ( edad >= 12) { 
			System.out.println("es un adolescente ");
		
		}else if (edad >= 3)
			System.out.println("es un niño");
		else {
		System.out.print("Es un bebé");
		}
	}
		}
}}
