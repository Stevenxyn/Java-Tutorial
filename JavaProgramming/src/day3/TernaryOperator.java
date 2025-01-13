package day3;

public class TernaryOperator {

	public static void main(String[] args) {

		// var = exp ? result1 : result2
		// var = condicion ? Resultado_true : Resultado_false;

		// Example #1
		int a = 350, b = 250;

		int validacion = (a > b) ? a : b;
		System.out.println(validacion);

		int age = 17;
		boolean ageValidation = (age >= 18);

		System.out.println(ageValidation ? "Adult" : "not an adult");

		System.out.println("**********************************");

		// Example #2
		int x = (1 == 2) ? 100 : 200;
		System.out.println(x);

	}

}
