package day5;

public class WhileVsDoWhileLoops {

	public static void main(String[] args) {

		int i = 10;

		//No ejecuta nada porque la condicion no es true
		while (i == 19) {
			System.out.println("Hola");
		}
		
		
		//Ejecuta una vez porque con el Do primero muestra y despues valida la condicion
		do {
			System.out.println("Hola");

		}while (i == 19);
		
		
		
		
		
		

	}
}