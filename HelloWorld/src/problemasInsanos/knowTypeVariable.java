package problemasInsanos;

import javax.swing.JOptionPane;

public class knowTypeVariable {

	public static void main(String[] args) {

		

		int test = 17;
		String name = "hahs";
		//method to know the type of variable
		String typeVar = ((Object) test).getClass().getName();
		
		System.out.println(typeVar);
	 
		
		
		
		
		
	}

}
