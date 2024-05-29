package Estructuras_De_Control_Flujo;

public class ejemploDoWhile {

	public static void main(String[] args) {

		//A diferencia del while convencional este primero ejecuta y ahi empieza el ciclo
		
		int numero = 5;
		
		do {
			System.out.println("Numero: " + numero);
			numero++;
		}while(numero <= 20);
		System.out.println("FIn de la ejecucion");
		
		
		

	}

}
