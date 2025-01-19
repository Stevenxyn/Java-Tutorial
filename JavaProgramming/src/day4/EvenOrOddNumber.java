package day4;

public class EvenOrOddNumber {
	public static void main (String[] args) {
		
		int number = 1;
		int validation = number % 2;
		
		if(validation == 0) {
			System.out.println("Number Even: " +  validation);
		}else {
			System.out.println("Number Odd: " + validation);
		}
		
		
	}

}
