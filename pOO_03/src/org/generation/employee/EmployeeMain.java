package org.generation.employee;

public class EmployeeMain {
	public static void main(String[] args) {
		// Instanciar nuevos objetos a partir de la clase Employee
		Employee daniel = new Employee("Daniel", "Maldonado", 37, 95363.22f, "Instructor");
		Employee salvador = new Employee("Salvador", "Gonzales", 29, 19421.87f, "Fullstack Dev");
		Employee moni = new Employee("Monica", "Jasso", 27, 22344.10f, "Frontend Dev");
		Employee mitzi = new Employee("Mitzi", "Martinez", 26, 35102.33f, "MES Dev");
		Employee alberto = new Employee("Alberto", "Montes de Oca", 26, 9688.12f, "Fullstack Dev");
		
		System.out.println(salvador);		
		System.out.println(moni);
		System.out.println(daniel);
		System.out.println(mitzi);
		System.out.println(alberto);
		
		// Invocando los métodos de comportamiento del objeto
		alberto.trabajar();
		moni.informacion();
		mitzi.calcularSalario();
		
			
	}
}
