package Practice;

import java.util.Scanner;

public class Practice_1_2_If {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		System.out.print("Enter c: ");
		int c = input.nextInt();
		
		int Delta = b*b - 4*a*c;
		if (Delta==0) {
			float x = -b/2*a;
			System.out.print("The equation has 1 solutions \r\n" +
								"x1 = x2 = " + x);
		} else if (Delta>0) {
			float x1 = (float)(-b + Math.sqrt(Delta))/(2*a);
			float x2 = (float)(-b - Math.sqrt(Delta))/(2*a);
			System.out.print("The equation has 2 solutions \r\n"+
								"x1 = " + x1 + "\r\n" +
								"x2 = " + x2);
		} else {
			System.out.print("The equation has no solution!");
		}
	}
}
