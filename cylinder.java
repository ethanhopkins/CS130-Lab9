
public class cylinder {
	private double radius;
	private double height;
	
	//Constructor
	public cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	
	//Getters
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	//Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Functions
	public double areaCyl() {
		double area = 2 * Math.PI * radius * height + 2 * Math.PI
				* Math.pow(radius, 2);
		return area;
	}
	
	public double volCyl() {
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder c1 = new cylinder(10, 5);
		
		System.out.println("area: " + c1.areaCyl());
		System.out.println("volume: " + c1.volCyl());
	}

}
