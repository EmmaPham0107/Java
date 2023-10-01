package Practice2;

import java.util.Scanner;

public class NhanVien extends Person {
	
	String phongBan;
	String chucVu;

	public NhanVien() {};

	public String getphongBan() {
		return phongBan;
	}
	public void setphongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getchucVu() {
		return chucVu;
	}
	public void setchucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public void nhapThongTinNhanVien (Scanner input) {
		super.nhapThongTin(input);
		System.out.print("Nhap phong ban: ");
		phongBan = input.nextLine();
		System.out.print("Nhap chuc vu: ");
		chucVu = input.nextLine();
	}
	
}
