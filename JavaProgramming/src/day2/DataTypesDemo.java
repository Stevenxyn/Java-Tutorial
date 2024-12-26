package day2;

public class DataTypesDemo {

	public static void main(String[] args) {

		System.out.println("Numeric data types");
		int num1 = 100, num2 = 200;
		System.out.println(num1);
		System.out.println(num2);
		
		byte by = 120;
		System.out.println("byte: " + by);
		
		short sh = 250;
		System.out.println("short: " + sh);
		
		long l = 1234567892132130l; //Literal is needed at the end of the value.
		System.out.println("Long: " + l);
		
		
		System.out.println("\nDecimal data types");
		float price = 150.5f; //Literal is needed at the end of the value
		System.out.println(price);

		double item_price = 145.3242342;
		System.out.println(item_price);
		
		System.out.println("\nCharacter");
		char grad = 'B';
		System.out.println("The grad of the student is: " + grad);
		
		
		System.out.println("\nBoolean");
		boolean bool = true;
		System.out.println(bool);
	}

}
