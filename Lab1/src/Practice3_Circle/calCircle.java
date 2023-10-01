package Practice3_Circle;

import java.util.Scanner;

public class calCircle {

	public static void main(String[] args) {
		
		Circle cir = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter R: ");
		cir.R = input.nextInt();
		
		System.out.println ("Peripheral of circle = " + cir.calPeripheral());
		System.out.println ("Area of circle = " + cir.calArea());

	}

}
