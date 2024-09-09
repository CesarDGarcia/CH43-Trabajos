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
		
		// Acceder a la información de los objetos (getters)
		System.out.println(salvador.getNombre() + " " + salvador.getApellido() + " trabaja como " + salvador.getPuesto());
		
		System.out.println(alberto.getNombre() + " " + alberto.getApellido() + " tiene un salario base de $" + alberto.getSalario() + " pero se le incrementaron $2000, quedando su nuevo salario en $" + (alberto.getSalario() + 2000));
		
		System.out.println(alberto); // Se sigue observando el mismo salario, porque no lo guardamos como parte de su atributo de objeto
		
		// Modificar información de los objetos (setter)
		float nuevoSalario = alberto.getSalario() + 2000;
		alberto.setSalario(nuevoSalario); // Guardo el nuevo salario como parámetro del setter
		
		System.out.println(alberto); //Ahora si se muestra el salario con el incremento de $2000
			
	}
}
