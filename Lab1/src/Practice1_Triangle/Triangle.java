package Practice1_Triangle;

public class Triangle {

	public int a;
	public int b;
	public int c;
	
	public int calPeripheral() {
		int peripheral = this.a + this.b + this.c;
		return peripheral;
	}
	
	public float calArea() {
		float p = (this.a + this.b + this.c)/2;
		float area = (float) Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
		return area;
	}
	
}
