package Practice;

public class Practice5_String {

	public static void main(String[] args) {
		String s = "xinchao";
		String s1 = s.substring(0,1).toUpperCase();
		String s2 = s.substring(1);
		String newS = s1+s2;
		System.out.print(newS);
	}

}
