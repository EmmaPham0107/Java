package Example_Rectangle;

import java.util.Scanner;

public class calRectangle {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		rec.length = input.nextInt();
		System.out.print("Enter width: ");
		rec.width = input.nextInt();
		
		System.out.println("Peripheral of rectangle = " + rec.calPeripheral());
		System.out.println("Area of rectangle = " + rec.calArea());
		
	}

}
