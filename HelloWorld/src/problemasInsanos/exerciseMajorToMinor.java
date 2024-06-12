package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseMajorToMinor {

	public static void main(String[] args) {
		//Escribir un programa que pida al usuario un número entero positivo y muestre por 
		// pantalla la cuenta atrás desde ese número hasta cero separados por comas.

		String number = JOptionPane.showInputDialog("Inser the number: ");
		int transformInt = Integer.parseInt(number);
		
		for (int i = transformInt; i >= 0 ; i--) {
			System.out.print(i + ",");
		}
		
	}

}
