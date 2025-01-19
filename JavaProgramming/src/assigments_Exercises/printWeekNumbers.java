package assigments_Exercises;

public class printWeekNumbers {

	public static void main(String[] args) {

		// Print week numbers based on week name (Switch case)
		String weekNumber = "fridDay";

		switch (weekNumber.toLowerCase()) {
		case "monday":
			System.out.print("1- Monday");
			break;
		case "tuesday":
			System.out.print("2- tuesday");
			break;
		case "wednesday":
			System.out.print("3- wednesday");
			break;
		case "thursday":
			System.out.print("4- thursday");
			break;
		case "friday":
			System.out.print("5- friday");
			break;
		case "sunday":
			System.out.print("6- sunday");
			break;
		case "saturday":
			System.out.print("7- saturday");
			break;
		default:
			System.out.println("Invalid value");
			break;
		}

	}

}
