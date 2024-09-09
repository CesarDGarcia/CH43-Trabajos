package org.generation.datosyvariables;

public class Datos {

	public static void main(String[] args) {
		 //System.out.println("Hola, mundo");
		 



/*Tipos de datos
 * Numeros enteros
 * byte
 * short
 * int
 * long
 * numeros decimales
 * float
 * double
 * caracteres
 * char
 * boolean
 * cadena de texto
 * string */


/*Operdores aritemeticos
 * + suma
 * - resta
 * * multiplicacion
 / division
  * % residuo*/

/*Operadores de comparacion
 * == compara si un operando es igual a otro
 * === igualdad estricta
 * != compara si es diferente
 * < menor que
 * > mayor que
 * <= menor o igual que
 * >= mayor o igual que*/

/* Operadores lógicos
* && and
* || or
* ! not*/

   //Cine

	byte numeroDeSalas = 8;
	short asientosPorSala = 120;
	int entradasVendidas = 75;
	int totalAsientos = numeroDeSalas * asientosPorSala;
	long ingresosTotales = 35000;
	float precioEntrada = 99.99f;
	double precioCombo = 249.00;
	char letraAsiento = 'D';
	boolean estaAbierto = true;
	String nombreCine = "Michin";
	
	
	float IngresosEntradas = precioEntrada * entradasVendidas;
	System.out.println("Los ingresos por entrada son " + IngresosEntradas);
	
	int precioPalomitas = 120;
	int palomitasVendidas = 50;
	
	int ingresosPalomitas = precioPalomitas * palomitasVendidas;
	System.out.println("Los ingresos por palomitas son : " + ingresosPalomitas);
	
	int bebidas = 35;
	int bebidasVendidas = 70;
	
	int ingresosBebidas = bebidas * bebidasVendidas;
	System.out.println("Los ingresos por bebida son " + ingresosBebidas);
	
	float ingresosTotales1 = ingresosBebidas + ingresosPalomitas + IngresosEntradas;
	System.out.println("Los ingresos totales son " + ingresosTotales1);
	
	/*boolean descuento = true;
	// boolean doceAños = false;
	// boolean estudiante = true;
	
	if (descuento) {
		System.out.println( "Tu boleto queda " + precioEntrada * 0.80);
	} else {
		System.out.println(");
	}
	*/
	
	/*System.out.println("Cine " + nombreCine);
	System.out.println("Numero de salas:" + numeroDeSalas);
	System.out.println("Entradas vendidas: " + entradasVendidas);
	System.out.println("Total de Asientos: " + totalAsientos);
	System.out.println("Ingresos totales: " + ingresosTotales);
	System.out.println("Precio de la entrada: " + precioEntrada);
	System.out.println("Precio combo: " + precioCombo);
	System.out.println("Asiento: " + letraAsiento);
	System.out.println("¿Está abierto? " + estaAbierto);


	//Operadores aritmeticos
	
	int totalEntradas = asientosPorSala - entradasVendidas;
	
	System.out.println("Entradas restantes " + totalEntradas);
	
	//Casteo conversion de datos que no utiliza metodos
	
	//casteo a entero
	
	int precioEntradaEntero = (int ) precioEntrada;
	int precioComboEntero = (int ) precioCombo;
	
	System.out.println("Precio del boleto " + precioEntradaEntero);
	System.out.println("Precio del combo " + precioComboEntero);
	
	//Entero a long
	
	long entradasVendidasLong = (long ) entradasVendidas;
	
	System.out.println("Total de boletos " + 	entradasVendidasLong);
	
	//Entero a String
	
	String entradasVendidasString = Integer.toString(entradasVendidas);
	
	System.out.println("Boletos vendidos "  + entradasVendidasString);
	
	//String a un entero
	
	String entradasString = "75";
	int boletosVendidos = Integer.parseInt(entradasString);
	System.out.println("Boletos vendidos "  + boletosVendidos);
	
	//String a double
	
     String combo = "157.50";
     double comboDouble = Double.parseDouble(combo);
     
     System.out.println("otro precio " + comboDouble);*/
	
	
	}}