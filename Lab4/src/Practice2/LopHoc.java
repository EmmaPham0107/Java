package Practice2;

import java.util.Scanner;

public class LopHoc {
	
	private String tenLop;
	private int siSo;
	private int khoi;
	public LopHoc() {};
	public String gettenLop() {
		return tenLop;
	}
	public void settenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public int getsiSo() {
		return siSo;
	}
	public void setsiSo(int siSo) {
		this.siSo = siSo;
	}
	public int getkhoi() {
		return khoi;
	}
	public void setkhoi(int khoi) {
		this.khoi = khoi;
	}
	public String toString() {
		return "Ten Lop: " + tenLop + "\r\n" + "Si so: " + siSo + "\r\n" + "Khoi: " + khoi;
	}
	public void nhapThongTin(Scanner input) {
		System.out.print("Nhap ten lop: ");
		tenLop = input.nextLine();
		System.out.print("Nhap si so: ");
		siSo = Integer.parseInt(input.nextLine());
		System.out.print("Nhap khoi: ");
		khoi = Integer.parseInt(input.nextLine());
	}

}
