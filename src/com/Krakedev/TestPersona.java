package com.Krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; //1. declaro una variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona();	//2. Instaciar un objeto Persona, referenciarlo con p
		//3. Acceder a los atributos
		System.out.println("Nombre:"+ p.nombre);
		System.out.println("Edad:"+ p.edad);
		System.out.println("Estatura:"+ p.estatura);
		
		//4. Modificar los atributos
		p.nombre = "Juanito";
		p.edad = 20;
		p.estatura = 1.80;
		
		System.out.println("-------------------------");
		//5. Accedo a los atributos
		System.out.println("Nombre:"+ p.nombre);
		System.out.println("Edad:"+ p.edad);
		System.out.println("Estatura:"+ p.estatura);
		
		
		p2.nombre = "Paulina";
		p2.edad = 24;
		p2.estatura = 1.70;
		
		System.out.println("-------------------------");
		System.out.println("Nombre:"+ p2.nombre);
		System.out.println("Edad:"+ p2.edad);
		System.out.println("Estatura:"+ p2.estatura);
	}

}
