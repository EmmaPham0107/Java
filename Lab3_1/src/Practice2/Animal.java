package Practice2;

public class Animal {

	private String name;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	Animal (String name, int weight){
		setName(name);
		setWeight(weight);
	}
}
