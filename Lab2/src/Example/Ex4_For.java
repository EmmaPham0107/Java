package Example;

import java.util.Scanner;

public class Ex4_For {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		int totalEven = 0;
		int totalOdd = 0;
		for (int i = 0; i<N; i++) {
			if (i%2==0) {
				totalEven += i;
			} else {
				totalOdd += i;
			}
			
		}
		System.out.println("Total Even = " + totalEven);
		System.out.println("Total Odd = " + totalOdd);
	}

}
