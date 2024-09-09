package org.generation.fizzBuzz;

public class FizzBuzz {
	
	 public void imprimir() {
        for (int i=1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


//Clase Main
public static void main(String[] args) {
    // Crear una instancia de FizzBuzz
	FizzBuzz fizzBuzz= new FizzBuzz();
    
    // Llamar al método imprimir para mostrar los resultados
    fizzBuzz.imprimir();
}
}
