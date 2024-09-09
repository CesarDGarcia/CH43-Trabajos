package calculator;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	//Vmoas a llamar un objeto de tipo calculado, pero modificador privado
	private Calculadora calculadoraTest;
	//Anotacion le indica a Junit que este metodo se ejecutara antes que todo lo demas

	@BeforeEach
	void setUp() {
		calculadoraTest = new Calculadora();
	}
	
	//no retornan, en el body llevan datos de entrada datos de salida y afirmaciones
	@Test
	@DisplayName("Sumando dos enteros")
	void sumarTest() {
		assertEquals(10, calculadoraTest.sumar(5, 5));
	}
	
	@Test
	@DisplayName("Restando numeros enteros")
	void restartTest() {
		assertEquals(5, calculadoraTest.restar(10, 5));
	}
	
	@Test
	@DisplayName("Multiplica enteros")
	void multiplicarTest() {
		assertEquals(50, calculadoraTest.multiplicar(10, 5));
	}
	
	@Test
	@DisplayName("Divide numeros enteros")
	void dividirTest() {
		assertEquals(25, calculadoraTest.dividir(100, 4));
	}
	
	
	
	
	
}
