package com.Krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "REDOXON 200 mg en Gotas 20 ml";
		productoA.descripcion = "Ayuda a la prevención y tratamiento de las deficiencias de vitamina C.";
		productoA.precio = 4.36;
		productoA.stockActual = 180;
		
		productoB.nombre = "FERRO B COMPLEX Jarabe 240 ml";
		productoB.descripcion = "Ferro B Complex Folic es el tratamiento ideal "
				+ "para todos aquellos padecimientos anémicos que por su origen "
				+ "requieran sustitución de hierro, ácido fólico y vitaminas del complejo B.";
		productoB.precio = 4.68;
		productoB.stockActual = 136;
		
		productoC.nombre = "Fórmula Infantil S-26 Gold 1 Alula 400 g";
		productoC.descripcion = "Leche S-26 Gold es una fórmula de inicio con hierro ideal"
				+ " si están en la primera etapa de vida que comprende de los 0 a 6 meses";
		productoC.precio = 25.28;
		productoC.stockActual = 20;
		
		System.out.println("Nombre:"+ productoA.nombre);
		System.out.println("Descripción:"+ productoA.descripcion);
		System.out.println("Precio:"+ productoA.precio);
		System.out.println("Stock:"+ productoA.stockActual);
		
		System.out.println("-------------------------------------");
		System.out.println("Nombre:"+ productoB.nombre);
		System.out.println("Descripción:"+ productoB.descripcion);
		System.out.println("Precio:"+ productoB.precio);
		System.out.println("Stock:"+ productoB.stockActual);
		
		System.out.println("-------------------------------------");
		System.out.println("Nombre:"+ productoC.nombre);
		System.out.println("Descripción:"+ productoC.descripcion);
		System.out.println("Precio:"+ productoC.precio);
		System.out.println("Stock:"+ productoC.stockActual);
	}

}
