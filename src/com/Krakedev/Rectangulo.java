package com.Krakedev;

public class Rectangulo {
	
	public int base; //Atributos
	public int altura;
	
	public int calcularArea() { // Metodos
		
		int area;
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() { // Metodos
		
		double perimetro;
		perimetro = (base + base) * (altura + altura);
		return perimetro;
	}
	
}
