package day3;

public class DecrementOperator {

	public static void main(String[] args) {

		
		int a = 100;
		a = a - 1;
		System.out.println(a);
		
		
		//Post decrement
		int b = 100;
		int rest = b--;
		System.out.println(rest); //100
		
		//Post decrement
		int x = 100;
		int rest2 = --x;
		System.out.println(rest2); //100
		
		rest2--;
		System.out.println(rest2);
	}

}
