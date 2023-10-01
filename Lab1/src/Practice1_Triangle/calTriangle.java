package Practice1_Triangle;

import java.util.Scanner;

public class calTriangle {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		tri.a = input.nextInt();
		System.out.print("Enter b: ");
		tri.b = input.nextInt();
		System.out.print("Enter c: ");
		tri.c = input.nextInt();
		
		System.out.println("Peripheral of triangle = " + tri.calPeripheral());
		System.out.println("Area of triangle = " + tri.calArea());
		
	}

}
