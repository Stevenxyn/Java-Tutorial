package problemasInsanos;

import javax.swing.JOptionPane;

public class exercisePassword {

	public static void main(String[] args) {
		/*
		 * Write a program that stores the character string contraseñain a variable,
		 * prompting the user for the password until the correct password is entered.
		 * 
		 */

		String passwordString = JOptionPane.showInputDialog("Insert your Password: ");
		int password = Integer.parseInt(passwordString);

		String valueString = JOptionPane.showInputDialog("Enter your password to enter: ");
		int value = Integer.parseInt(valueString);

		while (value != password) {

			valueString = JOptionPane.showInputDialog("Enter your password to enter: ");
			value = Integer.parseInt(valueString);
			if (value == password) {
				System.out.println("Correct Password");
			} else {
				System.out.println("Correct Incorrect");
			}

		}
	}
}
