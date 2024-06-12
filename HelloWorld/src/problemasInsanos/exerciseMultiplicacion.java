package problemasInsanos;

public class exerciseMultiplicacion {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que muestre por pantalla la tabla de multiplicar del 1
		 * al 10. *
		 */

		int n = 11;

		for (int i = 1; i < n; i++) {
			System.out.println("\n Tabla del: " + i + "\n");
			for (int j = 1; j < n; j++) {
				System.out.println( i + " X " + j + " = " + i * j);
			}
		}

	}

}
