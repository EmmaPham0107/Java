package Practice3_Circle;

public class Circle {

	public int R;
	public float PI = 3.14f;
	
	public float calPeripheral() {
		float peripheral = 2 * PI * this.R;
		return peripheral;
	}
	
	public float calArea() {
		float area = PI * this.R * this.R;
		return area;
	}
}
