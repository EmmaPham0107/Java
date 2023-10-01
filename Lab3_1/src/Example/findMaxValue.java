package Example;

import java.util.Scanner;

public class findMaxValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int N = input.nextInt();
		int []data = new int[N];
		for (int i=0; i<N; i++) {
			System.out.print("Enter value [" + i + "] = ");
			data[i] = input.nextInt();
		}
		int maxValue = 0;
		for(int j=0; j<N; j++) {
			if (data[j]> data[maxValue]) {
				maxValue = j;
			}
		}
		System.out.print("The maximum value is " + data[maxValue]);
	}

}
