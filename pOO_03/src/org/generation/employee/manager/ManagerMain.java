package org.generation.employee.manager;

public class ManagerMain {
	
	public static void main(String[] args) {
		Manager andrea = new Manager ("Andrea", "Rojas", 28, 50000f, "Manager", 9, 2500f);
		Manager alan = new Manager ("Alan", "Pacheco", 29, 50000f, "Manager", 9, 5000f);
		Manager roberto = new Manager ("Roberto", "Venegas", 27, 35000f, "Manager", 9, 12000f);
		Manager salvador = new Manager ("Salvador", "Gonzales", 29, 40000f, "Manager", 6, 8000f);
		System.out.println(roberto);
		
		// Invoncando métodos
		andrea.informacion(); //Método superclass
		alan.calcularSalario(); // Anula el método superclase y ejecuta el método de la subclass
		salvador.supervisar();
	
	}

}
