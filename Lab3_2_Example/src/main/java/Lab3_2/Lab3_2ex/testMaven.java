package Lab3_2.Lab3_2ex;

import java.io.FileOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testMaven {
	
	public static void writetoExcelFile(ArrayList<User> data) {
		//tao workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//tao worksheet moi tu workbook
		XSSFSheet sheet = workbook.createSheet("User Details");
		
		//tao title
		XSSFRow titlerow = sheet.createRow(0);
		XSSFCell cell = titlerow.createCell(0);
		cell.setCellValue("ID");
		cell = titlerow.createCell(1);
		cell.setCellValue("FIRSTNAME");
		cell = titlerow.createCell(2);
		cell.setCellValue("LASTNAME");
		//nhap data
		for (int i=0; i<data.size(); i++) {
			User u = data.get(i);
			XSSFRow localRow = sheet.createRow(i+1);
			XSSFCell localCell = localRow.createCell(0);
			localCell.setCellValue(String.valueOf(u.getId()));
			localCell = localRow.createCell(1);
			localCell.setCellValue(u.getfirstName());
			localCell = localRow.createCell(2);
			localCell.setCellValue(u.getlastName());			
		}
		//ghi data
		try {
			FileOutputStream out = new FileOutputStream(new File("/Users/emma/Desktop/Learn/Funix - Tester/Kiểm thử tự động/Lab/Lab 3.2/Ex_Data.xlsx"));
			workbook.write(out);
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Users N = ");
		int N = Integer.parseInt(input.nextLine());
		
		ArrayList<User> data = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			System.out.print("Enter First name: ");
			String firstName = input.nextLine();
			System.out.print("Enter Last name: ");
			String lastName = input.nextLine();
			User u = new User(i+1, firstName, lastName);
			data.add(u);
		}
		writetoExcelFile(data);
	}

}
