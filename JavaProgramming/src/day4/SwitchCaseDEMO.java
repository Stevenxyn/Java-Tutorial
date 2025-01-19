package day4;

public class SwitchCaseDEMO {

	public static void main(String[] args) {

		int weekNum = 32;

		switch (weekNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		case 7:
			System.out.println("Saturday");
			break; 

		default:
			System.err.print("Invalid number");
			break;
		}

	}

}
