package Practice;

import java.util.Scanner;

public class Practice3_for {
	
	public static boolean isPrime(int J) {
		if (J<2) {
			return false;
		}
		for (int i = 2; i<=J/2; i++) {
			if (J%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		int count=0;
		for (int j=0; j<N;j++) {
			if (isPrime(j)==true) {
				count++;
				System.out.print(j + " ");
			}
		}
		System.out.println("\r\nCount total prime numbers from 1 to N = " + count);
	}

}
