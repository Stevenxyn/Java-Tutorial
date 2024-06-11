package Estructuras_De_Control_Flujo;

public class ejemploSwitchConStrings {

	public static void main(String[] args) {

		String nombre = "spencer";

		switch (nombre) {
		case "steven":
			System.out.println("Hola " + nombre);
			break;
		case "spencer":
			System.out.println("Hola " + nombre);
			break;
		case "lorena":
			System.out.println("Hola " + nombre);
			break;
		default:
			System.out.println("No Existen resultados");
			break;
		}
		
		
	}

}
