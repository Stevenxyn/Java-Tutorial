package day3;

public class IncrementOperators {

	public static void main(String[] args) {

		int a = 10;
		//a = a + 1;
		a++;
		System.out.println("Increment with ++: " +a);
		
		
		//Post increment
		int b = 20;
		int rest = b++;
		System.out.println("Post Increment: " + rest);
		

		//Pre increment
		int x = 30;
		int rest2 = ++x;
		System.out.println("Pre Increment: " + rest2);
		
	}

}
