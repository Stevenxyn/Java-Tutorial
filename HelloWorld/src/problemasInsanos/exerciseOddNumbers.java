package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseOddNumbers {

	public static void main(String[] args) {

		// Escribir un programa que pida al usuario un número entero positivo y muestre
		// por pantalla todos los números impares desde 1 hasta ese número separados por
		// comas.

		String number = JOptionPane.showInputDialog("Insert a integer: ");
		int transformInt = Integer.parseInt(number);

		for (int i = 1; i <= transformInt; i++) {
			if (i % 2 == 1 ) {
				System.out.println("Odd Numbers: " + i);
			}
		}

		
		
		
	}

}
