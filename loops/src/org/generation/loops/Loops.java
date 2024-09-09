package org.generation.loops;
import java.util.Scanner;
import java.util.Random;

public class Loops {
	public static void main(String[] args) {
		// loops, bucles, ciclos, for, while, do-while
		// 1. Crear un programa que realice una cuenta de 1 a n, donde n es el número que el usuario proporciona
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número final");
        
        // Podemos inicializar múltiples variables del mismo tipo en una sola línea
        int numInicial, numFinal;
        numInicial = 1;
        numFinal = scanner.nextInt();
        
        while ( numInicial <= numFinal ) {
            System.out.println(numInicial);
            numInicial++;
        }
		
		// 2. Crear un programa que solicite al usuario un número entre 1 y 999, para determinar cuántos dígitos posee dicho número. El programa se ejecuta sin terminar el proceso hasta que el usuario ingrese el número 0
		int numero;
		
		do {
			System.out.println("Ingresa un número entre el 1 y 999 para conocer cuántos dígitos tiene. \nAl ingresar el 0 se termina el programa");
			numero = scanner.nextInt();
			
			if ( numero >= 100 && numero <= 999) {
				System.out.println("El número " + numero +  " posee 3 dígitos");
			} else if ( numero >= 10 && numero <= 99 ) {
				System.out.println("El número " + numero +  " posee 2 dígitos");
			} else if ( numero >= 1 && numero <= 9 ){
				System.out.println("El número " + numero +  " posee 1 dígito");
			} else {
				System.out.println("Tu número no entra en el rango");
			}
			
		} while( numero != 0 );
		System.out.println("\u001B[33mEl programa ha finalizado\u001B[37m");
		
		
		
		//3. Determinar un cliente ganador
		for (int contador = 1; contador <= 10; contador++) {
		    //Sentencia continue
		    if (contador == 5) {
		        System.out.println("Cliente ganador");
		        continue;
		    }
		    System.out.println("Cliente número " + contador);
		}
			
		//4. Crear un programa que nos permita calcular el area de un circulo
		
		System.out.println("Ingrese el radio de la circunferencia para calcular el area de un circulo");
		double radio = scanner.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area de la circunferencia " + area);
		*/
		
		//Reto 1. Sofia y las primas de seguros
		 Scanner scanner = new Scanner(System.in);
		/* System.out.println("Ingrese la edad del trabajador");
		 int edadTrabajador = scanner.nextInt();
		 System.out.println("Ingrese los ingresos del trabajador");
		 int ingresosMensuales = scanner.nextInt();
		 
		 
		 if( edadTrabajador > 70) {
			 System.out.println("Le corresponden $500 de prima mensual");
		 } else if( edadTrabajador >= 50 && edadTrabajador <= 70 && ingresosMensuales <= 300) {
			System.out.println("Le corresponden $400 de prima mensual"); 
		 } else if(edadTrabajador >= 30 && edadTrabajador <= 49) {
			 System.out.println("Le corresponden $250 de prima mensual");
		 }  
		 else{
			 System.out.println("Le corresponden $100 de prima mensual");
			 
		 }
		 */
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		//2.
		 
		  int digito;
		 do { 
			System.out.println("Escribe tu nombre de usuario");
			String nombreU = scanner.nextLine();
			System.out.println("Escribe tu contraseña");
			String contraseña = scanner.nextLine();
			
			System.out.println("1 Para consultar saldo \n"
					+ "2 Para ingresar dinero \n"
					+ "3 Para retirar dinero \n"
					+ "4 Para consultar sus últimos movimientos \n"
					+ "5 Convertir divisas"
					);
			System.out.println("Escribe un digito del 1 al 5 o \n"
					+ "0 para salir");
			digito = scanner.nextInt();
			if (digito == 1) {
				System.out.println("Su saldo es $100");
			} else if (digito == 2) {
				System.out.println("Ingrese su dinero");
			} else if(digito == 3 ){
				System.out.print("Ingrese cuanto va a retirar");
			} else if(digito == 4 ) {
				System.out.println("Sus ultimos movimientos son");
			} else if (digito == 5 ) {
				System.out.println("Cantidad a convertir");
			}
			
			
			 
		 } while (digito != 0);
		 
		 System.out.println("\u001B[33mEl programa ha finalizado\u001B[37m");
		
		 
		 
		 int numRandom;
		 
		 do {
			 Math.random()*10 +1;
			 
		 } while (numRandom != numDado );
		
		
		
		
		
		
	}

}
