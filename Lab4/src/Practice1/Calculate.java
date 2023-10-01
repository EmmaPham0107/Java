package Practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
	
		
		public static void main(String[] args) {
			
			float a = 0;
			float b = 0;
			
			Scanner input = new Scanner(System.in);
			
			try {
				System.out.print("Enter a: ");
				a = input.nextFloat();
				System.out.print("Enter b: ");
				b = input.nextFloat();
			}
			catch(InputMismatchException e) {
				System.out.print("[ERROR] - Number format exception!");
				e.printStackTrace();
			}
			
			if(b==0) throw new ArithmeticException();
			int div = (int)(a/b);
			System.out.print("a/b = " + div);
			
		}

}
