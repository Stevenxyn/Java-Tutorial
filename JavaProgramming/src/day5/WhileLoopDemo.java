package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

		// Example 1: 1 .....10

		int i = 0; // initialization

		/*
		while (i <= 10) { // Condition
			System.out.println(i);
			i++; // Incremetation
		}
		
		*/

		System.out.println("************************ "+ i);

		// Example #2 print hello 10 times

		/*
		String textLoop = "Hello";
		while (i <= 10) {
			System.out.println(textLoop + " #" + i);
			i++;
		}
		
		*/
		
		System.out.println("************************");

		//Example #3 print only even numbers
		
		int topNumber = 10;
		/*
		while(i <= topNumber) {
			if(i % 2 == 0) {
				System.out.println("Even number: " + i);
			} 
			i++;
		}
		*/
		
		System.out.println("************************");

		//Example 4 print 10  9 8 7 6 5 4 ....1
		
		while(topNumber >= 1) {
			System.out.println("#" + topNumber);
			topNumber--;
		}
		
		
		
	}
}
