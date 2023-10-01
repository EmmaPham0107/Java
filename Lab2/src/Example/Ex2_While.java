package Example;

import java.util.Scanner;

public class Ex2_While {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N : ");
		int N = input.nextInt();
		
		System.out.print("Sequence of numbers in descending order: ");
		while(N>0) {
			System.out.print(N + " ");
			N--;
		}
		
	}	
}
