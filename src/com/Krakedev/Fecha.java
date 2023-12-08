package com.Krakedev;

public class Fecha {
	
	private int anio;
	private int mes;
	private int dia;
	
	public Fecha() {
		
	}
	
	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	//Obtener
	public int getAnio() {
		return anio;
	}
	//Modificar
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	
}
