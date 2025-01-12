package day3;

public class OperationsDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Aritmethic Operators + - * / %

		int a = 20, b = 10;

		System.out.println("Sum of a and b is: " + (a + b));
		System.out.println("Res of a and b is: " + (a - b));
		System.out.println("Mul of a and b is: " + (a * b));
		System.out.println("Div of a and b is: " + (a / b));
		System.out.println("Modulo Div of a and b is: " + (a % b));
		System.out.println("****************************************");

		// Relational/Comparison operators > >= < <= != ==
		// Returns boolean values true or false

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		System.out.println(a == b);
		System.out.println("****************************************");

		// Logical operators && || !
		// returns boolean value - true/false
		// works between 2 boolean values

		boolean x = true;
		boolean z = false;

		// Retorna true si ambas condiciones son verdaderas
		System.out.println("Operator &&: " + (x && z));

		// Retorna true si alguna condicion es verdadera
		System.out.println("Operator ||: " + (x || z));

		// Invierte el valor de la condicion
		System.out.println("Operator !: " + !z);

		boolean b1 = 10 > 20;
		System.out.println(b1); // false

		boolean b2 = 20 > 10;
		System.out.println(b2); // true

		System.out.println(b1 && b2);  // false
		System.out.println(b1 || b2 ); // true
		
		System.out.println("&& :" +  ((10 < 52) && (20 > 10 ))); // false
		System.out.println("|| :" + ((50 < 20) || (20 > 10))); // true
		System.out.println("****************************************");

		
		System.out.println("Negation of the affirmation: " + !(10 > 50)); 
		
	
	}

}
