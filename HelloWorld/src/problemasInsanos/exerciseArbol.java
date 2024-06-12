package problemasInsanos;

public class exerciseArbol {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida al usuario un número entero y muestre por
		 * pantalla un triángulo rectángulo como el de más abajo, de altura el número
		 * introducido.
		 */

		int n = 10;
		//String elemento = "*";
		String asterisco = "*";
		
		for (int i = 0; i < n; i++) {
			
			System.out.println(asterisco);
			asterisco += '*';

		}

	}

}
