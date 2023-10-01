package Practice2;

import java.util.Scanner;

public class Person {

	protected String hoTen;
	protected String gioiTinh;
	protected String queQuan;
	protected int namSinh;
	public Person() {};
	
	public String gethoTen() {
		return hoTen;
	}
	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getgioiTinh() {
		return gioiTinh;
	}
	public void setgioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getqueQuan() {
		return queQuan;
	}
	public void setqueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public int getnamSinh(int namSinh) {
		return namSinh;
	}
	public void setnamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String toString() {
		return "Ho Ten: " + hoTen + " " + "Gioi tinh: " + gioiTinh + " " + "Que quan: " + queQuan + " " + "Nam sinh: " + namSinh;
	}
	public void hienThiThongTin() {
		System.out.print(this);
	}
	public void nhapThongTin(Scanner input) {
		System.out.print("Nhap ho ten: ");
		hoTen = input.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = input.nextLine();
		System.out.print("Nhap que quan: ");
		queQuan = input.nextLine();
		System.out.print("Nhap nam sinh: ");
		namSinh = Integer.parseInt(input.nextLine());
	}
	
}
