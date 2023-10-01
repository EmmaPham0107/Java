package Practice;

import java.util.Scanner;

public class Practice4_Switch_case {

	public static void main(String[] args) {
		
		String Question = "Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu từ bàn phím ?\n"
				+ "A. java.net\n"
				+ "B. java.io\n"
				+ "C. java.util\n"
				+ "D. java.awt";
		System.out.println(Question + "\r\nEnter answer: ");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		answer = answer.trim().toUpperCase();
		switch(answer) {
		case "A":
			System.out.println("Wrong answer!");
			break;
		case "B":
			System.out.println("Wrong answer!");
			break;
		case "C":
			System.out.println("Incorrect answer!");
			break;
		case "D":
			System.out.println("Wrong answer!");
			break;
		}
	}

}
