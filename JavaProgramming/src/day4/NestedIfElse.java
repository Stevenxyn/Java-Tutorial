package day4;

public class NestedIfElse {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Los bloques de codigo anidados deben tener un else
		 * de lo contrario no retornara nada ya que el else fuera
		 * del bloque no se ejecutara ya que de esa forma funcionan
		 * las condiciones anidadas
		 *
		 * */
		
		if (1 == 3) {
			if (0 == 2) {
				System.out.println("I survive a second chance, I feel your love  second hand");
			} else {
				System.out.println("Pisces moon flower face <3");
			}
		} else {
			System.out.println("Valentine are you happy now?");
		}

	}

}
