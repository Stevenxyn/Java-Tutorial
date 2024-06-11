package Estructuras_De_Control_Flujo;

public class ejemploSwitch {

	public static void main(String args[]) {

		int numeroCancion = 532;

		switch (numeroCancion) {
		case 0:
			System.out.print("Cry");
			break;
		case 1:
			System.out.print("Touch");
			break;
		case 2:
			System.out.print("K");
			break;
		case 3:
			System.out.print("Apocalipse");
			break;
		case 4:
			System.out.print("Hentai");
			break;
		case 5:
			System.out.print("Please don´t cry!");
			break;
		default:
			System.out.print("Cancion no reconocida");
			break;

		}

	}

}
