package org.generation.banco;

import org.generation.exceptions.FondosInsuficientesException;

public class Cajero {
	public static void main(String[] args) {
		// Instanciar un nuevo objeto
		CuentaBancaria cuentaDaniel = new CuentaBancaria(4152313597230869L, "Daniel Maldonado");

		System.out.println(cuentaDaniel);
		
		// Depositar dinero
		cuentaDaniel.depositar(500);
		
		// Consultar saldo
		cuentaDaniel.consultar();
		
		// Depositar más dinero
		cuentaDaniel.depositar(2500);
		
		// Consultar saldo nuevamente
		cuentaDaniel.consultar(); // Output: $3000
		
		// Retirar dineros, necesito manejar mi método con la exception (try-catch)
		try {
			// Método de retiro
			cuentaDaniel.retirar(2000);
		} catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insuficiente, No manito, no se pudo\u001B[0m");
		}
		
		// Consultar saldo nuevamente
		cuentaDaniel.consultar(); // Output: $1000
		
		// Retirar más dinero del que tenemos disponible para lanzar la excepción
		try {
			// Método de retiro
			cuentaDaniel.retirar(2000);
		} catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insuficiente. No manito, no se pudo\u001B[0m");
		}
		
		// Consultar saldo nuevamente
		cuentaDaniel.consultar(); // Output: $1000
		
		// Retirar 1000 para dejar en cero
		try {
			// Método de retiro
			cuentaDaniel.retirar(1000);
		} catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insuficiente. No manito, no se pudo\u001B[0m");
		}
		
		// Consultar saldo nuevamente
		cuentaDaniel.consultar(); // Output: $0
		
		// Retirar 1 pesito
		try {
			// Método de retiro
			cuentaDaniel.retirar(1);
		} catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insuficiente. No manito, no se pudo\u001B[0m");
		}
		
		// Consultar saldo nuevamente
		cuentaDaniel.consultar(); // Output: $1000
	}

}
