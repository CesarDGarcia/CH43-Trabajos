package org.generation.employee;

//Esta clase es la plantilla de mi objeto, que recibe atributos (variables de instancia) y comportamientos (metodos del objeto). Tambien recibe metodos constructores, metodos de accesibilidad (getters y setters) y metodos de conversion (toString)

public class Employee {
	
	//1. Declarar atributos (variables de instancia)
	String nombre;
	String apellido;
	int edad;
	float salario;
	String puesto;
	
	//2. Metodo constructor, Recibe el mismo nombre de la clase, no retorna algo, recibe como argumentos o parametros a los atributos del objeto (¿o no?) y estos se guardan con la palabra reservada this
	//Atajo para crear el metodo constructor: clck derecho > source > Generate constructor using fields > generate
	public Employee(String nombre, String apellido, int edad, float salario, String puesto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	// 3. Métodos de comportamiento
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
	
	public void calcularSalario() {
		System.out.println("El salario es de $" + this.salario);
	}

	public void informacion() {
		System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad + ", Puesto: " + this.puesto);
		
		
	}
	// 4. Métodos de accesibilidad y modificacion a la informacion de los atributos del objeto (getters y setters)
		//Atajo para getters y setters clck derecho > source > Generate getters and setters > generate
		
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	
	
	// 5. Método de conversion a String (toString). Permite convertir la informacion de los objetos a String @Override
	//Atajo para crear metodo String clck derecho > source > Generate toString... > generate
	
	@Override
	public String toString() {
		return "Employee [nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", salario: " + salario
				+ ", puesto: " + puesto + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
