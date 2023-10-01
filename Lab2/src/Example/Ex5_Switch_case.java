package Example;

import java.util.Scanner;

public class Ex5_Switch_case {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		String message;
		switch (N) {
		case 2:
			message = "Monday";
			break;
		case 3:
			message = "Tuesday";
			break;
		case 4:
			message = "Wednesday";
			break;
		case 5:
			message = "Thursday";
			break;
		case 6:
			message = "Friday";
			break;
		case 7:
			message = "Saturday";
			break;
		case 8:
			message = "Sunday";
			break;
		default: 
			message = "Invalid value!";
			break;
		}
		System.out.print(message);
	}

}
