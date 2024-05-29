package ejercicios;

public class ejercicioSeccion4 {

	public static void main(String[] args) {
		// Realizar un programa que imprima las tablas de multiplicar del 1 al 20 y
		// tenga el titulo de cual es con espacio

		// ciclo padre de la cantidad de tablas a multiplicar
//		for (int i = 1; i <= 20; i++) {
//			System.out.println("\n" + "Tabla del: " + i + "\n");
//			// ciclo que realiza la multiplicacin tomando como numero a multiplicar j
//			for (int j = 1; j <= 10; j++) {
//				int multi = i * j;
//				if (multi % 2 == 0) {
//					System.out.println(i + " X " + j + " = " + multi);
//				}
//				// System.out.println(i + " X " + j + " = " + multi);
//			}
//		}
//		

		int numero = 15;
		int factorial = 1;

		for (int i = 2; i <= numero; i++) {
			if (numero == 0) {
				System.out.println("No se puede calcular factorial por 0, pero el factorial de 0 es 1");
				break;
			}else if (numero == 1) {
				System.out.println("El factorial de " + numero + " es 1");
				break;
			}
			
			factorial *= i;
			System.out.println("factorial: " + factorial);
		}

		
		
		
	}
}
