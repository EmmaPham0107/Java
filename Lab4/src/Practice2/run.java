package Practice2;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		LopHoc A = new LopHoc();
		A.nhapThongTin(input);
		System.out.print(A);
		input.nextLine();
		
		HocSinh HS = new HocSinh();
		HS.nhapThongTinHocSinh(input);
		System.out.print(HS);
		input.nextLine();
		
		GiaoVien GV = new GiaoVien();
		GV.nhapThongTinGiaoVien(input);
		System.out.print(GV);
		input.nextLine();
		
		NhanVien nvBaoVe = new NhanVien();
		nvBaoVe.nhapThongTinNhanVien(input);
		System.out.println(nvBaoVe);
		System.out.println();
		
		System.out.print("Thoi khoa bieu lich hoc: ");
		HS.hienThiThoiKhoaBieu();
		System.out.print("Lop dang theo hoc: ");
		HS.hienThiThongTinLop();
		System.out.print("Thoi khoa bieu lich day: ");
		GV.hienThiThoiKhoaBieu();
		System.out.print("Lop dang chu nhiem: ");
		GV.hienThiThongTinLop();
		
	}

}
