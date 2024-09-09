package org.generation.employee.developer;

public class DeveloperMain {
	public static void main(String[] args) {
		Developer alexis = new Developer ("Alexis", "Garcia", 27, 12000f, "Desarrollador Frontend", NivelDominio.JUNIOR, LenguajesProgramacion.CSS);
		Developer dani = new Developer ("Daniela", "Luna", 25, 60000f, "Desarrollador Frontend", NivelDominio.SENIOR, LenguajesProgramacion.JAVASCRIPT);
		Developer jorge = new Developer ("Jorge", "Licea", 28, 35000f, "Desarrollador Backend", NivelDominio.MIDDLE, LenguajesProgramacion.JAVA);
		Developer mitzi = new Developer("Mitzi", "Martinez", 26, 45000f, "desarrolladora MES", NivelDominio.MIDDLE, LenguajesProgramacion.SQL);	
	
		System.out.println(alexis);
		dani.calcularSalario();
		jorge.trabajar();
		mitzi.trabajar();
		
		
	
	}

}
