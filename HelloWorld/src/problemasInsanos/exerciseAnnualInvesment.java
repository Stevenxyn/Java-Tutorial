package problemasInsanos;

import javax.swing.JOptionPane;

public class exerciseAnnualInvesment {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que pregunte al usuario una cantidad a invertir, el
		 * interés anual y el número de años, y muestre por pantalla el capital obtenido
		 * en la inversión cada año que dura la inversión.
		 */

		String valorInvertir = JOptionPane.showInputDialog("Valor a Invertir: ");
		int intValorInvertir = Integer.parseInt(valorInvertir);

		String interesAnual = JOptionPane.showInputDialog("Ingrese el interes Anual: ");
		double intInteresAnual = Double.parseDouble(interesAnual);

		String cantidadAnios = JOptionPane.showInputDialog("Ingrese la cantidad de años: ");
		int intCantidadAnios = Integer.parseInt(cantidadAnios);

		

		for (int i = 1; i < intCantidadAnios; i++) {
			double rendimiento = intCantidadAnios * 1 + intInteresAnual / 100;
			System.out.println("Año: " + i + " rendimiento de: " + rendimiento);
		}
		
	}

}
