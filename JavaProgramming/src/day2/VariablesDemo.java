package day2;

public class VariablesDemo {
	public static void main(String[] args) {

		System.out.println("Example #1");
		int a; // declaration
		a = 100; // assignment
		System.out.println(a);

		System.out.println("\nExample #2");
		a = 501;
		System.out.println(a);
		a = 606025145;
		System.out.println(a);

		System.out.println("\nExample #3 - All the variables are belongs to same data type");
		/*
		 * int b = 100; int n = 200; int m = 300;
		 */

		int b, n, m; // Declared multiple variables
		b = 100;
		n = 200;
		m = 300;

		System.out.println(b + " " + n + " " + m);

		System.out.println("\nExample #4 - In single statement we defined multiple variables");
		int num = 100, num2 = 200, num3 = 300;
		System.out.println("The value of NUM is: " + num);
		System.out.println("The value of NUM2 is: " + num2);
		System.out.println("The value of NUM3 is: " + num3);

	}

}
