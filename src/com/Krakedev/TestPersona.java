package com.Krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; //1. declaro una variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona();	//2. Instaciar un objeto Persona, referenciarlo con p
		//3. Acceder a los atributos
		System.out.println("Nombre:"+ p.getNombre());
		System.out.println("Edad:"+ p.getEdad());
		System.out.println("Estatura:"+ p.getEstatura());
		
		//4. Modificar los atributos
		p.setNombre("Juanito");
		p.setEdad(20);
		p.setEstatura(1.80);
		
		System.out.println("-------------------------");
		//5. Accedo a los atributos
		System.out.println("Nombre:"+ p.getNombre());
		System.out.println("Edad:"+ p.getEdad());
		System.out.println("Estatura:"+ p.getEstatura());
		
		
		p2.setNombre("Paulina");
		p2.setEdad(24);;
		p2.setEstatura(1.70);;
		
		System.out.println("-------------------------");
		System.out.println("Nombre:"+ p2.getNombre());
		System.out.println("Edad:"+ p2.getEdad());
		System.out.println("Estatura:"+ p2.getEstatura());
	}

}
