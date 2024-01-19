package com.basic.bai3;
import java.text.SimpleDateFormat;

public class Student {
	private String fullName;
	private String address;
	private String dob;
	private String gender;
	private float finalGrade;
	
	public Student (String fullName, String address, String dob, String gender, float finalGrade) {
		
		this.setfullName(fullName);
		this.setaddress(address);
		this.setdob(dob);
		this.setgender(gender);
		this.setfinalGrade(finalGrade);
	}
	
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName = fullName; 
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address; 
	}
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		
		try {
			new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			}
			catch (Exception e) {
				System.out.println("Vui long nhap ngay thang nam sinh theo dinh dang dd/mm/yyyy!");
				e.printStackTrace();
			}
		this.dob = dob; 
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender; 
	}
	public float getfinalGrade() {
		return finalGrade;
	}
	public void setfinalGrade(float finalGrade) {
		this.finalGrade = finalGrade; 
	}
}
