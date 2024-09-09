package org.generation.livecoding3;

import java.util.Scanner;

public class Frutas<Euclides> {
    // Método para calcular el máximo común divisor (MCD) usando el algoritmo de 

        private static int gcd (int a, int b) {
        while (b != 0) {
            int temp= b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Crear un Scanner para leer la entrada del usuario
    	Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el número de mangos y naranjas
        System.out.print("Ingrese el número de mangos: ");
        int mangos= scanner.nextInt();
        
        System.out.print("Ingrese el número de naranjas: ");
        int naranjas= scanner.nextInt();
        
        // Calcular el número máximo de cajas posible 
        int maxCajas= gcd(mangos, naranjas);
        
        // Calcular el número de mangos y naranjas por caja
        int mangosPorCaja= mangos / maxCajas;
        int naranjasPorCaja= naranjas / maxCajas;
        
        // Imprimir los resultados
        System.out.println("Número de cajas: " + maxCajas);
        System.out.println("Número de mangos por caja: " + mangosPorCaja);
        System.out.println("Número de naranjas por caja: " + naranjasPorCaja);
        
        // Cerrar el Scanner
        scanner.close();
    }
}
