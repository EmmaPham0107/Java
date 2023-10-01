package Lab3_2.Lab3_2_Practice;

public class Employee {
	private int ID;
	private String fullName;
	private String gender;
	private int yearofBirth;
	private String homeTown;
	private String dept;
	private int salary;
	
	public Employee (int ID, String fullName, String gender, int yearofBirth, String homeTown,String dept,int salary) {
		setID (ID);
		setfullName (fullName);
		setgender (gender);
		setyearofBirth (yearofBirth);
		sethomeTown (homeTown);
		setdept (dept);
		setsalary(salary);
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public int getyearofBirth() {
		return yearofBirth;
	}
	public void setyearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	public String gethomeTown() {
		return homeTown;
	}
	public void sethomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.ID = salary;
	}
	
}
