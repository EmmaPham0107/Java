package Lab3_2.Lab3_2ex;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public User(int id, String firstName, String lastName) {
		setId(id);
		setfirstName(firstName);
		setlastName(lastName);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
}
