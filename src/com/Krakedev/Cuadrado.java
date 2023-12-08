package com.Krakedev;

public class Cuadrado {
	
	private int lado; //Atributos
	
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

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	

}
