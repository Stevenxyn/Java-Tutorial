
public class IncrementoDecremento {
	public static void main(String args[]) {
		int contador = 10;
		
		// Incremento
		contador++;
		contador++;
		System.out.println("Incremento despues: " + contador++);
		System.out.println( contador);
		
		// decremento
		contador--;
		contador--;
		System.out.println("decremento despues: " + contador--);
		System.out.println( contador);

		
		// Pre Incremento
		int contador2 = 10;
		++contador2;
		++contador2;
		System.out.println("Incremento antes: " + ++contador2);
		// decremento
		contador--;
		contador--;
		System.out.println("decremento antes: " + --contador);

	}
}