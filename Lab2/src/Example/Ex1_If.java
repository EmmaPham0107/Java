package Example;

import java.util.Scanner;

public class Ex1_If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		if (N%2==0) {
			System.out.println("This is an even!");
		} else {
			System.out.println("This is an odd!");
		}
	}
}
