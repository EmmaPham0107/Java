package Practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class animal_Info {

	public static void main(String[] args) {
		String name;
		int weight;
		Animal a;
		Scanner input = new Scanner(System.in);
		ArrayList <Animal> data = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter name of animal [" + i + "]: ");
			name = input.nextLine();
			System.out.print("Enter weight of animal [" + i + "]: ");
			weight = Integer.parseInt(input.nextLine());
			a = new Animal(name,weight);
			data.add(a);
		}
		int maxWeightIdx = 0;
		for(int j=0; j<5; j++) {
			a = data.get(j);
			if(a.getWeight()>data.get(maxWeightIdx).getWeight()) {
				maxWeightIdx = j;
			}
		}
		String nameOfMaxWeightAnimal = data.get(maxWeightIdx).getName();
		int maxWeight = data.get(maxWeightIdx).getWeight();
		System.out.print(nameOfMaxWeightAnimal + " is " + maxWeight);
	}
}