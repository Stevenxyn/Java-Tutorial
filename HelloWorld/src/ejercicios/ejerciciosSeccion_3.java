package ejercicios;

public class ejerciciosSeccion_3 {

	public static void main(String args[]) {

		int valorUno = 5;
		int valorDos = 5;
		
		int areaCuadrado = valorUno * valorDos;
		int diametroCirculo = 38;
		double areaCirculo = Math.PI * Math.pow((diametroCirculo / 2), 2);
		
		int largo = 7;
		int ancho = 4;
		int areaRectangulo = largo * ancho;
		
		int base = 20;
		int altura = 30;
		int areaTriangulo = (base * altura) / 2 ;
		
		
		System.out.println(
				"Realizar un programa capaz de calcular el area de un cuadrado, circulo, rectangulo y triangulo ");

	
		System.out.println("El area del cuadrado es: " + areaCuadrado);
		System.out.println("El valor del circulo es: " + String.format("%.3f", areaCirculo));
		System.out.println("El area del rectangulo es: " + areaRectangulo);
		System.out.println("El area del triangulo es: " + areaTriangulo);

	}
}
