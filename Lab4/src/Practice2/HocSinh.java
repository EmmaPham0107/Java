package Practice2;

import java.util.Scanner;

public class HocSinh extends Person implements I_hienThi {
	
	
	private String thoiKhoaBieuLichHoc;
	private String giaoVienChuNhiem;
	private String lop;
	
	public HocSinh() {};
	
	public String getthoiKhoaBieuLichHoc() {
		return thoiKhoaBieuLichHoc;
	}
	public void setthoiKhoaBieuLichHoc(String thoiKhoaBieuLichHoc) {
		this.thoiKhoaBieuLichHoc = thoiKhoaBieuLichHoc;
	}
	public String getgiaoVienChuNhiem() {
		return giaoVienChuNhiem;
	}
	public void setgiaoVienChuNhiem(String giaoVienChuNhiem) {
		this.giaoVienChuNhiem = giaoVienChuNhiem;
	}
	public String getlop() {
		return lop;
	}
	public void setlop(String lop) {
		this.lop = lop;
	}

	@Override
	public void hienThiThoiKhoaBieu() {
		System.out.println(thoiKhoaBieuLichHoc);
		
	}

	@Override
	public void hienThiThongTinLop() {
		System.out.println(lop);
	}
	
	public void nhapThongTinHocSinh (Scanner input) {
		super.nhapThongTin(input);
		System.out.print("Nhap thoi khoa bieu lich hoc: ");
		thoiKhoaBieuLichHoc = input.nextLine();
		System.out.print("Nhap giao vien chu nhiem: ");
		giaoVienChuNhiem = input.nextLine();
		System.out.print("Nhap lop dang theo hoc: ");
		lop = input.nextLine();
	}	
}
