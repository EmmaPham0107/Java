package com.basic.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		
		//a. Nhap thong tin Student
		Scanner input = new Scanner(System.in);
		
		ArrayList <Student> data = new ArrayList<>();
		String isContinue = "";
		do {
			System.out.print("Nhap ho va ten hoc sinh: ");
			String fullName = input.nextLine();
			System.out.print("Nhap dia chi: ");
			String address = input.nextLine();
			System.out.print("Nhap ngay thang nam sinh: ");
			String dob = input.nextLine();
			System.out.print("Nhap gioi tinh: ");
			String gender = input.nextLine();
			System.out.print("Nhap diem tong ket: ");
			float finalGrade = Float.parseFloat(input.nextLine());
			Student stu = new Student(fullName, address, dob, gender, finalGrade);
			data.add(stu);
			System.out.println("Do you want to continue (Y/N)?");
			isContinue = input.nextLine();
			while (!isContinue.equals("Y") && !isContinue.equals("N")) {
				System.out.println("Incorrect value. Please try again (Y/N)!");
				isContinue = input.nextLine();
			}
		} 
		while (isContinue.equals("Y"));
		
		//b. In ra tất cả Student trong danh sách theo định dạng
		for (int x=0; x<data.size(); x++) {
			Student stu = data.get(x);
			System.out.println( "Student " + (x+1) + ": \r\n"
					+ "\r\n"
					+ "FullName: " + stu.getfullName() + "\r\n"
					+ "Address: " + stu.getaddress() + "\r\n"
					+ "DOB: " + stu.getdob() + "\r\n"
					+ "Gender: " + stu.getgender() + "\r\n"
					+ "FinalGrade: " + stu.getfinalGrade() + "\r\n"
					);
		}
		
		//c. In ra danh sách vừa nhập (Xét finalGrade)
		System.out.println("Xep loai hoc sinh theo Final Grade: \r\n");
		for (int j=0; j<data.size(); j++) {
			Student stu = data.get(j);
			if(stu.getfinalGrade()<4.0) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc kem");
			} else if (stu.getfinalGrade()>=4.0 && stu.getfinalGrade()<5.0) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc yeu");
			} else if (stu.getfinalGrade()>=5.0 && stu.getfinalGrade()<5.5) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc trung binh yeu");
			} else if (stu.getfinalGrade()>=5.5 && stu.getfinalGrade()<6.5) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc trung binh");
			} else if (stu.getfinalGrade()>=6.5 && stu.getfinalGrade()<7.0) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc trung binh kha");
			} else if (stu.getfinalGrade()>=7.0 && stu.getfinalGrade()<8.0) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc kha");
			} else if (stu.getfinalGrade()>=8.0 && stu.getfinalGrade()<8.5) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc kha gioi");
			} else if (stu.getfinalGrade()>=8.5 && stu.getfinalGrade()<10.0) {
				System.out.println("Hoc sinh" + " " + stu.getfullName() + " " + "hoc luc gioi");
			}
		}
		System.out.println();
		//d. Tính điểm tổng kết trung bình của danh sách học sinh	
		
		float sumGrade = 0;
		for (int k=0; k<data.size(); k++) {
			Student Stu = data.get(k);
			sumGrade = sumGrade + Stu.getfinalGrade();
		}
		float avg = sumGrade/data.size();
		System.out.print("Diem tong ket trung binh cua danh sach hoc sinh = " + avg);
	}

}
