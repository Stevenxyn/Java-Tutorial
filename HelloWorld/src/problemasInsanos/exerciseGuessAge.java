package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseGuessAge {

	public static void main(String[] args) {

		// Escribir un programa que pregunte al usuario su edad y muestre por pantalla
		// todos los años que ha cumplido (desde 1 hasta su edad).

		String age = JOptionPane.showInputDialog("Insert your age: ");
		for (int i = 1; i <= Integer.parseInt(age); i++) {
			if (i == 1) {
				System.out.println("Ha cumplido: " + i + " Año.");
			}
			System.out.println("Ha cumplido: " + i + " Años.");
		}

	}

}
