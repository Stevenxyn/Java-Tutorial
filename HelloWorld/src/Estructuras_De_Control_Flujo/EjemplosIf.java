package Estructuras_De_Control_Flujo;

public class EjemplosIf {

	public static void main(String args[]) {

		int edad = 46;

		if (edad >= 18) {
			System.out.println("Puedes ingresar al lugar");
		} else {
			System.out.println("No puedes ingresar");
		}

		System.out.println("****************************************************");

		if (edad >= 0 && edad <= 10) {
			System.out.println("Tienes entre 0 a 10 años");
		} else if (edad >= 11 && edad <= 20) {
			System.out.println("Tienes entre 11 y 20 años");
		} else if (edad >= 20 && edad <= 45) {
			System.out.println("Eres un adulto");
		} else {
			System.out.println("Eres ya anciano");
		}

	}
}
