package day5;

public class DoWhileLoop {

	public static void main(String[] args) {

		// Print 1 ......10
		
		int i = 0;
		/*
		do {
			System.out.println("#" + i);
			i++;
		} while (i <= 10);
		 */
		
		//print 10........1
		int topNumber = 10;
		do {
			System.out.println("#"+ topNumber );
			topNumber--;
		}while(topNumber >= 1);
		
		
	}

}
