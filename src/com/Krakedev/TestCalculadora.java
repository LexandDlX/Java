package com.Krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultadoS;
		double resultadoR;
		Calculadora calcu = new Calculadora();
		
		resultadoS = calcu.sumar(5, 8);
		
		resultadoR = calcu.restar(10, 8);
		
		System.out.println("El resultado de la suma es:" + resultadoS);
		System.out.println("El resultado de la resta es:" + resultadoR); 
		
	}

}
