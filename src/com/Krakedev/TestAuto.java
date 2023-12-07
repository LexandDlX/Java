package com.Krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Ford F-150";
		auto1.anio = 2022;
		auto1.precio = 60.000;
		
		auto2.marca = "Chevy Siveraldo 4x4";
		auto2.anio = 2023;
		auto2.precio = 70.000;
		
		System.out.println("Marca:"+ auto1.marca);
		System.out.println("Año:"+ auto1.anio);
		System.out.println("Precio:"+ auto1.precio);
		
		System.out.println("-------------------------");
		System.out.println("Marca:"+ auto2.marca);
		System.out.println("Año:"+ auto2.anio);
		System.out.println("Precio:"+ auto2.precio);
	}

}
