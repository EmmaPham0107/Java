package Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class numberSorted {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter size of array: ");
		int N = input.nextInt();
		int []data = new int[N];
		for (int i=0; i<N; i++) {
			System.out.print("Enter value [" + i + "] = ");
			data[i] = input.nextInt();
		}
		
		for (int x=0; x<N; x++) {
			int minIdx=x;
			for (int y=x+1; y<N; y++) {
				if (data[y]<data[minIdx]) {
					minIdx = y;
				}
			}
			int temp = data[minIdx];
			data[minIdx] = data[x];
			data[x] = temp;	
		}
		System.out.print("Show array: ");
		for (int j=0; j<N; j++) {
			System.out.print(data[j] + " ");
		}
	}

}
