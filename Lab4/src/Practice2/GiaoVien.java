package Practice2;

import java.util.Scanner;

public class GiaoVien extends Person implements I_hienThi {
	
	private String lopDangChuNhiem;
	private String tenBoMon;
	private String thoiKhoaBieuLichDay;

	public GiaoVien() {};
	
	public String getlopDangChuNhiem() {
		return lopDangChuNhiem;
	}
	public void setlopDangChuNhiem(String lopDangChuNhiem) {
		this.lopDangChuNhiem = lopDangChuNhiem;
	}
	public String gettenBoMon() {
		return tenBoMon;
	}
	public void settenBoMon(String tenBoMon) {
		this.tenBoMon = tenBoMon;
	} 
	public String getthoiKhoaBieuLichDay() {
		return thoiKhoaBieuLichDay;
	}
	public void setthoiKhoaBieuLichDay(String thoiKhoaBieuLichDay) {
		this.thoiKhoaBieuLichDay = thoiKhoaBieuLichDay;
	}

	@Override
	public void hienThiThoiKhoaBieu() {
		System.out.println(thoiKhoaBieuLichDay);
	}

	@Override
	public void hienThiThongTinLop() {
		System.out.println(lopDangChuNhiem);
	} 
	
	public void nhapThongTinGiaoVien (Scanner input) {
		super.nhapThongTin(input);
		System.out.print("Nhap thoi khoa bieu lich day: ");
		thoiKhoaBieuLichDay = input.nextLine();
		System.out.print("Nhap ten bo mon: ");
		tenBoMon = input.nextLine();
		System.out.print("Nhap lop dang chu nhiem: ");
		lopDangChuNhiem = input.nextLine();
	}
}
