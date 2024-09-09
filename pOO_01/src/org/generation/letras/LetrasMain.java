package org.generation.letras;

public class LetrasMain {
	public static void main(String[] args) {
		Letras letras = new Letras();
		Contador contador = new Contador();
		
		// Aplicar metodos a cada instancia para utilizarlos
		letras.contexto("Escribe un texto para conocer el numero de vocales, consonantes, numeros, simbolos que posee");
		
		String texto = letras.leerEntrada(); // Este escaner lo usare en los metodos de contabilizacion y seria mejor guardarlo en una variable
		
		int totalVocales = contador.contarVocales(texto); // Esto lo utilizaré para mostrarle al usuario cuántas vocales tiene su texto y sería mejor guardarlo en una variable
		System.out.println("Hay " + totalVocales + " vocales");
		
		int totalConsonantes = contador.contarConsonantes(texto);
		letras.contexto("Hay " + totalConsonantes + " consonantes"); // Decidimos utilizar el método contexto que ya nos permite mostrar un mensaje desde el objeto letras
		
		int totalNumeros = contador.contarNumeros(texto);
		letras.contexto("Hay " + totalNumeros + " números");
		
		int totalSimbolos = contador.contarSimbolos(texto);
		letras.contexto("Hay " + totalSimbolos + " símbolos");
		
	}
}










