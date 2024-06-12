package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseCousinsNumbers {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida al usuario un número entero y muestre por
		 * pantalla si es un número primo o no.
		 * 
		 */
		
		
		String numberString = JOptionPane.showInputDialog("Insert a counsis numbers: ");
		int number = Integer.parseInt(numberString);
		
		while (true) {
			numberString = JOptionPane.showInputDialog("Insert a counsis again: ");
			number = Integer.parseInt(numberString);
			
			if(2 / number == 0) {
			System.out.println("I'ts par");	
			}else {
				System.out.println("I'ts Impar");					
			}
			 	
		}
	}

}
