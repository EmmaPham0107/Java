package Practice;

import java.util.Scanner;

public class Practice2_while {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N;
		int sumN = 0;
		do {
			System.out.print("Enter N: ");
			N = input.nextInt();
			sumN += N;
		}
		while (sumN<100);
		
		if(N%2==0) {
			System.out.println("Sequence of even numbers in descending order: ");
			while(N>=2) {
				System.out.print(N + " ");
				N = N - 2;
			}
		} else {
			System.out.println("Sequence of odd numbers in descending order: ");
			while(N>=1) {
				System.out.print(N + " ");
				N = N - 2;
			}
		}	
	}
}
