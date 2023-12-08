package com.Krakedev;

public class Rectangulo {
	
	private int base; //Atributos
	private int altura;
	
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
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
