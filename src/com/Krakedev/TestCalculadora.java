package com.Krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultadoS;
		double resultadoR;
		double resultadoM;
		double resultadoD;
		double resultadoP;
		
		Calculadora calcu = new Calculadora();
		
		resultadoS = calcu.sumar(5, 8);
		
		resultadoR = calcu.restar(10, 8);
		
		resultadoM = calcu.multiplicar(10, 8);
		
		resultadoD = calcu.dividir(10, 5);
		
		resultadoP = calcu.promediar(10, 10, 10);
		
		System.out.println("El resultado de la suma es:" + resultadoS);
		System.out.println("El resultado de la resta es:" + resultadoR); 
		System.out.println("El resultado de la multiplicación es:" + resultadoM); 
		System.out.println("El resultado de la división es:" + resultadoD); 
		System.out.println("El resultado del promedio es:" + resultadoP); 
		
	}

}
