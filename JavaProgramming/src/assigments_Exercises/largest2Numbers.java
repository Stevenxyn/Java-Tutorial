package assigments_Exercises;

public class largest2Numbers {

	public static void main(String[] args) {

		// 1. Largest of 2 numbers (if else, ternary operator)
		int n1 = 02;
		int n2 = 51;

		if (n1 > n2) {
			System.out.println("Number 1 is largest: " + n1);
		} else if (n2 > n1) {
			System.out.println("Number 2 is largest: " + n2);
		} else {
			System.out.println("Both numbers are same, please use different values");
		}
		
		System.out.println("************************");
		//Ternary operator
		boolean validation = (n1 > n2);
		
		System.out.println( validation ? "N1 is largest" : "N2 is largest"  );
		
		
		 
		
		
		
		
		
		
		

	}

}
