package com.Krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("Ford F-150");
		auto1.setAnio(2022);
		auto1.setPrecio(60.000);
		
		auto2.setMarca("Chevy Siveraldo 4x4");
		auto2.setAnio(2023);
		auto2.setPrecio(70.000);
		
		System.out.println("Marca:"+ auto1.getMarca());
		System.out.println("Año:"+ auto1.getAnio());
		System.out.println("Precio:"+ auto1.getPrecio());
		
		System.out.println("-------------------------");
		System.out.println("Marca:"+ auto2.getMarca());
		System.out.println("Año:"+ auto2.getAnio());
		System.out.println("Precio:"+ auto2.getPrecio());
	}

}
