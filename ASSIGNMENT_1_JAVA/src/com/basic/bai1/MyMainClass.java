package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất x = ");
		CalculateUtils.x = input.nextDouble();
		System.out.print("Nhập số thứ nhất y = ");
		CalculateUtils.y = input.nextDouble();
		input.nextLine();
		System.out.print("Nhập lệnh ACTION = ");
		String action = input.nextLine();
		
		switch (action) {
		case "CONG":
			System.out.print("Ket qua tinh cong = ");
			System.out.print(CalculateUtils.tinhCong());
			break;
		case "NHAN":
			System.out.print("Ket qua tinh nhan = ");
			System.out.print(CalculateUtils.tinhNhan());
			break;
		case "TRU":
			System.out.print("Ket qua tinh tru = ");
			System.out.print(CalculateUtils.tinhTru());
			break;
		case "CHIA":
			System.out.print("Ket qua tinh chia = ");
			System.out.print(CalculateUtils.tinhChia());
			break;
		default:
			System.out.print("Giá trị ACTION không hợp lệ");
		}
	}
}
