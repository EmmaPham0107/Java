package Example;

import java.util.Scanner;

public class Ex3_Do_while {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N;
		do {
		System.out.print("Enter N: ");
		N = input.nextInt();
		}
		while (N<=0);
		
		System.out.print("N = " + N);
	}
}
