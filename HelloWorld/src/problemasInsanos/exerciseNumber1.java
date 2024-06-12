package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseNumber1 {

	public static void main(String[] args) {
		//Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.

		String word = JOptionPane.showInputDialog("Insert word: ");
		String cantidad = JOptionPane.showInputDialog("Insert the quantity: ");
		
		for (int i = 1; i <= Integer.parseInt(cantidad) ; i++) {
			System.out.println("# " + i +" " + word);
		} 
		
	
	}}