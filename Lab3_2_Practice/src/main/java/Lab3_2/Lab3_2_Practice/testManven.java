package Lab3_2.Lab3_2_Practice;

import java.io.FileOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class testManven {
	
	public static void writetoExcelFile(ArrayList<Employee> data) {
		
		//tao workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//tao worksheet
		XSSFSheet sheet = workbook.createSheet("Employee Detail");
		//tao title
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("MA NHAN VIEN");
		cell = row.createCell(1);
		cell.setCellValue("HO TEN");
		cell = row.createCell(2);
		cell.setCellValue("GIOI TINH");
		cell = row.createCell(3);
		cell.setCellValue("NAM SINH");
		cell = row.createCell(4);
		cell.setCellValue("QUE QUAN");
		cell = row.createCell(5);
		cell.setCellValue("TEN PHONG BAN");
		cell = row.createCell(6);
		cell.setCellValue("LUONG");
		//tao data
		for (int i=0; i<data.size(); i++) {
			Employee e = data.get(i);
			XSSFRow dataRow = sheet.createRow(i+1);
			XSSFCell dataCell = dataRow.createCell(0);
			dataCell.setCellValue(String.valueOf(e.getID()));
			dataCell = dataRow.createCell(1);
			dataCell.setCellValue(e.getfullName());
			dataCell = dataRow.createCell(2);
			dataCell.setCellValue(e.getgender());
			dataCell = dataRow.createCell(3);
			dataCell.setCellValue(String.valueOf(e.getyearofBirth()));
			dataCell = dataRow.createCell(4);
			dataCell.setCellValue(e.gethomeTown());
			dataCell = dataRow.createCell(5);
			dataCell.setCellValue(e.getdept());
			dataCell = dataRow.createCell(6);
			dataCell.setCellValue(String.valueOf(e.getsalary()));
		}
		try {
			FileOutputStream out = new FileOutputStream (new File("/Users/emma/Desktop/Learn/Funix - Tester/Kiểm thử tự động/Lab/Lab 3.2/DSnhanvien.xlsx"));
			workbook.write(out);
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("The number of employees N = ");
		int N = Integer.parseInt(input.nextLine());
		
		ArrayList<Employee> data = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			int ID = i + 1;
			System.out.print("Enter full name [" + i + "]: ");
			String fullName = input.nextLine();
			System.out.print("Enter gender [" + i + "]: ");
			String gender = input.nextLine();
			System.out.print("Enter year of birth [" + i + "]: ");
			int yearofBirth = Integer.parseInt(input.nextLine());
			System.out.print("Enter hometown [" + i + "]: ");
			String homeTown = input.nextLine();
			System.out.print("Enter department [" + i + "]: ");
			String dept = input.nextLine();
			System.out.print("Enter Salary [" + i + "]: ");
			int salary = input.nextInt();
			input.nextLine();
			Employee e = new Employee(ID, fullName, gender, yearofBirth, homeTown, dept, salary);
			data.add(e);
		}
		writetoExcelFile(data);
	}

}
