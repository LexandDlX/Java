package com.Krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		Producto productoD = new Producto("Protector Solar UMBRELLA Max Emulsión 91121 FPS 100 100 g"
				,"Bloqueador solara que brinda protección contra los rayos UVA, hipo alergénico y no comedogénico."
				,18.99, 121);
		
		productoA.setNombre("REDOXON 200 mg en Gotas 20 ml");
		productoA.setDescripcion("Ayuda a la prevención y tratamiento de las deficiencias de vitamina C.");
		productoA.setPrecio(4.36);
		productoA.setStockActual(180);
		
		productoB.setNombre("FERRO B COMPLEX Jarabe 240 ml");
		productoB.setDescripcion("Ferro B Complex Folic es el tratamiento ideal "
				+ "para todos aquellos padecimientos anémicos que por su origen "
				+ "requieran sustitución de hierro, ácido fólico y vitaminas del complejo B.");
		productoB.setPrecio(4.68);
		productoB.setStockActual(136);
		
		productoC.setNombre("Fórmula Infantil S-26 Gold 1 Alula 400 g");
		productoC.setDescripcion("Leche S-26 Gold es una fórmula de inicio con hierro ideal"
				+ " si están en la primera etapa de vida que comprende de los 0 a 6 meses");
		productoC.setPrecio(25.28);
		productoC.setStockActual(20);
		
		System.out.println("Nombre:"+ productoA.getNombre());
		System.out.println("Descripción:"+ productoA.getDescripcion());
		System.out.println("Precio:"+ productoA.getPrecio());
		System.out.println("Stock:"+ productoA.getStockActual());
		
		System.out.println("-------------------------------------");
		System.out.println("Nombre:"+ productoB.getNombre());
		System.out.println("Descripción:"+ productoB.getDescripcion());
		System.out.println("Precio:"+ productoB.getPrecio());
		System.out.println("Stock:"+ productoB.getStockActual());
		
		System.out.println("-------------------------------------");
		System.out.println("Nombre:"+ productoC.getNombre());
		System.out.println("Descripción:"+ productoC.getDescripcion());
		System.out.println("Precio:"+ productoC.getPrecio());
		System.out.println("Stock:"+ productoC.getStockActual());
		
		System.out.println("-------------------------------------");
		System.out.println("Nombre:"+ productoD.getNombre());
		System.out.println("Descripción:"+ productoD.getDescripcion());
		System.out.println("Precio:"+ productoD.getPrecio());
		System.out.println("Stock:"+ productoD.getStockActual());
	}

}
