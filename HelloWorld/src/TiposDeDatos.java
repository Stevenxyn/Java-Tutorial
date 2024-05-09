
public class TiposDeDatos {
	public static void main (String args[]) {
		
		//Numerics
		int age = 24;
		System.out.println("My age is: " + age);
		//change age value
		age = 29;
		System.out.println("My new age is: " + age);
		age = 92;
		System.out.println("My new age is: " + age);
		
		//Una constante no permite ser modificada
		final int identification = 1234567890;
		System.out.println("Identification number is: " + identification);
		// identification = 1234567890; ERROR
		
	}
}
