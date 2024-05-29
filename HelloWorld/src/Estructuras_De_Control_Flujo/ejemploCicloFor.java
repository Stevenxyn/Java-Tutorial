package Estructuras_De_Control_Flujo;

public class ejemploCicloFor {

	public static void main(String[] args) {
		// int tabla = 2;

		// Aca hicimos un for anidado primer for va ssumando lo que es el numero a
		// multiplicar
		for (int j = 2; j <= 10; j++) {
			System.out.println("Imprimiendo tabla del: " + j + "\n");

			// segundo for lo que hace es ir multiplicando el valor de i por j y forma la
			// tabla de multiplicacion
			for (int i = 1; i <= 12; i++) {
				System.out.println(j + " x " + i + " = " + (j * i));
			}
		}

	}

}
