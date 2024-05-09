
public class Identificadores {
	public static void main (String args[]) {
		/*
		 * 1sueldo ERROR
		 * $sueldo BIEN
		 * _sueldo BIEN
		 * NO usar palabras reservadas de JAVA
		 * */
		double _sueldo =  18500.50;
		System.out.println("Mi sueldo es: " + _sueldo);
		
		int __ = 6;
		int ___ = 10;
		int ___1 = 5;
		int $ = 1;
		
		System.out.println("La suma de '__' y '___' es: " + (__ + ___));
		System.out.println("La resta de '___1' y '$' xjes: " + (___1 - $) );
	}
	
}
