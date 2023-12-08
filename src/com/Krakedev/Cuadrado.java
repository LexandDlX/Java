package com.Krakedev;

public class Cuadrado {
	
	public int lado; //Atributos
	
	public double calcularArea() { // Metodos
		
		double area;
		area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() { // Metodos
		
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}

}
