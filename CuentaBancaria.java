package org.generation.banco;

import org.generation.exceptions.FondosInsuficientesException;

// Aquí vive mi objeto con atributos y métodos
public class CuentaBancaria {
	// 1. Atributos con modificador de acceso (encapsulamiento)
	private Long idCuenta;
	private String propietario;
	private double saldo;
		
	// 2. Método constructor que solo recibe idCuenta y propietario como parámetros, ya que el saldo inicial es de 0
	public CuentaBancaria(Long idCuenta, String propietario) {
		this.idCuenta = idCuenta;
		this.propietario = propietario;
	}
	
	// 3. Métodos específicos para la clase: ingresar dinero, consultar saldo, retirar dinero, 

	// -- Ingresar dinero
	public void depositar(double monto) {
		saldo += monto; // También podemos usarlo como saldo = saldo + monto;
	}
	
	// -- Consultar saldo
	public void consultar() {
		System.out.println("Tu saldo es de $" + saldo);
	}
	
	// -- Retirar dineros (implementar FondosInsuficientesException como excepción)
	// Le digo al método que implemente la exception utilizando la palabra reservada throws
	public void retirar(double monto) throws FondosInsuficientesException {
		if (monto <= saldo) {
			saldo -= monto;
		} else {
			throw new FondosInsuficientesException(saldo);
		}
	}

	
	// 4. Getters y Setters
	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// toString
	@Override
	public String toString() {
		return "CuentaBancaria = idCuenta: " + idCuenta + ", propietario: " + propietario + ", saldo: " + saldo;
	}
	
}
