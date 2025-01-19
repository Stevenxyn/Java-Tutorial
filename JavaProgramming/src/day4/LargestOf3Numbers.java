package day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a = 140;
		int b = 220;
		int c = 300;
		
		
		//f - f 
		if (a > b && a > c) {
			System.out.println("A is largest: " + a);
		}else if (b > a && b > c) {
			System.out.println("B is largest: " + b);
		}else {
			System.out.println("C is largest: " + c);
		}

	}

}
