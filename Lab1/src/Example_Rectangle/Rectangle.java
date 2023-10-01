package Example_Rectangle;

public class Rectangle {

	public int length;
	public int width;
	
	public int calPeripheral() {
		int peripheral = (this.length + this.width)*2;
		return peripheral;
	}
	
	public int calArea() {
		int area = this.length * this.width;
		return area;
	}
	
}
