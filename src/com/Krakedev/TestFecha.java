package com.Krakedev;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha fecha1 = new Fecha();
		
		fecha1.setAnio(2020);
		fecha1.setMes(12);
		fecha1.setDia(3);
		
		System.out.println(fecha1.getAnio()+ "/" + fecha1.getMes() + "/" + fecha1.getDia());
	}

}
