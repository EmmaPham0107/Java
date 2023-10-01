package Practice;

import java.util.Scanner;

public class Practice_1_1_If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		if(N%400==0) {
			System.out.println(N + " is a leap year");
		} else if (N%4==0 && N%100!=0) {
			System.out.println(N + " is a leap year");
		} else {
			System.out.println(N + " is not a leap year");
		}

	}

}
