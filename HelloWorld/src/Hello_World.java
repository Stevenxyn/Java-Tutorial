public class Hello_World {
	public static void main(String[] args) {
		// Variables
		String nombre = "Steven";
		int numero = 15;

		System.out.println("Hola que tal en Mayusculas " + nombre.toUpperCase() + "Tu edad es " + numero);
		System.out.println("Arreglamos el fallo de las versiones en JAVA");

		boolean valor = true;

		if (valor) {
			int numero1 = 99;
			System.out.println("dentro del bloque " + numero1);
		}
		System.out.println("Fuera del bloque: " + numero);

		var numero3 = 76;
		System.out.println(numero3);

		// 10- Reglas para asignar variables
		System.out.println("*****************************************");

		int edad;
		edad = 9;

		if (edad > 10) {
			edad = 69;
			System.out.println(edad);
		}

	}

}
